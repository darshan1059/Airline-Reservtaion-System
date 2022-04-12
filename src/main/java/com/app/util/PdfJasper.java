package com.app.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import com.app.dto.Search;
import com.app.pojos.Airport;
import com.app.pojos.CreditCard;
import com.app.pojos.FlightDetails;
import com.app.pojos.Seat;
import com.app.pojos.TicketBooking;
import com.app.pojos.TravelCustomer;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

@Service
public class PdfJasper 
{
	public void exportReport(TicketBooking ticket, CreditCard credit, FlightDetails flight, Seat seat, Search search, Airport sourceAirport, Airport destinationAirport) 
	{
		int listOfPassenger = search.getPassenger();
		// Enter path, where you want to store your PDF file
		// Example :- D:\\pdfrepo
		String path = "G:\\pdfrepo";
		//String path = "${user.dir}\\src\\pdf";
		// Enter path of the image to show in the pdf
		// Example :- C:\\Users\\xxx\\xx\\xx\\xx\\xx\\xx\\xx\\xx\\xx\\
		String imagePath = "G:\\images\\" + flight.getImageName();
		//String imagePath = "${user.dir}//src//images//" +flight.getImageName();
		List<TravelCustomer> travelCustomer = ticket.getTravelCustomer();
		List<TravelCustomer> tempCustomer = new ArrayList<TravelCustomer>();
		tempCustomer.add(new TravelCustomer());
		for (int i = 0; i < travelCustomer.size(); i++) 
		{
			tempCustomer.add(travelCustomer.get(i));
		}
		// load file and compile it
		try 
		{
			File file = ResourceUtils.getFile("classpath:jasperPdf.jrxml");
			JasperReport jasperReport = JasperCompileManager
					.compileReport(file.getAbsolutePath());
			JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(tempCustomer);
			Map<String, Object> parameters = new HashMap<>();
			parameters.put("TravelCustomerAllData", dataSource);
			parameters.put("image", imagePath);
			parameters.put("flightName", flight.getFlightName());
			parameters.put("flightNumber", flight.getFlightNumber());
			parameters.put("source", flight.getSource());
			parameters.put("arrival", flight.getArrivalTime().toString());
			parameters.put("datearrive", flight.getArrivalDate().toString());
			parameters.put("airportarrive", destinationAirport.getNameOfAirport());
			parameters.put("duration", flight.getDuration());
			parameters.put("destination", flight.getDestination());
			parameters.put("departure", flight.getDepartureTime().toString());
			parameters.put("datedepart", flight.getDepartureDate().toString());
			parameters.put("airportdepart", sourceAirport.getNameOfAirport());
			parameters.put("pnrNumber", ticket.getPnrNumber());
			parameters.put("email", ticket.getEmail());
			parameters.put("phoneNumber", ticket.getPhoneNumber());
			parameters.put("ticketCost", seat.getPriceForBooking() * listOfPassenger + (seat.getTax() * listOfPassenger));
			parameters.put("cancellationCharge", seat.getPriceForCancel());
			parameters.put("cardNumber", credit.getCardNumber());
			parameters.put("cvv", credit.getCvv());
			parameters.put("expiryandvalidity", credit.getExpiryMonth() + "/" + credit.getExpiryYear());
			parameters.put("websiteName", "google.com");
			parameters.put("websiteEmail", "jmkairline.service@gmail.com");
			parameters.put("customerCare", "+91xxxxxxxxxxx");
			parameters.put("socialLink", "youtube,telegram");
			parameters.put("bookingId", ticket.getBookingId());
			JasperPrint jasperPrint = JasperFillManager
					.fillReport(jasperReport, parameters, dataSource);
			JasperExportManager.exportReportToPdfFile(jasperPrint,
					path + "\\" + flight.getFlightName() 
					+ ticket.getBookingId() + ".pdf");
		} 
		catch (FileNotFoundException e3) 
		{
			System.out.println(e3.getMessage());
		} 
		catch (JRException e2) 
		{
			System.out.println(e2.getMessage());
		}
	}
}