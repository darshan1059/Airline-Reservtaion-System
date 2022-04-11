package com.app.dao;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.app.pojos.FlightDetails;

@Repository
public interface FlightDetailsRepository extends JpaRepository<FlightDetails, Integer>, CrudRepository<FlightDetails, Integer>
{

	@Modifying(clearAutomatically = true)
	@Query("select u from FlightDetails u WHERE u.source = :source and u.destination =:destination and u.departureDate =:departure")
	public List<FlightDetails> findBySourceAndDestinationAndDepartureDate(@Param("source") String source,
			@Param("destination") String destination, @Param("departure") LocalDate departureDate);

	@Modifying(clearAutomatically = true)
	@Query("select u.flightId from FlightDetails u")
	public List<Integer> findAllByFlightId();

	public FlightDetails findByFlightId(Integer id);
	
	public Page<FlightDetails> findAll(Pageable page);
}
