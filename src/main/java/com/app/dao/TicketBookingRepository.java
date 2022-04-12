package com.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.app.pojos.TicketBooking;
import com.app.pojos.TravelCustomer;

@Repository
public interface TicketBookingRepository extends JpaRepository<TicketBooking, Integer> {

	public TicketBooking findByTicketId(Integer ticketId);

	public List<TicketBooking> findByCustomerId(Integer customerId);

	public List<TicketBooking> findByUserEmail(String userEmail);
	
    @Query("select b.travelCustomer from TicketBooking b where b.flight.flightId = :flightId")
    public List<TravelCustomer> displayCustomersByFlightId(@Param("flightId") int flightId);
}
