package com.app.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.app.pojos.Seat;

@Service
public interface SeatService 
{
	public Seat getSeatById(Integer id);
	public Seat getSeatByClassAndFlightId(String seatClass, Integer flightId);
	public List<Seat> getAllSeats();
	public Seat saveSeat(Seat seat);
	public void deleteSeat(Seat seat);
	public void deleteSeatById(Integer id);
	public List<Seat> getSeatByFlightId(Integer flightid);
	public Page<Seat> getAllSeat(Pageable page);
	public long countSeats();
}
