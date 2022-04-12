package com.app.dto;

import java.util.List;

import com.app.pojos.Airport;
import com.app.pojos.FlightDetails;
import com.app.pojos.Seat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SearchedFlightDetails 
{
	private int searchFlightDetailsId;
	private List<FlightDetails> flightList;
	private List<Seat> seatList;
	private List<Airport> airportSourceList;
	private List<Airport> airportDestinationList;
}
