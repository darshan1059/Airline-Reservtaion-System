package com.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.app.pojos.TravelCustomer;

@Repository
public interface TravelCustomerRepository extends JpaRepository<TravelCustomer, Integer> {
	
	@Modifying(clearAutomatically = true)
	@Query(value = "select u from TravelCustomer u WHERE u.ticket.ticketId = :ticketId")
	List<TravelCustomer> findAllTravelCustomerByticketId(@Param("ticketId")Integer ticketid);

}
