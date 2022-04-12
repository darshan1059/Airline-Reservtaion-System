package com.app.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.TicketBookingRepository;
import com.app.pojos.TicketBooking;
import com.app.pojos.TravelCustomer;
import com.app.services.TicketBookingService;

@Transactional
@Service
public class TicketBookingServiceImpl implements TicketBookingService {
	
	@Autowired
	private TicketBookingRepository ticketBookingRepository;

	@Override
	public void saveTicketDetails(TicketBooking ticket) {
		ticketBookingRepository.save(ticket);
	}

	@Override
	public void deleteTicketDetails(TicketBooking ticket) {
		ticketBookingRepository.delete(ticket);
	}

	@Override
	public List<TicketBooking> getAllTicketBookingDetails() {
		return ticketBookingRepository.findAll();
	}

	@Override
	public TicketBooking getTicketById(Integer id) {
		return ticketBookingRepository.findByTicketId(id);
	}

	@Override
	public List<TicketBooking> getTicketByCustomerId(Integer id) {
		return ticketBookingRepository.findByCustomerId(id);
	}

	@Override
	public List<TicketBooking> getTicketByUserEmail(String useremail) {
		return ticketBookingRepository.findByUserEmail(useremail);
	}

	@Override
	public void deleteTicketById(Integer id) {
		ticketBookingRepository.deleteById(id);
	}

	@Override
	public List<TravelCustomer> getTravelCustomerByFlight(int id) {
		return ticketBookingRepository.displayCustomersByFlightId(id);
	}

}
