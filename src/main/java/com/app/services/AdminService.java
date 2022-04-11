package com.app.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.pojos.Customer;
import com.app.pojos.FlightDetails;
import com.app.pojos.Seat;

@Transactional
@Service
public interface AdminService {
	public List<Customer> getAllCustomerDetails();
}
