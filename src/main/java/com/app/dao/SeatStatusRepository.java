package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.pojos.SeatStatus;

@Repository
public interface SeatStatusRepository extends JpaRepository<SeatStatus, Integer> 
{
	public SeatStatus findByFlightId(Integer flightId);
}
