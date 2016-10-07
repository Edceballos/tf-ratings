package com.drf.tf.ratings.service;

import com.drf.tf.ratings.domain.StarterPPsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.Date;

/**
 * Created by eceballos on 10/05/2016.
 */
@Repository
public interface StartersPPsRepository extends JpaRepository<StarterPPsEntity, String> {
	void deleteByStarterIdAndForeignRaceAndCareerRaceNumberAndRegistrationNumberAndRaceDateAndRaceNumberAndTrackId (BigInteger starterId , Boolean foreignRace , Integer careerRaceNumber, String registrationNumber, Date raceDate, Integer raceNumber, String trackId );
}