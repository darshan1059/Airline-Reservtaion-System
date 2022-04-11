package com.app.services.impl;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.app.dao.FlightDetailsRepository;
import com.app.exception.FlightDetailsException;
import com.app.pojos.FlightDetails;
import com.app.pojos.Search;
import com.app.services.FlightService;

@Service
public class FlightServiceImpl implements FlightService {

	@Autowired
	private FlightDetailsRepository flightDetailsRepository;

	@Override
	public FlightDetails getFlightById(Integer id) throws FlightDetailsException {
		// TODO Auto-generated method stub
		FlightDetails flight = flightDetailsRepository.getById(id);
		if (flight == null)
			throw new FlightDetailsException("No flight for this id: " + id);
		else
			return flight;
	}

	@Override
	public List<FlightDetails> getAllFlightDetails() throws FlightDetailsException {
		// TODO Auto-generated method stub
		List<FlightDetails> flightList = flightDetailsRepository.findAll();
		if (flightList == null)
			throw new FlightDetailsException("No flights are available");
		else {

			return flightList;
		}
	}

	@Override
	public FlightDetails saveFlightDetails(FlightDetails flight) throws FlightDetailsException 
	{
		LocalDateTime flightArrival = LocalDateTime.of(flight.getArrivalDate(), flight.getArrivalTime());
		LocalDateTime flightDeparture = LocalDateTime.of(flight.getDepartureDate(), flight.getDepartureTime());
		Duration duration = Duration.between(flightDeparture, flightArrival);
        long time = duration.toMinutes();
//        int min = (int)time%60;
//        int hrs = (int)time/60;
        
        String dur = (int)time/60 + " hr " + (int)time%60 + " min";
        flight.setDuration(dur);
		FlightDetails savedFlight = flightDetailsRepository.save(flight);
		if (savedFlight == null)
			throw new FlightDetailsException("Please provide correct details");
		else
			return savedFlight;
	}

	@Override
	public void deleteFlightDetails(FlightDetails flight) throws FlightDetailsException {
		// TODO Auto-generated method stub
		flightDetailsRepository.delete(flight);
		FlightDetails deletedFlight = flightDetailsRepository.getById(flight.getFlightId());
		if (deletedFlight != null)
			throw new FlightDetailsException("Sorry we are unable to delete this flight");
	}

	/*
	 * @Override public List<FlightDetails> getFlightBySourceAndDestination(Search
	 * search) { List<FlightDetails> flightList =
	 * flightDetailsRepository.findBySourceAndDestination(search.getSource(),
	 * search.getDestination());
	 * 
	 * if (flightList == null) throw new
	 * FlightDetailsException("No flights are available for this source: " +
	 * search.getSource() + " and destination: " + search.getDestination()); else {
	 * 
	 * for (FlightDetails flight : flightList) { this.saveFlightDetails(flight); }
	 * 
	 * return flightList; } }
	 */

	@Override
	public List<FlightDetails> getFlightBySourceAndDestinationAndDepartureDate(Search search) {
//		LocalDateTime currentDate = LocalDateTime.of(search.getJourneyDate().toLocalDate(), LocalTime.of(0,01,01));
		/*
		 * System.out.println(currentDate); System.out.println(search.getJourneyDate());
		 */
//		System.out.println(currentDate);
		List<FlightDetails> flightList = flightDetailsRepository
				.findBySourceAndDestinationAndDepartureDate(search.getSource(), search.getDestination(), search.getJourneyDate());

		if (flightList == null)
			throw new FlightDetailsException("No flights are available for this source: " + search.getSource()
					+ " and destination: " + search.getDestination());
		else {
			/*
			 * System.out.println(flightList.size()); for (FlightDetails flight :
			 * flightList) { System.out.println("Arrival: " + flight.getArrival()
			 * +"Departure: " + flight.getDeparture()); }
			 */

			return flightList;
		}
	}

	@Override
	public void deleteFlightById(Integer id) {
		flightDetailsRepository.deleteById(id);
	}

	@Override
	public List<Integer> getAllFlightsId() {
		return flightDetailsRepository.findAllByFlightId();
	}

	@Override
	public Iterable<FlightDetails> getAllFlight(Pageable page) {
		return flightDetailsRepository.findAll(page);
	}

	@Override
	public long count() {
		return flightDetailsRepository.count();
	}

}
