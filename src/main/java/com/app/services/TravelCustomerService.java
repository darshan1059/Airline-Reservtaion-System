package com.app.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.pojos.TravelCustomer;

@Service
public interface TravelCustomerService {

	public void saveTravelCustomer(TravelCustomer customer);

	public List<TravelCustomer> findByTicketId(Integer id);

	public void deleteTravelCustomer(TravelCustomer customer);

	public void deleteCustomerDetailById(Integer id);

	public List<TravelCustomer> getAllTravelCustomerDetails();
}
