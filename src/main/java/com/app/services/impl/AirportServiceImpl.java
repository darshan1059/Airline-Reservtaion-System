package com.app.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.AirportRepository;
import com.app.pojos.Airport;
import com.app.services.AirportService;

@Transactional
@Service
public class AirportServiceImpl implements AirportService {

	@Autowired
	private AirportRepository airportRepository;

	@Override
	public Airport getAirportDetailsById(Integer id) {
		return airportRepository.findByAirportId(id);
	}

	@Override
	public List<Airport> getAllAirportDetails() {
		return airportRepository.findAll();
	}

	@Override
	public void saveAirportDetails(Airport airport) {
		airportRepository.save(airport);
	}

	@Override
	public void deleteAirportDetails(Airport airport) {
		airportRepository.delete(airport);
	}

	@Override
	public void deleteAirportDetailsById(Integer id) {
		airportRepository.deleteById(id);
	}

	@Override
	public Airport getAirportDetailsByFlightIdAndCity(Integer flightid, String city) {
		return airportRepository.findByFlightIdAndCity(flightid, city);
	}

}
