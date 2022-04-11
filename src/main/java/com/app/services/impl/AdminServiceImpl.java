package com.app.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.pojos.Customer;
import com.app.pojos.FlightDetails;
import com.app.pojos.Seat;
import com.app.services.AdminService;
import com.app.services.CustomerService;
import com.app.services.FlightService;
import com.app.services.SeatService;

@Transactional
@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private CustomerService customerService;

	@Override
	public List<Customer> getAllCustomerDetails() {
		return customerService.getAllCustomerDetailsExceptAdmin();
	}

}
