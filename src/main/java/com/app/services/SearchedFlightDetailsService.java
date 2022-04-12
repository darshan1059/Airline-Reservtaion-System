package com.app.services;

import org.springframework.stereotype.Service;

import com.app.dto.Search;
import com.app.dto.SearchedFlightDetails;
import com.app.pojos.FlightDetails;
import com.app.pojos.Seat;

@Service
public interface SearchedFlightDetailsService {
	
	public SearchedFlightDetails getSearchDetails(Search search);
	public SearchedFlightDetails saveFlightAndSeat(FlightDetails flight, Seat seat);
}
