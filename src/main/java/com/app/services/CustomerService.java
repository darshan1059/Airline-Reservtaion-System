package com.app.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.pojos.Customer;

@Transactional
@Service("customerservice")
public interface CustomerService {

	public Customer getCustomerById(Integer id);

	public List<Customer> getAllCustomerDetails();
	
	public List<Customer> getAllCustomerDetailsExceptAdmin();

	public Customer saveCustomerDetails(Customer customer);

	public void deleteCustomer(Customer customer);

	public void deleteCustomerById(Integer id);

	public Customer getCustomerByUsername(String username);

	public void updateCustomer(Customer customer);
	
	public Customer authenticateUser(String username, String password);

	public Page<Customer> getAllCustomers(Pageable page);
	
	public long countCustomers();
}
