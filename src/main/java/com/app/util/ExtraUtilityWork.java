package com.app.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.app.enums.SeatClass;
import com.app.pojos.Search;
import com.app.pojos.SeatStatus;

import net.bytebuddy.utility.RandomString;

@SuppressWarnings("deprecation")
@Configuration
public class ExtraUtilityWork 
{
	public SeatStatus updateSeats(SeatStatus seatStatus, Search search) 
	{
		String classOfJourney = search.getClassOfjourney();
		int passenger = search.getPassenger();
		if (classOfJourney.equals(SeatClass.ECONOMY.label)) 
		{
			seatStatus.setAvailableSeats(seatStatus.getAvailableSeats() - passenger);
			seatStatus.setBookedSeats(seatStatus.getBookedSeats() + passenger);
			seatStatus.setEconomySeatsAvailable(seatStatus.getEconomySeatsAvailable() - passenger);
			seatStatus.setEconomySeatsBooked(seatStatus.getEconomySeatsBooked() + passenger);
		} 
		else 
			if (classOfJourney.equals(SeatClass.BASIC_ECONOMY.label)) 
			{
				seatStatus.setAvailableSeats(seatStatus.getAvailableSeats() - passenger);
				seatStatus.setBookedSeats(seatStatus.getBookedSeats() + passenger);
				seatStatus.setBasicEconomySeatsAvailable(seatStatus.getBasicEconomySeatsAvailable() - passenger);
				seatStatus.setBasicEconomySeatsBooked(seatStatus.getBasicEconomySeatsBooked() + passenger);
			} 
			else 
				if (classOfJourney.equals(SeatClass.PREMIUM_ECONOMY.label)) 
				{
					seatStatus.setAvailableSeats(seatStatus.getAvailableSeats() - passenger);
					seatStatus.setBookedSeats(seatStatus.getBookedSeats() + passenger);
					seatStatus.setPremiumEconomySeatsAvailable(seatStatus.getPremiumEconomySeatsAvailable() - passenger);
					seatStatus.setPremiumEconomySeatsBooked(seatStatus.getPremiumEconomySeatsBooked() + passenger);
				} 
				else 
					if (classOfJourney.equals(SeatClass.BUSINESS.label)) 
					{
						seatStatus.setAvailableSeats(seatStatus.getAvailableSeats() - passenger);
						seatStatus.setBookedSeats(seatStatus.getBookedSeats() + passenger);
						seatStatus.setBusinessSeatsAvailable(seatStatus.getBusinessSeatsAvailable() - passenger);
						seatStatus.setBusinessSeatsBooked(seatStatus.getBusinessSeatsBooked() + passenger);
					} 
					else 
					{
						seatStatus.setAvailableSeats(seatStatus.getAvailableSeats() - passenger);
						seatStatus.setBookedSeats(seatStatus.getBookedSeats() + passenger);
						seatStatus.setFirstSeatsAvailable(seatStatus.getFirstSeatsAvailable() - passenger);
						seatStatus.setFirstSeatsBooked(seatStatus.getFirstSeatsBooked() + passenger);
					}

		return seatStatus;
	}
	
	@Bean
	public String generateOneTimePassword() 
	{
		PasswordEncoder encoder  = NoOpPasswordEncoder.getInstance();
		String OTP = RandomString.make(8);
		String encodedOTP = encoder.encode(OTP);
		return encodedOTP;
	}
}
