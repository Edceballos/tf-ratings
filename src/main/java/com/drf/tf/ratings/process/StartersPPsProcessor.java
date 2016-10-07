package com.drf.tf.ratings.process;

import au.com.bytecode.opencsv.CSVReader;
import com.drf.tf.ratings.domain.StarterPPsEntity;
import com.drf.tf.ratings.dto.StarterPPs;
import com.drf.tf.ratings.service.StartersPPsRepository;
import com.drf.tf.ratings.service.StartersPPsService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;

import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by eceballos on 10/05/2016.
 */
public class StartersPPsProcessor {
	private String baseUrl = null;
	private String runDate = null;
	private RestTemplate restTemplate;
	private StartersPPsService startersPPsService;
	private SimpleDateFormat sdf;
	private String strMsg = null;
	final Logger log = LoggerFactory.getLogger(getClass());
	public StartersPPsProcessor() {
		//Empty Constructor so it can be instantiated and followed process
	}
	public  void processTracks (RestTemplate restTemplate, String baseUrl, String startDate, String endDate, String rDateFormat,
								StartersPPsService startersPPsService, String sourceCsvFile) throws Exception {

		this.startersPPsService = startersPPsService;
		this.sdf = new SimpleDateFormat(rDateFormat);
		Date start = this.sdf.parse(startDate);
		Date end = this.sdf.parse(endDate);
		GregorianCalendar gcal = new GregorianCalendar();
		gcal.setTime(start);
		setBaseUrl(baseUrl);
		setRestTemplate(restTemplate);
		CSVReader reader = null;
//		try {
			reader = new CSVReader(new FileReader(sourceCsvFile));
			String[] line;
			while (!gcal.getTime().after(end)) {
				setRunDate(sdf.format(gcal.getTime()).toString() );
				log.info("Starting pass, runDate:  " + runDate.toString());
				while ((line = reader.readNext()) != null) {
//					try {
						if (! line[0].startsWith("StarterID")) {
							String starterId =  line[0];
							log.info("Csv Line : StarterId:" + line[0] + " HorseName: " + line[1]);
							log.info("End Point URI : " + baseUrl + starterId);

							StarterPPs starterPPs = restTemplate.getForObject(baseUrl + starterId , StarterPPs.class);
//							StarterPPs[] starterPPs = restTemplate.getForObject("https://api.timeformus.com/Services/Data/RaceStarter/1725518", StarterPPs[].class);
//							String result = restTemplate.getForObject(baseUrl + "{starterId}", String.class,starterId);
							System.out.println("EDGAR");
//							System.out.println(result);
							this.strMsg = "";
						}
//					} catch (Exception ex) {
//						log.error("Error encountered while processing URL: " + baseUrl + runDate + "\n" + this.strMsg, ex);
//					}
				}
					gcal.add(Calendar.DATE, 1);
			}
			if (!this.strMsg.equals("")){	throw new Exception(this.strMsg);}

//		} catch (Exception e) {
//			log.error("Error reading csv file: " + sourceCsvFile ) ;
//			log.error(e.getMessage());
//		}

	}
	public String getBaseUrl() {
		return baseUrl;
	}

	public void setBaseUrl(String baseUrl) {
		this.baseUrl = baseUrl;
	}

	public String getRunDate () {
		return runDate;
	}

	public void setRunDate (String runDate) {
		this.runDate = runDate;
	}

	public RestTemplate getRestTemplate() {
		return restTemplate;
	}

	public void setRestTemplate(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	private void populateEntriesEntity (StarterPPsEntity starterPPsEntity, StarterPPs[] trks, int i, int x, int y ) throws Exception {

	}

}
