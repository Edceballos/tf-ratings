package com.drf.tf.ratings.rest;

import com.drf.tf.ratings.process.StartersPPsProcessor;
import com.drf.tf.ratings.service.IAlerterService;
import com.drf.tf.ratings.service.StartersPPsService;
import org.apache.commons.codec.binary.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by eceballos on 10/05/2016.
 */
@Service
public class RestRunnerService {
	protected final Logger log = LoggerFactory.getLogger(getClass());
	@Value ("${rest.baseurl}")	private  String baseUrl;
	@Value("${rest.dateformat}") private String rDateFormat;
	@Value("${processor.days-ahead}") private Integer daysAhead;
	@Value("${processor.source-csv-file}") private String sourceCsvFile;
	private RestTemplate restTemplate;
	@Autowired
	private StartersPPsService startersPPsService ;
	private IAlerterService iAlerterService;
	private String startDate;
	private String endDate;

	@Autowired
	public RestRunnerService (RestTemplate restTemplate, IAlerterService iAlerterService) {
		this.restTemplate = restTemplate;
		this.iAlerterService = iAlerterService;
	}

	public void run()  {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat(rDateFormat);
		String tracksDate= sdf.format(date);
		setStartDate(tracksDate);
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DATE, this.daysAhead);
		setEndDate(sdf.format(c.getTime()));
		log.debug("Acquired base url from properties: " + baseUrl + tracksDate);
		log.debug("Ready to process tracks entity: " + baseUrl + tracksDate);
		StartersPPsProcessor sp = new StartersPPsProcessor();
		try{
			sp.processTracks(restTemplate,getBaseUrl(),getStartDate(),getEndDate(),rDateFormat,startersPPsService,sourceCsvFile);
		}
		catch (Exception ex){
			iAlerterService.sendErrorAlert("Error while processing TF Ratings ", ex);
		}
	}

	public String getBaseUrl() {
		return baseUrl;
	}
	public String getStartDate () {
		return startDate;
	}
	public void setStartDate (String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate () {
		return endDate;
	}
	public void setEndDate (String endDate) {
		this.endDate = endDate;
	}
}
