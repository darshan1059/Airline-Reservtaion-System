package com.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.pojos.Seat;

@Repository
public interface SeatRepository extends JpaRepository<Seat, Integer> {
	
	public Seat findBySeatClassAndFlightId(String seatClass, Integer flightId);
	public List<Seat> findByFlightId(Integer flightId);

}
