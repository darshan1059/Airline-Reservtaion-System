package com.app.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.pojos.TicketBooking;

@Service
public interface TicketBookingService {
	
	public void saveTicketDetails(TicketBooking ticket);
	
	public void deleteTicketDetails(TicketBooking ticket);
	
	public void deleteTicketById(Integer id);
	
	public List<TicketBooking> getAllTicketBookingDetails();
	
	public TicketBooking getTicketById(Integer id);
	
	public List<TicketBooking> getTicketByCustomerId(Integer id);
	
	public List<TicketBooking> getTicketByUserEmail(String useremail);

}
