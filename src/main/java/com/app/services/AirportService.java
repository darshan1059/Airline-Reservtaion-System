package com.app.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.pojos.Airport;

@Transactional
@Service
public interface AirportService {
	
	public Airport getAirportDetailsById(Integer id);
	public List<Airport> getAllAirportDetails();
	public void saveAirportDetails(Airport airport);
	public void deleteAirportDetails(Airport airport);
	public void deleteAirportDetailsById(Integer id);
	public Airport getAirportDetailsByFlightIdAndCity(Integer flightid, String city);
	

}
