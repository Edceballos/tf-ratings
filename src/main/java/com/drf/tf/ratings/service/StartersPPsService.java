package com.drf.tf.ratings.service;

import com.drf.tf.ratings.domain.StarterPPsEntity;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.Date;

/**
 * Created by eceballos on 10/05/2016.
 */
@Service
public interface StartersPPsService {
	void saveStartersPPs (StarterPPsEntity starterPPsEntity);
	void deleteByStarterIdAndForeignRaceAndCareerRaceNumberAndRegistrationNumberAndRaceDateAndRaceNumberAndTrackId (BigInteger starterId , Boolean foreignRace , Integer careerRaceNumber, String registrationNumber, Date raceDate, Integer raceNumber,String trackId );

}
