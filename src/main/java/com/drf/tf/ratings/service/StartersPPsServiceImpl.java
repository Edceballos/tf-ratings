package com.drf.tf.ratings.service;

import com.drf.tf.ratings.domain.StarterPPsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigInteger;
import java.util.Date;

/**
 * Created by eceballos on 10/05/2016.
 */
@Service
@Transactional
public class StartersPPsServiceImpl implements StartersPPsService {
	@Autowired
	private StartersPPsRepository startersPPsRepository;

	public void saveStartersPPs (StarterPPsEntity starterPPsEntity) {
		startersPPsRepository.saveAndFlush(starterPPsEntity);
	}

	public void deleteByStarterIdAndForeignRaceAndCareerRaceNumberAndRegistrationNumberAndRaceDateAndRaceNumberAndTrackId (BigInteger starterId , Boolean foreignRace , Integer careerRaceNumber, String registrationNumber, Date raceDate, Integer raceNumber,String trackId ){
		startersPPsRepository.deleteByStarterIdAndForeignRaceAndCareerRaceNumberAndRegistrationNumberAndRaceDateAndRaceNumberAndTrackId(starterId,foreignRace,careerRaceNumber,registrationNumber,raceDate,raceNumber,trackId);
	}

}
