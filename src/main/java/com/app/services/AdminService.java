package com.app.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.pojos.Customer;

@Transactional
@Service
public interface AdminService {
	public List<Customer> getAllCustomerDetails();
}
