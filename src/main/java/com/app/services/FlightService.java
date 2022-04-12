package com.app.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.app.dto.Search;
import com.app.pojos.FlightDetails;

@Service
public interface FlightService{
	public FlightDetails getFlightById(Integer id);

	public List<FlightDetails> getAllFlightDetails();

	public FlightDetails saveFlightDetails(FlightDetails flight);

	public void deleteFlightDetails(FlightDetails flight);
	
	public void deleteFlightById(Integer id);
	
//	public List<FlightDetails> getFlightBySourceAndDestination(Search search);

	public List<FlightDetails> getFlightBySourceAndDestinationAndDepartureDate(Search search);
	
	public List<Integer> getAllFlightsId();
	
	public Page<FlightDetails> getAllFlight(Pageable page);

	public long count();
	
	//public void op();
}
