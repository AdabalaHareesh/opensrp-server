package org.ei.drishti.web.controller;

import static ch.lambdaj.collection.LambdaCollections.with;
import static ch.lambdaj.collection.LambdaCollections.with;
import static ch.lambdaj.collection.LambdaCollections.with;
import static ch.lambdaj.collection.LambdaCollections.with;
import static ch.lambdaj.collection.LambdaCollections.with;
import static ch.lambdaj.collection.LambdaCollections.with;
import static ch.lambdaj.collection.LambdaCollections.with;
import static ch.lambdaj.collection.LambdaCollections.with;
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
import org.ei.drishti.dto.ANMVillagesDTO;
import org.ei.drishti.dto.VillagesDTO;
import org.ei.drishti.dto.form.FormSubmissionDTO;
import org.ei.drishti.event.FormSubmissionEvent;
import org.ei.drishti.form.domain.FormSubmission;
import org.ei.drishti.form.service.FormSubmissionConverter;
import org.ei.drishti.form.service.FormSubmissionService;
import org.ei.drishti.web.handler.FormsubmissionHandler;
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
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FormSubmissionController {

    private static Logger logger = LoggerFactory.getLogger(FormSubmissionController.class.toString());
    private FormSubmissionService formSubmissionService;
    private HttpAgent httpAgent;
    private final String drishtiANMVillagesURL;
    private OutboundEventGateway gateway;
    private FormsubmissionHandler drishtiform;

    @Autowired
    public FormSubmissionController(@Value("#{drishti['drishti.anm.village.url']}") String drishtiANMVillagesURL,
            HttpAgent httpAgent,FormsubmissionHandler drishtiform,
            FormSubmissionService formSubmissionService,
            OutboundEventGateway gateway) {
        this.formSubmissionService = formSubmissionService;
        this.gateway = gateway;
        this.drishtiANMVillagesURL = drishtiANMVillagesURL;
        this.httpAgent=httpAgent;
        this.drishtiform = drishtiform;

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
    private List<FormSubmissionDTO> getNewSubmissionsForANM(
            @RequestParam("anm-id") String anmIdentifier,
            @RequestParam("timestamp") Long timeStamp,
            @RequestParam(value = "batch-size", required = false) Integer batchSize) {
        logger.info("***** from controller&&&&&");
        HttpResponse response = new HttpResponse(false, null);
        List<FormSubmission> newSubmissionsForANM = null;
        List<FormSubmission> permnewSubmissionsForANM = new ArrayList<FormSubmission>();

        try {
            String anmID = anmIdentifier;
            logger.info("******anm id*** " + anmID);
            logger.info("****** village URL " + drishtiANMVillagesURL);
            response = httpAgent.get(drishtiANMVillagesURL + "?anm-id=" + anmID);
            logger.info("********villages response***" + response);

            ANMVillagesDTO anmvillagesDTOs = new Gson().fromJson(response.body(),
                    new TypeToken<ANMVillagesDTO>() {
                    }.getType());
            logger.info("Fetched Villages for the ANM" + anmvillagesDTOs);

            List<String> listvillages = anmvillagesDTOs.villages();
            logger.info("list of villages" + listvillages);
            Iterator<String> iterator = listvillages.iterator();
            while (iterator.hasNext()) {
                String village = iterator.next();
                logger.info("one village from list*******  :" + village);

//        	  String village="kandukur";
                logger.info("***form-submission***" + village);
                newSubmissionsForANM = formSubmissionService
                        .getNewSubmissionsForANM(village, timeStamp, batchSize);
                logger.info("***form-submission detailes fetched***" + newSubmissionsForANM);
                permnewSubmissionsForANM.addAll(newSubmissionsForANM);

            }
        } catch (Exception e) {
            logger.error(MessageFormat.format("{0} occurred while fetching Village Details for anm. StackTrace: \n {1}", e));
        }

        logger.info("details of data from db********" + permnewSubmissionsForANM);

        return with(permnewSubmissionsForANM).convert(
                new Converter<FormSubmission, FormSubmissionDTO>() {
                    @Override
                    public FormSubmissionDTO convert(FormSubmission submission) {
                        return FormSubmissionConverter.from(submission);
                    }
                });
    }

    @RequestMapping(method = GET, value = "/all-form-submissions")
    @ResponseBody
    private List<FormSubmissionDTO> getAllFormSubmissions(@RequestParam("timestamp") Long timeStamp,
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

        try {
            if (formSubmissionsDTO.isEmpty()) {
                return new ResponseEntity<>(BAD_REQUEST);
            }
            logger.info("*****" + formSubmissionsDTO.size() + " : -----------");

            logger.info("** transfer data to handler*******");
            drishtiform.formData(formSubmissionsDTO);

            gateway.sendEventMessage(new FormSubmissionEvent(formSubmissionsDTO)
                    .toEvent());
            logger.debug(format(
                    "Added Form submissions to queue.\nSubmissions: {0}",
                    formSubmissionsDTO));
        } catch (JSONException | ParseException e) {
            logger.error(format(
                    "Form submissions processing failed with exception {0}.\nSubmissions: {1}",
                    e, formSubmissionsDTO));
            return new ResponseEntity<>(INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(CREATED);
    }
}
