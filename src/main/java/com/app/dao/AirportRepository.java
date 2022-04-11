package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.pojos.Airport;

@Repository
public interface AirportRepository extends JpaRepository<Airport, Integer> 
{
	public Airport findByAirportId(Integer id);
	
	public Airport findByFlightIdAndCity(Integer flightId, String city);
}
