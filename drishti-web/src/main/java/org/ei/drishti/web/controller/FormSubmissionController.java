package org.ei.drishti.web.controller;

import static ch.lambdaj.collection.LambdaCollections.with;
import static ch.lambdaj.collection.LambdaCollections.with;
import static ch.lambdaj.collection.LambdaCollections.with;
import ch.lambdaj.function.convert.Converter;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.text.MessageFormat;
import static java.text.MessageFormat.format;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.ei.drishti.common.util.HttpAgent;
import org.ei.drishti.common.util.HttpResponse;
import org.ei.drishti.domain.Multimedia;
import org.ei.drishti.dto.ANMVillagesDTO;
import org.ei.drishti.dto.VillagesDTOTest;
import org.ei.drishti.dto.form.FormSubmissionDTO;
import org.ei.drishti.dto.form.MultimediaDTO;
import org.ei.drishti.event.FormSubmissionEvent;
import org.ei.drishti.form.domain.FormSubmission;
import org.ei.drishti.form.service.FormSubmissionConverter;
import org.ei.drishti.form.service.FormSubmissionService;
import org.ei.drishti.service.MultimediaService;

import org.json.JSONException;
import org.motechproject.scheduler.gateway.OutboundEventGateway;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import static org.springframework.http.HttpStatus.*;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FormSubmissionController {

    private static Logger logger = LoggerFactory.getLogger(FormSubmissionController.class.toString());
    private FormSubmissionService formSubmissionService;
    private HttpAgent httpAgent;
    private final String drishtiformdataURL;
    private OutboundEventGateway gateway;

    private MultimediaService multimediaService;

    @Autowired
    public FormSubmissionController(@Value("#{drishti['drishti.form.data.url']}") String drishtiformdataURL,
            HttpAgent httpAgent,
            FormSubmissionService formSubmissionService,
            MultimediaService multimediaService,
            OutboundEventGateway gateway) {
        this.formSubmissionService = formSubmissionService;
        this.gateway = gateway;
        this.drishtiformdataURL = drishtiformdataURL;
        this.httpAgent = httpAgent;
        this.multimediaService=multimediaService;

    }
//    @RequestMapping(method = GET, value = "/form-submissions")
//    @ResponseBody
//    private List<FormSubmissionDTO> getNewSubmissionsForANM(@RequestParam("anm-id") String anmIdentifier,
//                                                            @RequestParam("timestamp") Long timeStamp,
//                                                            @RequestParam(value = "batch-size", required = false)
//                                                            Integer batchSize) {
//        List<FormSubmission> newSubmissionsForANM = formSubmissionService
//                .getNewSubmissionsForANM(anmIdentifier, timeStamp, batchSize);
//        return with(newSubmissionsForANM).convert(new Converter<FormSubmission, FormSubmissionDTO>() {
//            @Override
//            public FormSubmissionDTO convert(FormSubmission submission) {
//                return FormSubmissionConverter.from(submission);
//            }
//        });
//    }

    @RequestMapping(method = GET, value = "/form-submissions")
    @ResponseBody
    public List<FormSubmissionDTO> getNewSubmissionsForANM(
            @RequestParam("anm-id") String anmIdentifier,
            @RequestParam("village") String anmVillage,
            @RequestParam("timestamp") Long timeStamp,
            @RequestParam(value = "batch-size", required = false) Integer batchSize) {
        logger.info("***** from controller&&&&&");
//        HttpResponse response = new HttpResponse(false, null);
        List<FormSubmission> newSubmissionsForANM = null;

        newSubmissionsForANM = formSubmissionService
                .getNewSubmissionsForANM(anmVillage, timeStamp, batchSize);

        logger.info("details of data from db********" + newSubmissionsForANM);

        return with(newSubmissionsForANM).convert(
                new Converter<FormSubmission, FormSubmissionDTO>() {
                    @Override
                    public FormSubmissionDTO convert(FormSubmission submission) {
                        return FormSubmissionConverter.from(submission);
                    }
                });
    }

    @RequestMapping(method = GET, value = "/all-form-submissions")
    @ResponseBody
    public List<FormSubmissionDTO> getAllFormSubmissions(@RequestParam("timestamp") Long timeStamp,
            @RequestParam(value = "batch-size", required = false) Integer batchSize) {
        List<FormSubmission> allSubmissions = formSubmissionService
                .getAllSubmissions(timeStamp, batchSize);
        return with(allSubmissions).convert(new Converter<FormSubmission, FormSubmissionDTO>() {
            @Override
            public FormSubmissionDTO convert(FormSubmission submission) {
                return FormSubmissionConverter.from(submission);
            }
        });
    }

    @RequestMapping(headers = {"Accept=application/json"}, method = POST, value = "/form-submissions")
    public ResponseEntity<HttpStatus> submitForms(
            @RequestBody List<FormSubmissionDTO> formSubmissionsDTO) {
        String url = drishtiformdataURL;
        String formData = "formdata";
        String formdetails = new Gson().toJson(formSubmissionsDTO);
        try {
            if (formSubmissionsDTO.isEmpty()) {
                return new ResponseEntity<>(BAD_REQUEST);
            }
            httpAgent.post(url + "/" + formData, formdetails, "application/json");
            gateway.sendEventMessage(new FormSubmissionEvent(formSubmissionsDTO).toEvent());
            logger.debug(format("Added Form submissions to queue.\nSubmissions: {0}", formSubmissionsDTO));
        } catch (Exception e) {
            logger.error(format("Form submissions processing failed with exception {0}.\nSubmissions: {1}", e, formSubmissionsDTO));
            return new ResponseEntity<>(INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(CREATED);
    }

    @RequestMapping(headers = {"Accept=application/json"}, method = GET, value = "/multimedia-file")
    @ResponseBody
    public List<MultimediaDTO> getFiles(@RequestParam("anm-id") String providerId) {
        logger.info("Get Multimedia file");

        List<Multimedia> allMultimedias = multimediaService.getMultimediaFiles(providerId);

        return with(allMultimedias).convert(new Converter<Multimedia, MultimediaDTO>() {
            @Override
            public MultimediaDTO convert(Multimedia md) {
                return new MultimediaDTO(md.getCaseId(), md.getProviderId(), md.getContentType(), md.getFilePath(), md.getFileCategory());
            }
        });
    }

    @RequestMapping(headers = {"Accept=multipart/form-data"}, method = RequestMethod.POST, value = "/multimedia-file")
    public ResponseEntity<String> uploadFiles(@RequestParam("anm-id") String providerId, @RequestParam("entity-id") String entityId, @RequestParam("content-type") String contentType, @RequestParam("file-category") String fileCategory, @RequestParam("file") MultipartFile file) {
        logger.info("post request method");
        MultimediaDTO multimediaDTO = new MultimediaDTO(entityId, providerId, contentType, null, fileCategory);

        String status = multimediaService.saveMultimediaFile(multimediaDTO, file);
        String[] status1 = status.split(":");

        if ((status1[0]).equalsIgnoreCase("success")) {
            return new ResponseEntity<>(new Gson().toJson(status1[1]), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(new Gson().toJson("fail"), HttpStatus.OK);
        }
    }
}
