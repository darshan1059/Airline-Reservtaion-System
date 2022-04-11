package com.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.app.pojos.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> 
{
	public Customer findByUsername(String username);
	
	public Customer findByUsernameAndPassword(String username, String password);
	
	@Modifying(clearAutomatically = true)
	@Query("update Customer u set u.enabled = :enabled where u.customerId =:customerId")
	public void updateCustomerByEnabled(@Param("enabled") Boolean enabled, @Param("customerId") int customerid);
	
	public List<Customer> findByRole(String Role);
}
