package com.app.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.SeatStatusRepository;
import com.app.exception.SeatStatusException;
import com.app.pojos.SeatStatus;
import com.app.services.SeatStatusService;

@Service
public class SeatStatusServiceImpl implements SeatStatusService {

	@Autowired
	private SeatStatusRepository seatStatusRepository;

	public SeatStatusServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public SeatStatus getSeatStatusOfFlight(int flightId) {
		// TODO Auto-generated method stub
		SeatStatus seatStatus = seatStatusRepository.findByFlightId(flightId);
		if (seatStatus == null)
			throw new SeatStatusException("No any seat information related to this flightid: " + flightId);
		return seatStatus;
	}

	@Override
	public List<SeatStatus> getAllSeatStatus() {
		// TODO Auto-generated method stub
		List<SeatStatus> seatList = seatStatusRepository.findAll();
		if (seatList == null)
			throw new SeatStatusException("No any flights seat info");
		return seatList;
	}

	@Override
	public SeatStatus saveSeatStatus(SeatStatus seatstatus) {
		// TODO Auto-generated method stub
		SeatStatus seatStatus = seatStatusRepository.save(seatstatus);
		if (seatStatus == null)
			throw new SeatStatusException("We cannot save this flight seat information");
		return seatstatus;
	}

	@Override
	public void deleteSeatStatus(SeatStatus seatstatus) {

		// TODO Auto-generated method stub
		seatStatusRepository.delete(seatstatus);
		SeatStatus seatStatus = seatStatusRepository.findByFlightId(seatstatus.getFlightId());
		if (seatStatus != null)
			throw new SeatStatusException("Sorry we cannot delete this flight seat: " + seatstatus.getFlightId());

	}

}
