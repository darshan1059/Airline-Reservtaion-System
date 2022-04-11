package com.app.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.SeatRepository;
import com.app.exception.SeatException;
import com.app.pojos.Seat;
import com.app.services.SeatService;

@Service
public class SeatServiceImpl implements SeatService {

	@Autowired
	private SeatRepository seatRepository;

	@Override
	public Seat getSeatById(Integer id) {
		// TODO Auto-generated method stub
		Seat seat = seatRepository.getById(id);
		if (seat == null)
			throw new SeatException("No Seats available for this id: " + id);
		return seat;
	}

	@Override
	public Seat getSeatByClassAndFlightId(String seatClass, Integer flightId) {
		// TODO Auto-generated method stub
		Seat seat = seatRepository.findBySeatClassAndFlightId(seatClass, flightId);
		if (seat == null)
			throw new SeatException("No Seats available for this class: " + seatClass + " and flightId: " + flightId);
		return seat;
	}

	@Override
	public List<Seat> getAllSeats() {
		// TODO Auto-generated method stub
		List<Seat> seat = seatRepository.findAll();
		if (seat == null)
			throw new SeatException("No Seats available for this flight");
//		System.out.println(seat.size());
		return seat;
	}

	@Override
	public Seat saveSeat(Seat seat) {
		// TODO Auto-generated method stub
		Seat tempSeat = seatRepository.save(seat);
		if (tempSeat == null)
			throw new SeatException("Please provide correct details");
		return tempSeat;
	}

	@Override
	public void deleteSeat(Seat seat) {
		// TODO Auto-generated method stub
		seatRepository.delete(seat);
		Seat tempSeat = seatRepository.getById(seat.getSeatId());
		if (tempSeat != null)
			throw new SeatException("Sorry! We are not able to delete this Seat.");
	}

	@Override
	public List<Seat> getSeatByFlightId(Integer flightId) {
		// TODO Auto-generated method stub
		List<Seat> seatList = seatRepository.findByFlightId(flightId);
		if (seatList == null)
			throw new SeatException("No Seats available for this flightId: " + flightId);
		return seatList;
	}

	@Override
	public void deleteSeatById(Integer id) {
		seatRepository.deleteById(id);
	}


}
