/**
 * 
 */
package com.app.pojos;

import java.util.List;

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
