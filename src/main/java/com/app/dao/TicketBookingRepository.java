package com.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.pojos.TicketBooking;

@Repository
public interface TicketBookingRepository extends JpaRepository<TicketBooking, Integer> {

	public TicketBooking findByTicketId(Integer ticketId);

	public List<TicketBooking> findByCustomerId(Integer customerId);

	public List<TicketBooking> findByUserEmail(String userEmail);
}
