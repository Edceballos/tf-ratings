package com.drf.tf.ratings.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by eceballos on 10/04/2016.
 */
@JsonIgnoreProperties (ignoreUnknown = true)
public class StarterPPs {
 public StarterPPs (){}
	@JsonProperty ("ForeignRace")			private Boolean foreignRace = false;
    @JsonProperty("CareerRaceNumber")		private Integer careerRaceNumber = null;
    @JsonProperty("RegistrationNumber")		private String registrationNumber = null;
    @JsonProperty("RaceDate")				private Date raceDate  = null;
    @JsonProperty("RaceNumber")				private Integer raceNumber = null;
    @JsonProperty("ClassRating")			private String classRating = null;
    @JsonProperty("RaceDescriptionText")	private String raceDescriptionText = null;
    @JsonProperty("TrackId")				private String trackId = null;
    @JsonProperty("ForeignCountryCode")		private String foreignCountryCode = null;
    @JsonProperty("Country")				private String country = null;
    @JsonProperty("ForeignTrackName")		private String foreignTrackName = null;
    @JsonProperty("ProgramNumber")			private String programNumber = null;
    @JsonProperty("AgeCondition")			private String ageCondition = null;
    @JsonProperty("Course")					private String course = null;
    @JsonProperty("ScheduledSurface")		private String scheduledSurface = null;
    @JsonProperty("TrackCondition")			private String trackCondition = null;
    @JsonProperty("GenderFlag")				private String genderFlag = null;
    @JsonProperty("ShortDistance")			private String shortDistance = null;
    @JsonProperty("LongDistance")			private String longDistance = null;
    @JsonProperty("AboutDistance")			private String aboutDistance = null;
    @JsonProperty("Purse")					private BigDecimal purse = null;

    @JsonProperty ("MinClaimPrice")			private BigDecimal minClaimPrice = null;
    @JsonProperty("MaxClaimPrice")			private BigDecimal maxClaimPrice = null;
    @JsonProperty("RaceMoney")				private String raceMoney = null;
    @JsonProperty("ClaimingFlag")			private String claimingFlag  = null;
    @JsonProperty("ClaimIndicator")			private String claimIndicator = null;
    @JsonProperty("RaceType")				private String raceType = null;
    @JsonProperty("RaceTypeDesc")			private String raceTypeDesc = null;
    @JsonProperty("EqRaceType")				private String eqRaceType = null;
    @JsonProperty("Jockey")					private String jockey = null;
    @JsonProperty("Weight")					private Integer weight = null;
    @JsonProperty("Lasix")					private Boolean lasix = false;
    @JsonProperty("LasixRed")				private Boolean lasixRed = false;
    @JsonProperty("FrontWraps")				private String frontWraps = null;
    @JsonProperty("Blinkers")				private String blinkers = null;
    @JsonProperty("BlinkersRed")			private String blinkersRed = null;
    @JsonProperty("ClosingOdds")			private BigDecimal closingOdds = null;
    @JsonProperty("PerformanceFigure")		private String performanceFigure = null;
    @JsonProperty("PerformanceFigure_NW")	private String performanceFigure_NW = null;
	@JsonProperty("PositionAtFinish")		private Integer positionAtFinish = null;
    @JsonProperty("BehindLeader")			private Integer behindLeader = null;
    @JsonProperty("DistanceId")				private Integer distanceId = null;

    @JsonProperty ("DistanceUnit")			private String distanceUnit = null;
    @JsonProperty("PostPosition")			private Integer postPosition = null;
    @JsonProperty("FieldSize")				private Integer fieldSize = null;
    @JsonProperty("StartCall")				private String startCall  = null;
    @JsonProperty("Call1")					private String call1 = null;
    @JsonProperty("Call2")					private String call2 = null;
    @JsonProperty("Call3")					private String call3 = null;
    @JsonProperty("FinishPosition")			private String finishPosition = null;
    @JsonProperty("RaceComments")			private String raceComments = null;
    @JsonProperty("Win")					private String win = null;
    @JsonProperty("Place")					private String place = null;
    @JsonProperty("Show")					private String show = null;
    @JsonProperty("WinMargin")				private String winMargin = null;
    @JsonProperty("PlaceMargin")			private String placeMargin = null;
    @JsonProperty("ShowMargin")				private String showMargin = null;

    @JsonProperty("FR1_ThisHorse_Adj")		private String fR1_ThisHorse_Adj = null;
    @JsonProperty("FR2_ThisHorse_Adj")		private String fR2_ThisHorse_Adj = null;
    @JsonProperty("FR3_ThisHorse_Adj")		private String fR3_ThisHorse_Adj = null;
    @JsonProperty("FR4_ThisHorse_Adj")		private String fR4_ThisHorse_Adj = null;
    @JsonProperty("FT_ThisHorse_Adj")		private String fT_ThisHorse_Adj = null;
    @JsonProperty("FR1_ThisHorseIncr_Adj")	private String fR1_ThisHorseIncr_Adj = null;

    @JsonProperty("FR2_ThisHorseIncr_Adj")	private String fR2_ThisHorseIncr_Adj = null;
    @JsonProperty("FR3_ThisHorseIncr_Adj")	private String fR3_ThisHorseIncr_Adj = null;
    @JsonProperty("FR4_ThisHorseIncr_Adj")	private String fR4_ThisHorseIncr_Adj = null;
    @JsonProperty("FT_ThisHorseIncr_Adj")	private String fT_ThisHorseIncr_Adj = null;
    @JsonProperty("FR1_Leader_Adj")			private String fR1_Leader_Adj = null;
    @JsonProperty("FR2_Leader_Adj")			private String fR2_Leader_Adj = null;
    @JsonProperty("FR3_Leader_Adj")			private String fR3_Leader_Adj = null;
    @JsonProperty("FR4_Leader_Adj")			private String fR4_Leader_Adj = null;
    @JsonProperty("FT_Leader_Adj")			private String fT_Leader_Adj = null;
    @JsonProperty("FR1_LeaderIncr_Adj")		private String fR1_LeaderIncr_Adj = null;
    @JsonProperty("FR2_LeaderIncr_Adj")		private String fR2_LeaderIncr_Adj = null;
    @JsonProperty("FR3_LeaderIncr_Adj")		private String fR3_LeaderIncr_Adj = null;

    @JsonProperty("FR4_LeaderIncr_Adj")		private String fR4_LeaderIncr_Adj = null;
    @JsonProperty("FT_LeaderIncr_Adj")		private String fT_LeaderIncr_Adj = null;
    @JsonProperty("FR1_ThisHorse_Off")		private String fR1_ThisHorse_Off = null;
    @JsonProperty("FR2_ThisHorse_Off")		private String fR2_ThisHorse_Off = null;
    @JsonProperty("FR3_ThisHorse_Off")		private String fR3_ThisHorse_Off = null;
    @JsonProperty("FR4_ThisHorse_Off")		private String fR4_ThisHorse_Off = null;
    @JsonProperty("FT_ThisHorse_Off")		private String fT_ThisHorse_Off = null;
    @JsonProperty("FR1_ThisHorseIncr_Off")	private String fR1_ThisHorseIncr_Off = null;
    @JsonProperty("FR2_ThisHorseIncr_Off")	private String fR2_ThisHorseIncr_Off = null;
    @JsonProperty("FR3_ThisHorseIncr_Off")	private String fR3_ThisHorseIncr_Off = null;
    @JsonProperty("FR4_ThisHorseIncr_Off")	private String fR4_ThisHorseIncr_Off = null;
    @JsonProperty("FT_ThisHorseIncr_Off")	private BigDecimal fT_ThisHorseIncr_Off = null;

    @JsonProperty("FR1_Leader_Off")			private String fR1_Leader_Off = null;
    @JsonProperty("FR2_Leader_Off")			private String fR2_Leader_Off = null;
    @JsonProperty("FR3_Leader_Off")			private String fR3_Leader_Off = null;

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

	public String getfR4_Leader_Off () {
		return fR4_Leader_Off;
	}

	public void setfR4_Leader_Off (String fR4_Leader_Off) {
		this.fR4_Leader_Off = fR4_Leader_Off;
	}

	public String getfT_Leader_Off () {
		return fT_Leader_Off;
	}

	public void setfT_Leader_Off (String fT_Leader_Off) {
		this.fT_Leader_Off = fT_Leader_Off;
	}

	public String getfR1_LeaderIncr_Off () {
		return fR1_LeaderIncr_Off;
	}

	public void setfR1_LeaderIncr_Off (String fR1_LeaderIncr_Off) {
		this.fR1_LeaderIncr_Off = fR1_LeaderIncr_Off;
	}

	public String getfR2_LeaderIncr_Off () {
		return fR2_LeaderIncr_Off;
	}

	public void setfR2_LeaderIncr_Off (String fR2_LeaderIncr_Off) {
		this.fR2_LeaderIncr_Off = fR2_LeaderIncr_Off;
	}

	public String getfR3_LeaderIncr_Off () {
		return fR3_LeaderIncr_Off;
	}

	public void setfR3_LeaderIncr_Off (String fR3_LeaderIncr_Off) {
		this.fR3_LeaderIncr_Off = fR3_LeaderIncr_Off;
	}

	public String getfR4_LeaderIncr_Off () {
		return fR4_LeaderIncr_Off;
	}

	public void setfR4_LeaderIncr_Off (String fR4_LeaderIncr_Off) {
		this.fR4_LeaderIncr_Off = fR4_LeaderIncr_Off;
	}

	public String getfT_LeaderIncr_Off () {
		return fT_LeaderIncr_Off;
	}

	public void setfT_LeaderIncr_Off (String fT_LeaderIncr_Off) {
		this.fT_LeaderIncr_Off = fT_LeaderIncr_Off;
	}

	public String getPaceFigure1_Race () {
		return paceFigure1_Race;
	}

	public void setPaceFigure1_Race (String paceFigure1_Race) {
		this.paceFigure1_Race = paceFigure1_Race;
	}

	public String getPaceFigure2_Race () {
		return paceFigure2_Race;
	}

	public void setPaceFigure2_Race (String paceFigure2_Race) {
		this.paceFigure2_Race = paceFigure2_Race;
	}

	public String getPaceFigure3_Race () {
		return paceFigure3_Race;
	}

	public void setPaceFigure3_Race (String paceFigure3_Race) {
		this.paceFigure3_Race = paceFigure3_Race;
	}

	public String getPaceFigure4_Race () {
		return paceFigure4_Race;
	}

	public void setPaceFigure4_Race (String paceFigure4_Race) {
		this.paceFigure4_Race = paceFigure4_Race;
	}

	public String getPaceFigureFinal_Race () {
		return paceFigureFinal_Race;
	}

	public void setPaceFigureFinal_Race (String paceFigureFinal_Race) {
		this.paceFigureFinal_Race = paceFigureFinal_Race;
	}

	public String getPaceFigure1_Horse () {
		return paceFigure1_Horse;
	}

	public void setPaceFigure1_Horse (String paceFigure1_Horse) {
		this.paceFigure1_Horse = paceFigure1_Horse;
	}

	public String getPaceFigure2_Horse () {
		return paceFigure2_Horse;
	}

	public void setPaceFigure2_Horse (String paceFigure2_Horse) {
		this.paceFigure2_Horse = paceFigure2_Horse;
	}

	public String getPaceFigure3_Horse () {
		return paceFigure3_Horse;
	}

	public void setPaceFigure3_Horse (String paceFigure3_Horse) {
		this.paceFigure3_Horse = paceFigure3_Horse;
	}

	public String getPaceFigure4_Horse () {
		return paceFigure4_Horse;
	}

	public void setPaceFigure4_Horse (String paceFigure4_Horse) {
		this.paceFigure4_Horse = paceFigure4_Horse;
	}

	public String getPaceFigureFinal_Horse () {
		return paceFigureFinal_Horse;
	}

	public void setPaceFigureFinal_Horse (String paceFigureFinal_Horse) {
		this.paceFigureFinal_Horse = paceFigureFinal_Horse;
	}

	public String getPaceFigure1_Horse_NW () {
		return paceFigure1_Horse_NW;
	}

	public void setPaceFigure1_Horse_NW (String paceFigure1_Horse_NW) {
		this.paceFigure1_Horse_NW = paceFigure1_Horse_NW;
	}

	public String getPaceFigure2_Horse_NW () {
		return paceFigure2_Horse_NW;
	}

	public void setPaceFigure2_Horse_NW (String paceFigure2_Horse_NW) {
		this.paceFigure2_Horse_NW = paceFigure2_Horse_NW;
	}

	public String getPaceFigure3_Horse_NW () {
		return paceFigure3_Horse_NW;
	}

	public void setPaceFigure3_Horse_NW (String paceFigure3_Horse_NW) {
		this.paceFigure3_Horse_NW = paceFigure3_Horse_NW;
	}

	public String getPaceFigure4_Horse_NW () {
		return paceFigure4_Horse_NW;
	}

	public void setPaceFigure4_Horse_NW (String paceFigure4_Horse_NW) {
		this.paceFigure4_Horse_NW = paceFigure4_Horse_NW;
	}

	public String getPaceFigureFinal_Horse_NW () {
		return paceFigureFinal_Horse_NW;
	}

	public void setPaceFigureFinal_Horse_NW (String paceFigureFinal_Horse_NW) {
		this.paceFigureFinal_Horse_NW = paceFigureFinal_Horse_NW;
	}

	public String getDaysSinceLastRace () {
		return daysSinceLastRace;
	}

	public void setDaysSinceLastRace (String daysSinceLastRace) {
		this.daysSinceLastRace = daysSinceLastRace;
	}

	public Integer getDaysColorFlag () {
		return daysColorFlag;
	}

	public void setDaysColorFlag (Integer daysColorFlag) {
		this.daysColorFlag = daysColorFlag;
	}

	public Boolean getNewYear () {
		return newYear;
	}

	public void setNewYear (Boolean newYear) {
		this.newYear = newYear;
	}

	public String getNewYearString () {
		return newYearString;
	}

	public void setNewYearString (String newYearString) {
		this.newYearString = newYearString;
	}

	public String getTrainerChanges () {
		return trainerChanges;
	}

	public void setTrainerChanges (String trainerChanges) {
		this.trainerChanges = trainerChanges;
	}

	public String getForeignRaceComments () {
		return foreignRaceComments;
	}

	public void setForeignRaceComments (String foreignRaceComments) {
		this.foreignRaceComments = foreignRaceComments;
	}

	public Boolean getWinnerInCurrentRace () {
		return winnerInCurrentRace;
	}

	public void setWinnerInCurrentRace (Boolean winnerInCurrentRace) {
		this.winnerInCurrentRace = winnerInCurrentRace;
	}

	public Boolean getPlaceHorseInCurrentRace () {
		return placeHorseInCurrentRace;
	}

	public void setPlaceHorseInCurrentRace (Boolean placeHorseInCurrentRace) {
		this.placeHorseInCurrentRace = placeHorseInCurrentRace;
	}

	public Boolean getShowHorseInCurrentRace () {
		return showHorseInCurrentRace;
	}

	public void setShowHorseInCurrentRace (Boolean showHorseInCurrentRace) {
		this.showHorseInCurrentRace = showHorseInCurrentRace;
	}

	public Integer getClassRating_BiasColor () {
		return classRating_BiasColor;
	}

	public void setClassRating_BiasColor (Integer classRating_BiasColor) {
		this.classRating_BiasColor = classRating_BiasColor;
	}

	public Integer getFr1_Color () {
		return fr1_Color;
	}

	public void setFr1_Color (Integer fr1_Color) {
		this.fr1_Color = fr1_Color;
	}

	public Integer getFr2_Color () {
		return fr2_Color;
	}

	public void setFr2_Color (Integer fr2_Color) {
		this.fr2_Color = fr2_Color;
	}

	public Integer getFr3_Color () {
		return fr3_Color;
	}

	public void setFr3_Color (Integer fr3_Color) {
		this.fr3_Color = fr3_Color;
	}

	public Integer getFr4_Color () {
		return fr4_Color;
	}

	public void setFr4_Color (Integer fr4_Color) {
		this.fr4_Color = fr4_Color;
	}

	@JsonProperty("FR4_Leader_Off")			private String fR4_Leader_Off = null;

	@JsonProperty("FT_Leader_Off")			private String fT_Leader_Off = null;
    @JsonProperty("FR1_LeaderIncr_Off")		private String fR1_LeaderIncr_Off = null;
    @JsonProperty("FR2_LeaderIncr_Off")		private String fR2_LeaderIncr_Off = null;
    @JsonProperty("FR3_LeaderIncr_Off")		private String fR3_LeaderIncr_Off = null;
    @JsonProperty("FR4_LeaderIncr_Off")		private String fR4_LeaderIncr_Off = null;
    @JsonProperty("FT_LeaderIncr_Off")		private String fT_LeaderIncr_Off = null;


    @JsonProperty("PaceFigure1_Race")		private String paceFigure1_Race = null;
    @JsonProperty("PaceFigure2_Race")		private String paceFigure2_Race = null;
    @JsonProperty("PaceFigure3_Race")		private String paceFigure3_Race = null;
    @JsonProperty("PaceFigure4_Race")		private String paceFigure4_Race = null;
    @JsonProperty("PaceFigureFinal_Race")	private String paceFigureFinal_Race = null;
    @JsonProperty("PaceFigure1_Horse")		private String paceFigure1_Horse = null;
    @JsonProperty("PaceFigure2_Horse")		private String paceFigure2_Horse = null;
    @JsonProperty("PaceFigure3_Horse")		private String paceFigure3_Horse = null;
    @JsonProperty("PaceFigure4_Horse")		private String paceFigure4_Horse = null;
    @JsonProperty("PaceFigureFinal_Horse")	private String paceFigureFinal_Horse = null;

    @JsonProperty("PaceFigure1_Horse_NW")	private String paceFigure1_Horse_NW = null;
    @JsonProperty("PaceFigure2_Horse_NW")	private String paceFigure2_Horse_NW = null;
    @JsonProperty("PaceFigure3_Horse_NW")	private String paceFigure3_Horse_NW = null;
    @JsonProperty("PaceFigure4_Horse_NW")	private String paceFigure4_Horse_NW = null;
    @JsonProperty("PaceFigureFinal_Horse_NW")	private String paceFigureFinal_Horse_NW = null;
    @JsonProperty("DaysSinceLastRace")		private String daysSinceLastRace = null;
    @JsonProperty("DaysColorFlag")			private Integer daysColorFlag = null;
    @JsonProperty("NewYear")				private Boolean newYear = false;
    @JsonProperty("NewYearString")			private String newYearString = null;
    @JsonProperty("TrainerChanges")			private String trainerChanges = null;


    @JsonProperty("ForeignRaceComments")	private String foreignRaceComments = null;
    @JsonProperty("WinnerInCurrentRace")	private Boolean winnerInCurrentRace = false;
    @JsonProperty("PlaceHorseInCurrentRace")private Boolean placeHorseInCurrentRace = false;
    @JsonProperty("ShowHorseInCurrentRace")	private Boolean showHorseInCurrentRace = false;
    @JsonProperty("ClassRating_BiasColor")	private Integer classRating_BiasColor = null;
    @JsonProperty("Fr1_Color")				private Integer fr1_Color = null;
    @JsonProperty("Fr2_Color")				private Integer fr2_Color = null;
    @JsonProperty("Fr3_Color")				private Integer fr3_Color = null;
    @JsonProperty("Fr4_Color")				private Integer fr4_Color = null;
}
