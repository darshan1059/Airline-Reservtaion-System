package com.app.services.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.pojos.Airport;
import com.app.pojos.FlightDetails;
import com.app.pojos.Search;
import com.app.pojos.SearchedFlightDetails;
import com.app.pojos.Seat;
import com.app.services.AirportService;
import com.app.services.FlightService;
import com.app.services.SearchedFlightDetailsService;
import com.app.services.SeatService;

@Service
public class SearchedFlightDetailsServiceImpl implements SearchedFlightDetailsService {

	@Autowired
	private FlightService flightService;

	@Autowired
	private SeatService seatService;
	@Autowired
	private AirportService airportService;

	/**
	 * 
	 */
	public SearchedFlightDetailsServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public SearchedFlightDetails getSearchDetails(Search search) {
		// TODO Auto-generated method stub
		SearchedFlightDetails searchFlightDetails = new SearchedFlightDetails();
		ArrayList<Seat> seatList = new ArrayList<Seat>();
		ArrayList<Airport> airportSourceList = new ArrayList<Airport>();
		ArrayList<Airport> airportDestinationList = new ArrayList<Airport>();
		searchFlightDetails.setFlightList(flightService.getFlightBySourceAndDestinationAndDepartureDate(search));
		for (int i = 0; i < searchFlightDetails.getFlightList().size(); i++) {
			Seat seat = seatService.getSeatByClassAndFlightId(search.getClassOfjourney(),
					searchFlightDetails.getFlightList().get(i).getFlightId());
			Airport sourceairport = airportService.getAirportDetailsByFlightIdAndCity(
					searchFlightDetails.getFlightList().get(i).getFlightId(),
					searchFlightDetails.getFlightList().get(i).getSource());
			airportSourceList.add(sourceairport);
			Airport desitinationairport = airportService.getAirportDetailsByFlightIdAndCity(
					searchFlightDetails.getFlightList().get(i).getFlightId(),
					searchFlightDetails.getFlightList().get(i).getDestination());
			airportDestinationList.add(desitinationairport);
			seatList.add(seat);
		}
		searchFlightDetails.setAirportSourceList(airportSourceList);
		searchFlightDetails.setAirportDestinationList(airportDestinationList);
		searchFlightDetails.setSeatList(seatList);
		return searchFlightDetails;
	}

	@Override
	public SearchedFlightDetails saveFlightAndSeat(FlightDetails flight, Seat seat) {
		// TODO Auto-generated method stub
		return null;
	}

}
