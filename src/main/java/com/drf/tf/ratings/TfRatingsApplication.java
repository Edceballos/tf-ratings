package com.drf.tf.ratings;

import com.drf.tf.ratings.rest.RestRunnerService;
import com.drf.tf.ratings.service.IAlerterService;
import org.apache.commons.codec.binary.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.jdbc.datasource.init.ScriptParseException;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;

@SpringBootApplication
@EnableScheduling
public class TfRatingsApplication {
	@Value("${scheduler.enable}")
	private Boolean enableScheduler;
	protected final Logger log = LoggerFactory.getLogger(getClass());
	@Value ("${rest.username}")
	private String username;
	@Value("${rest.password}")
	private String password;

	@Autowired
	private RestRunnerService restRunnerService;

	private IAlerterService iAlerterService;

	@Autowired
	public TfRatingsApplication(IAlerterService iAlerterService) {
		this.iAlerterService = iAlerterService;
	}

	public static void main(String[] args) {
		SpringApplication.run(TfRatingsApplication.class, args);
	}

	@Bean
	public RestTemplate makeRestTemplate() {
		RestTemplate restTemplate = new RestTemplate();
		final String authorization = createAuthorization();
		ClientHttpRequestInterceptor interceptor = new ClientHttpRequestInterceptor() {
			@Override
			public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution) throws IOException {
				HttpHeaders httpHeaders = request.getHeaders();
				httpHeaders.set(HttpHeaders.AUTHORIZATION,authorization);
				return execution.execute(request, body);
			}
		};
		restTemplate.setInterceptors(Arrays.asList(interceptor));
		return restTemplate;
	}
//	@Bean
//	public RestTemplate makeRestTemplate() {
//		RestTemplate                 restTemplate  = new RestTemplate();
//		String                       authorization = createAuthorization();
//		ClientHttpRequestInterceptor interceptor   = (request, body, execution) -> {
//			request.getHeaders().set(HttpHeaders.AUTHORIZATION,authorization);
//			return execution.execute(request, body);
//		};
//		restTemplate.setInterceptors(Arrays.asList(interceptor));
//		return restTemplate;
//	}

	private String createAuthorization() {
		String auth = username + ":" + password;
		byte[] encodedAuth = Base64.encodeBase64(auth.getBytes(Charset.forName("US-ASCII")));
		return "Basic " + new String(encodedAuth);
//		return "Basic " + auth;
	}

	//	@Scheduled (cron = "0,30 * * * * *")
	@Scheduled (fixedDelayString  ="${scheduler.fixedDelayString}")
	private void cronRunner (){
		if (this.enableScheduler==true) {
			try {
				restRunnerService.run();
			}catch(ScriptParseException prx){
				iAlerterService.sendErrorAlert("Error encountered: ", prx);
			}
		}else{
			log.info("Scheduler is now disabled");

		}
	}
}
