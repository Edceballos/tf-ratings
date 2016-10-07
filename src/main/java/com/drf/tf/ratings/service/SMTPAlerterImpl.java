package com.drf.tf.ratings.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

/**
 * Created by eceballos on 10/05/2016.
 */
@Service
public class SMTPAlerterImpl implements IAlerterService {
	final Logger log = LoggerFactory.getLogger(getClass());
	@Value ("${alerter.from}")
	private String from;

	@Value ("${alerter.recipients}")
	private String recipients;

	@Value ("${alerter.smtp-host}")
	private String smtpHost;

	@Override
	public void sendErrorAlert(String alertText) {
		_send("TF_RATINGS_ERROR: " + alertText.substring(0, 10) + ((alertText.length() > 10) ? "..." : ""), alertText);
	}

	@Override
	public void sendErrorAlert(String alertText, Exception ex) {
		java.io.StringWriter swtr = new java.io.StringWriter();
		java.io.PrintWriter pwtr = new java.io.PrintWriter(swtr);

		ex.printStackTrace(pwtr);

		_send("TF_RATINGS_ERROR", alertText + "\n" + swtr.toString());
	}

	@Override
	public void sendInfoAlert(String alertText) {
		_send("TF_RATINGS_INFO: " + alertText.substring(0, 10) + ((alertText.length() > 10) ? "..." : ""), alertText);	}

	@Override
	public void sendWarnAlert(String alertText) {
		_send("TF_RATINGS_WARNING: " + alertText.substring(0, 10) + ((alertText.length() > 10) ? "..." : ""), alertText);
	}

	private void _send(String subject, String message){
		try{

			String from 		= this.from ;//"TF_RATINGS@drf.com";
			String[] recipients = this.recipients.split(",");//"eceballos@drf.com".split(",");
			String smtpHost 	= this.smtpHost;//"pmta.drf.corp";
			//Set the host smtp address
			Properties props = new Properties();
			props.put("mail.smtp.host", smtpHost);

			// create some properties and get the default Session
			Session session = Session.getDefaultInstance(props, null);
			session.setDebug(false);

			// create a message
			Message msg = new MimeMessage(session);

			// set the from and to address
			InternetAddress addressFrom = new InternetAddress(from);
			msg.setFrom(addressFrom);

			InternetAddress[] addressTo = new InternetAddress[recipients.length];
			for (int i = 0; i < recipients.length; i++)
			{
				addressTo[i] = new InternetAddress(recipients[i]);
			}
			msg.setRecipients(Message.RecipientType.TO, addressTo);

			// Optional : You can also set your custom headers in the Email if you Want
			msg.addHeader("MyHeaderName", "myHeaderValue");

			// Setting the Subject and Content Type
			msg.setSubject(subject);
			msg.setContent(message, "text/plain");
			Transport.send(msg);
		}
		catch(AddressException ax){
			log.error("Cannot send a SMTP alert.", ax);
		} catch (MessagingException e) {
			log.error("Cannot send a SMTP alert.", e);
		}
	}
}
