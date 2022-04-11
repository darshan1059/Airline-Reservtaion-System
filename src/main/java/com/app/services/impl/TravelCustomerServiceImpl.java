package com.app.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.TravelCustomerRepository;
import com.app.pojos.TravelCustomer;
import com.app.services.TravelCustomerService;

@Transactional
@Service
public class TravelCustomerServiceImpl implements TravelCustomerService {
	
	@Autowired
	private TravelCustomerRepository travelCustomerRepository;

	@Override
	public void saveTravelCustomer(TravelCustomer customer) {
		travelCustomerRepository.save(customer);
	}
	 

	@Override
	public List<TravelCustomer> findByTicketId(Integer id) {
		// TODO Auto-generated method stub
		return travelCustomerRepository.findAllTravelCustomerByticketId(id);
	}

	@Override
	public void deleteTravelCustomer(TravelCustomer customer) {
		travelCustomerRepository.delete(customer);
	}

	@Override
	public List<TravelCustomer> getAllTravelCustomerDetails() {
		return travelCustomerRepository.findAll();
	}

	@Override
	public void deleteCustomerDetailById(Integer id) {
		
	}

}
