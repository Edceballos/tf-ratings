package com.drf.tf.ratings.service;

import org.springframework.stereotype.Service;

/**
 * Created by eceballos on 10/05/2016.
 */
public interface IAlerterService {
	/**
	 * Sends an alert with <strong>ERROR</strong> severity.
	 *
	 * @param alertText String -- The alert text to be sent.
	 */
	public void sendErrorAlert(String alertText);

	public void sendErrorAlert(String alertText, Exception ex);

	/**
	 * Sends an alert with <strong>INFO</strong> severity.
	 *
	 * @param alertText String -- The alert text to be sent
	 */
	public void sendInfoAlert(String alertText);

	/**
	 * Sends an alert with <strong>WARN</strong> severity.
	 *
	 * @param alertText String -- The alert text to be sent
	 */
	public void sendWarnAlert(String alertText);


}
