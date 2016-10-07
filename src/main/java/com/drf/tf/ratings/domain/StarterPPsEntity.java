package com.drf.tf.ratings.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

/**
 * Created by eceballos on 10/04/2016.
 */
@Entity
@Table (name = "tf_ratings_start")
@IdClass (StarterPPsPKeys.class)
public class StarterPPsEntity  implements Serializable {
	@Id private Boolean starterId = null;
	@Id private Boolean foreignRace = false;
	@Id private Integer careerRaceNumber = null;
	@Id private String registrationNumber = null;
	@Id private Date raceDate  = null;
	@Id private Integer raceNumber = null;
	@Basic private String classRating = null;
	@Basic private String raceDescriptionText = null;
	@Id private String trackId = null;
	@Basic private String foreignCountryCode = null;
	@Basic private String country = null;
	@Basic private String foreignTrackName = null;
	@Basic private String programNumber = null;
	@Basic private String ageCondition = null;
	@Basic private String course = null;
	@Basic private String scheduledSurface = null;
	@Basic private String trackCondition = null;
	@Basic private String genderFlag = null;
	@Basic private String shortDistance = null;
	@Basic private String longDistance = null;
	@Basic private String aboutDistance = null;
	@Basic private BigDecimal purse = null;

	@Basic private BigDecimal minClaimPrice = null;
	@Basic private BigDecimal maxClaimPrice = null;
	@Basic private String raceMoney = null;
	@Basic private String claimingFlag  = null;
	@Basic private String claimIndicator = null;
	@Basic private String raceType = null;
	@Basic private String raceTypeDesc = null;
	@Basic private String eqRaceType = null;
	@Basic private String jockey = null;
	@Basic private Integer weight = null;
	@Basic private Boolean lasix = false;
	@Basic private Boolean lasixRed = false;
	@Basic private String frontWraps = null;
	@Basic private String blinkers = null;
	@Basic private String blinkersRed = null;
	@Basic private BigDecimal closingOdds = null;
	@Basic private String performanceFigure = null;
	@Basic private String performanceFigure_NW = null;
	@Basic private Integer positionAtFinish = null;
	@Basic private Integer behindLeader = null;
	@Basic private Integer distanceId = null;

	@Basic private String distanceUnit = null;
	@Basic private Integer postPosition = null;
	@Basic private Integer fieldSize = null;
	@Basic private String startCall  = null;
	@Basic private String call1 = null;
	@Basic private String call2 = null;
	@Basic private String call3 = null;
	@Basic private String finishPosition = null;
	@Basic private String raceComments = null;

	public Boolean getStarterId () {
		return starterId;
	}

	public void setStarterId (Boolean starterId) {
		this.starterId = starterId;
	}

	public Boolean getForeignRace () {
		return foreignRace;
	}

	public void setForeignRace (Boolean foreignRace) {
		this.foreignRace = foreignRace;
	}

	public Integer getCareerRaceNumber () {
		return careerRaceNumber;
	}

	public void setCareerRaceNumber (Integer careerRaceNumber) {
		this.careerRaceNumber = careerRaceNumber;
	}

	public String getRegistrationNumber () {
		return registrationNumber;
	}

	public void setRegistrationNumber (String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public Date getRaceDate () {
		return raceDate;
	}

	public void setRaceDate (Date raceDate) {
		this.raceDate = raceDate;
	}

	public Integer getRaceNumber () {
		return raceNumber;
	}

	public void setRaceNumber (Integer raceNumber) {
		this.raceNumber = raceNumber;
	}

	public String getClassRating () {
		return classRating;
	}

	public void setClassRating (String classRating) {
		this.classRating = classRating;
	}

	public String getRaceDescriptionText () {
		return raceDescriptionText;
	}

	public void setRaceDescriptionText (String raceDescriptionText) {
		this.raceDescriptionText = raceDescriptionText;
	}

	public String getTrackId () {
		return trackId;
	}

	public void setTrackId (String trackId) {
		this.trackId = trackId;
	}

	public String getForeignCountryCode () {
		return foreignCountryCode;
	}

	public void setForeignCountryCode (String foreignCountryCode) {
		this.foreignCountryCode = foreignCountryCode;
	}

	public String getCountry () {
		return country;
	}

	public void setCountry (String country) {
		this.country = country;
	}

	public String getForeignTrackName () {
		return foreignTrackName;
	}

	public void setForeignTrackName (String foreignTrackName) {
		this.foreignTrackName = foreignTrackName;
	}

	public String getProgramNumber () {
		return programNumber;
	}

	public void setProgramNumber (String programNumber) {
		this.programNumber = programNumber;
	}

	public String getAgeCondition () {
		return ageCondition;
	}

	public void setAgeCondition (String ageCondition) {
		this.ageCondition = ageCondition;
	}

	public String getCourse () {
		return course;
	}

	public void setCourse (String course) {
		this.course = course;
	}

	public String getScheduledSurface () {
		return scheduledSurface;
	}

	public void setScheduledSurface (String scheduledSurface) {
		this.scheduledSurface = scheduledSurface;
	}

	public String getTrackCondition () {
		return trackCondition;
	}

	public void setTrackCondition (String trackCondition) {
		this.trackCondition = trackCondition;
	}

	public String getGenderFlag () {
		return genderFlag;
	}

	public void setGenderFlag (String genderFlag) {
		this.genderFlag = genderFlag;
	}

	public String getShortDistance () {
		return shortDistance;
	}

	public void setShortDistance (String shortDistance) {
		this.shortDistance = shortDistance;
	}

	public String getLongDistance () {
		return longDistance;
	}

	public void setLongDistance (String longDistance) {
		this.longDistance = longDistance;
	}

	public String getAboutDistance () {
		return aboutDistance;
	}

	public void setAboutDistance (String aboutDistance) {
		this.aboutDistance = aboutDistance;
	}

	public BigDecimal getPurse () {
		return purse;
	}

	public void setPurse (BigDecimal purse) {
		this.purse = purse;
	}

	public BigDecimal getMinClaimPrice () {
		return minClaimPrice;
	}

	public void setMinClaimPrice (BigDecimal minClaimPrice) {
		this.minClaimPrice = minClaimPrice;
	}

	public BigDecimal getMaxClaimPrice () {
		return maxClaimPrice;
	}

	public void setMaxClaimPrice (BigDecimal maxClaimPrice) {
		this.maxClaimPrice = maxClaimPrice;
	}

	public String getRaceMoney () {
		return raceMoney;
	}

	public void setRaceMoney (String raceMoney) {
		this.raceMoney = raceMoney;
	}

	public String getClaimingFlag () {
		return claimingFlag;
	}

	public void setClaimingFlag (String claimingFlag) {
		this.claimingFlag = claimingFlag;
	}

	public String getClaimIndicator () {
		return claimIndicator;
	}

	public void setClaimIndicator (String claimIndicator) {
		this.claimIndicator = claimIndicator;
	}

	public String getRaceType () {
		return raceType;
	}

	public void setRaceType (String raceType) {
		this.raceType = raceType;
	}

	public String getRaceTypeDesc () {
		return raceTypeDesc;
	}

	public void setRaceTypeDesc (String raceTypeDesc) {
		this.raceTypeDesc = raceTypeDesc;
	}

	public String getEqRaceType () {
		return eqRaceType;
	}

	public void setEqRaceType (String eqRaceType) {
		this.eqRaceType = eqRaceType;
	}

	public String getJockey () {
		return jockey;
	}

	public void setJockey (String jockey) {
		this.jockey = jockey;
	}

	public Integer getWeight () {
		return weight;
	}

	public void setWeight (Integer weight) {
		this.weight = weight;
	}

	public Boolean getLasix () {
		return lasix;
	}

	public void setLasix (Boolean lasix) {
		this.lasix = lasix;
	}

	public Boolean getLasixRed () {
		return lasixRed;
	}

	public void setLasixRed (Boolean lasixRed) {
		this.lasixRed = lasixRed;
	}

	public String getFrontWraps () {
		return frontWraps;
	}

	public void setFrontWraps (String frontWraps) {
		this.frontWraps = frontWraps;
	}

	public String getBlinkers () {
		return blinkers;
	}

	public void setBlinkers (String blinkers) {
		this.blinkers = blinkers;
	}

	public String getBlinkersRed () {
		return blinkersRed;
	}

	public void setBlinkersRed (String blinkersRed) {
		this.blinkersRed = blinkersRed;
	}

	public BigDecimal getClosingOdds () {
		return closingOdds;
	}

	public void setClosingOdds (BigDecimal closingOdds) {
		this.closingOdds = closingOdds;
	}

	public String getPerformanceFigure () {
		return performanceFigure;
	}

	public void setPerformanceFigure (String performanceFigure) {
		this.performanceFigure = performanceFigure;
	}

	public String getPerformanceFigure_NW () {
		return performanceFigure_NW;
	}

	public void setPerformanceFigure_NW (String performanceFigure_NW) {
		this.performanceFigure_NW = performanceFigure_NW;
	}

	public Integer getPositionAtFinish () {
		return positionAtFinish;
	}

	public void setPositionAtFinish (Integer positionAtFinish) {
		this.positionAtFinish = positionAtFinish;
	}

	public Integer getBehindLeader () {
		return behindLeader;
	}

	public void setBehindLeader (Integer behindLeader) {
		this.behindLeader = behindLeader;
	}

	public Integer getDistanceId () {
		return distanceId;
	}

	public void setDistanceId (Integer distanceId) {
		this.distanceId = distanceId;
	}

	public String getDistanceUnit () {
		return distanceUnit;
	}

	public void setDistanceUnit (String distanceUnit) {
		this.distanceUnit = distanceUnit;
	}

	public Integer getPostPosition () {
		return postPosition;
	}

	public void setPostPosition (Integer postPosition) {
		this.postPosition = postPosition;
	}

	public Integer getFieldSize () {
		return fieldSize;
	}

	public void setFieldSize (Integer fieldSize) {
		this.fieldSize = fieldSize;
	}

	public String getStartCall () {
		return startCall;
	}

	public void setStartCall (String startCall) {
		this.startCall = startCall;
	}

	public String getCall1 () {
		return call1;
	}

	public void setCall1 (String call1) {
		this.call1 = call1;
	}

	public String getCall2 () {
		return call2;
	}

	public void setCall2 (String call2) {
		this.call2 = call2;
	}

	public String getCall3 () {
		return call3;
	}

	public void setCall3 (String call3) {
		this.call3 = call3;
	}

	public String getFinishPosition () {
		return finishPosition;
	}

	public void setFinishPosition (String finishPosition) {
		this.finishPosition = finishPosition;
	}

	public String getRaceComments () {
		return raceComments;
	}

	public void setRaceComments (String raceComments) {
		this.raceComments = raceComments;
	}

	public String getWin () {
		return win;
	}

	public void setWin (String win) {
		this.win = win;
	}

	public String getPlace () {
		return place;
	}

	public void setPlace (String place) {
		this.place = place;
	}

	public String getShow () {
		return show;
	}

	public void setShow (String show) {
		this.show = show;
	}

	public String getWinMargin () {
		return winMargin;
	}

	public void setWinMargin (String winMargin) {
		this.winMargin = winMargin;
	}

	public String getPlaceMargin () {
		return placeMargin;
	}

	public void setPlaceMargin (String placeMargin) {
		this.placeMargin = placeMargin;
	}

	public String getShowMargin () {
		return showMargin;
	}

	public void setShowMargin (String showMargin) {
		this.showMargin = showMargin;
	}

	public String getfR1_ThisHorse_Adj () {
		return fR1_ThisHorse_Adj;
	}

	public void setfR1_ThisHorse_Adj (String fR1_ThisHorse_Adj) {
		this.fR1_ThisHorse_Adj = fR1_ThisHorse_Adj;
	}

	public String getfR2_ThisHorse_Adj () {
		return fR2_ThisHorse_Adj;
	}

	public void setfR2_ThisHorse_Adj (String fR2_ThisHorse_Adj) {
		this.fR2_ThisHorse_Adj = fR2_ThisHorse_Adj;
	}

	public String getfR3_ThisHorse_Adj () {
		return fR3_ThisHorse_Adj;
	}

	public void setfR3_ThisHorse_Adj (String fR3_ThisHorse_Adj) {
		this.fR3_ThisHorse_Adj = fR3_ThisHorse_Adj;
	}

	public String getfR4_ThisHorse_Adj () {
		return fR4_ThisHorse_Adj;
	}

	public void setfR4_ThisHorse_Adj (String fR4_ThisHorse_Adj) {
		this.fR4_ThisHorse_Adj = fR4_ThisHorse_Adj;
	}

	public String getfT_ThisHorse_Adj () {
		return fT_ThisHorse_Adj;
	}

	public void setfT_ThisHorse_Adj (String fT_ThisHorse_Adj) {
		this.fT_ThisHorse_Adj = fT_ThisHorse_Adj;
	}

	public String getfR1_ThisHorseIncr_Adj () {
		return fR1_ThisHorseIncr_Adj;
	}

	public void setfR1_ThisHorseIncr_Adj (String fR1_ThisHorseIncr_Adj) {
		this.fR1_ThisHorseIncr_Adj = fR1_ThisHorseIncr_Adj;
	}

	public String getfR2_ThisHorseIncr_Adj () {
		return fR2_ThisHorseIncr_Adj;
	}

	public void setfR2_ThisHorseIncr_Adj (String fR2_ThisHorseIncr_Adj) {
		this.fR2_ThisHorseIncr_Adj = fR2_ThisHorseIncr_Adj;
	}

	public String getfR3_ThisHorseIncr_Adj () {
		return fR3_ThisHorseIncr_Adj;
	}

	public void setfR3_ThisHorseIncr_Adj (String fR3_ThisHorseIncr_Adj) {
		this.fR3_ThisHorseIncr_Adj = fR3_ThisHorseIncr_Adj;
	}

	public String getfR4_ThisHorseIncr_Adj () {
		return fR4_ThisHorseIncr_Adj;
	}

	public void setfR4_ThisHorseIncr_Adj (String fR4_ThisHorseIncr_Adj) {
		this.fR4_ThisHorseIncr_Adj = fR4_ThisHorseIncr_Adj;
	}

	public String getfT_ThisHorseIncr_Adj () {
		return fT_ThisHorseIncr_Adj;
	}

	public void setfT_ThisHorseIncr_Adj (String fT_ThisHorseIncr_Adj) {
		this.fT_ThisHorseIncr_Adj = fT_ThisHorseIncr_Adj;
	}

	public String getfR1_Leader_Adj () {
		return fR1_Leader_Adj;
	}

	public void setfR1_Leader_Adj (String fR1_Leader_Adj) {
		this.fR1_Leader_Adj = fR1_Leader_Adj;
	}

	public String getfR2_Leader_Adj () {
		return fR2_Leader_Adj;
	}

	public void setfR2_Leader_Adj (String fR2_Leader_Adj) {
		this.fR2_Leader_Adj = fR2_Leader_Adj;
	}

	public String getfR3_Leader_Adj () {
		return fR3_Leader_Adj;
	}

	public void setfR3_Leader_Adj (String fR3_Leader_Adj) {
		this.fR3_Leader_Adj = fR3_Leader_Adj;
	}

	public String getfR4_Leader_Adj () {
		return fR4_Leader_Adj;
	}

	public void setfR4_Leader_Adj (String fR4_Leader_Adj) {
		this.fR4_Leader_Adj = fR4_Leader_Adj;
	}

	public String getfT_Leader_Adj () {
		return fT_Leader_Adj;
	}

	public void setfT_Leader_Adj (String fT_Leader_Adj) {
		this.fT_Leader_Adj = fT_Leader_Adj;
	}

	public String getfR1_LeaderIncr_Adj () {
		return fR1_LeaderIncr_Adj;
	}

	public void setfR1_LeaderIncr_Adj (String fR1_LeaderIncr_Adj) {
		this.fR1_LeaderIncr_Adj = fR1_LeaderIncr_Adj;
	}

	public String getfR2_LeaderIncr_Adj () {
		return fR2_LeaderIncr_Adj;
	}

	public void setfR2_LeaderIncr_Adj (String fR2_LeaderIncr_Adj) {
		this.fR2_LeaderIncr_Adj = fR2_LeaderIncr_Adj;
	}

	public String getfR3_LeaderIncr_Adj () {
		return fR3_LeaderIncr_Adj;
	}

	public void setfR3_LeaderIncr_Adj (String fR3_LeaderIncr_Adj) {
		this.fR3_LeaderIncr_Adj = fR3_LeaderIncr_Adj;
	}

	public String getfR4_LeaderIncr_Adj () {
		return fR4_LeaderIncr_Adj;
	}

	public void setfR4_LeaderIncr_Adj (String fR4_LeaderIncr_Adj) {
		this.fR4_LeaderIncr_Adj = fR4_LeaderIncr_Adj;
	}

	public String getfT_LeaderIncr_Adj () {
		return fT_LeaderIncr_Adj;
	}

	public void setfT_LeaderIncr_Adj (String fT_LeaderIncr_Adj) {
		this.fT_LeaderIncr_Adj = fT_LeaderIncr_Adj;
	}

	public String getfR1_ThisHorse_Off () {
		return fR1_ThisHorse_Off;
	}

	public void setfR1_ThisHorse_Off (String fR1_ThisHorse_Off) {
		this.fR1_ThisHorse_Off = fR1_ThisHorse_Off;
	}

	public String getfR2_ThisHorse_Off () {
		return fR2_ThisHorse_Off;
	}

	public void setfR2_ThisHorse_Off (String fR2_ThisHorse_Off) {
		this.fR2_ThisHorse_Off = fR2_ThisHorse_Off;
	}

	public String getfR3_ThisHorse_Off () {
		return fR3_ThisHorse_Off;
	}

	public void setfR3_ThisHorse_Off (String fR3_ThisHorse_Off) {
		this.fR3_ThisHorse_Off = fR3_ThisHorse_Off;
	}

	public String getfR4_ThisHorse_Off () {
		return fR4_ThisHorse_Off;
	}

	public void setfR4_ThisHorse_Off (String fR4_ThisHorse_Off) {
		this.fR4_ThisHorse_Off = fR4_ThisHorse_Off;
	}

	public String getfT_ThisHorse_Off () {
		return fT_ThisHorse_Off;
	}

	public void setfT_ThisHorse_Off (String fT_ThisHorse_Off) {
		this.fT_ThisHorse_Off = fT_ThisHorse_Off;
	}

	public String getfR1_ThisHorseIncr_Off () {
		return fR1_ThisHorseIncr_Off;
	}

	public void setfR1_ThisHorseIncr_Off (String fR1_ThisHorseIncr_Off) {
		this.fR1_ThisHorseIncr_Off = fR1_ThisHorseIncr_Off;
	}

	public String getfR2_ThisHorseIncr_Off () {
		return fR2_ThisHorseIncr_Off;
	}

	public void setfR2_ThisHorseIncr_Off (String fR2_ThisHorseIncr_Off) {
		this.fR2_ThisHorseIncr_Off = fR2_ThisHorseIncr_Off;
	}

	public String getfR3_ThisHorseIncr_Off () {
		return fR3_ThisHorseIncr_Off;
	}

	public void setfR3_ThisHorseIncr_Off (String fR3_ThisHorseIncr_Off) {
		this.fR3_ThisHorseIncr_Off = fR3_ThisHorseIncr_Off;
	}

	public String getfR4_ThisHorseIncr_Off () {
		return fR4_ThisHorseIncr_Off;
	}

	public void setfR4_ThisHorseIncr_Off (String fR4_ThisHorseIncr_Off) {
		this.fR4_ThisHorseIncr_Off = fR4_ThisHorseIncr_Off;
	}

	public BigDecimal getfT_ThisHorseIncr_Off () {
		return fT_ThisHorseIncr_Off;
	}

	public void setfT_ThisHorseIncr_Off (BigDecimal fT_ThisHorseIncr_Off) {
		this.fT_ThisHorseIncr_Off = fT_ThisHorseIncr_Off;
	}

	public String getfR1_Leader_Off () {
		return fR1_Leader_Off;
	}

	public void setfR1_Leader_Off (String fR1_Leader_Off) {
		this.fR1_Leader_Off = fR1_Leader_Off;
	}

	public String getfR2_Leader_Off () {
		return fR2_Leader_Off;
	}

	public void setfR2_Leader_Off (String fR2_Leader_Off) {
		this.fR2_Leader_Off = fR2_Leader_Off;
	}

	public String getfR3_Leader_Off () {
		return fR3_Leader_Off;
	}

	public void setfR3_Leader_Off (String fR3_Leader_Off) {
		this.fR3_Leader_Off = fR3_Leader_Off;
	}

	@Basic private String win = null;
	@Basic private String place = null;
	@Basic private String show = null;
	@Basic private String winMargin = null;
	@Basic private String placeMargin = null;
	@Basic private String showMargin = null;

	@Basic private String fR1_ThisHorse_Adj = null;
	@Basic private String fR2_ThisHorse_Adj = null;
	@Basic private String fR3_ThisHorse_Adj = null;
	@Basic private String fR4_ThisHorse_Adj = null;
	@Basic private String fT_ThisHorse_Adj = null;
	@Basic private String fR1_ThisHorseIncr_Adj = null;

	@Basic private String fR2_ThisHorseIncr_Adj = null;
	@Basic private String fR3_ThisHorseIncr_Adj = null;
	@Basic private String fR4_ThisHorseIncr_Adj = null;
	@Basic private String fT_ThisHorseIncr_Adj = null;
	@Basic private String fR1_Leader_Adj = null;
	@Basic private String fR2_Leader_Adj = null;
	@Basic private String fR3_Leader_Adj = null;
	@Basic private String fR4_Leader_Adj = null;
	@Basic private String fT_Leader_Adj = null;
	@Basic private String fR1_LeaderIncr_Adj = null;
	@Basic private String fR2_LeaderIncr_Adj = null;
	@Basic private String fR3_LeaderIncr_Adj = null;

	@Basic private String fR4_LeaderIncr_Adj = null;
	@Basic private String fT_LeaderIncr_Adj = null;
	@Basic private String fR1_ThisHorse_Off = null;
	@Basic private String fR2_ThisHorse_Off = null;
	@Basic private String fR3_ThisHorse_Off = null;
	@Basic private String fR4_ThisHorse_Off = null;
	@Basic private String fT_ThisHorse_Off = null;
	@Basic private String fR1_ThisHorseIncr_Off = null;
	@Basic private String fR2_ThisHorseIncr_Off = null;
	@Basic private String fR3_ThisHorseIncr_Off = null;
	@Basic private String fR4_ThisHorseIncr_Off = null;
	@Basic private BigDecimal fT_ThisHorseIncr_Off = null;

	@Basic private String fR1_Leader_Off = null;
	@Basic private String fR2_Leader_Off = null;
	@Basic private String fR3_Leader_Off = null;




}
