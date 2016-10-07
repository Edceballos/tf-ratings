package com.drf.tf.ratings.domain;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

/**
 * Created by eceballos on 10/04/2016.
 */
@Embeddable
@Access (AccessType.FIELD)
public class StarterPPsPKeys  implements Serializable {
 		private BigInteger starterId = null;
		private Boolean foreignRace = false;
		private Integer careerRaceNumber = null;
		private String registrationNumber = null;
		private Date raceDate  = null;
		private Integer raceNumber = null;
		private String trackId = null;
}
