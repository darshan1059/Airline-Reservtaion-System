package com.app.controller;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.util.FileCopyUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.app.dto.Contact;
import com.app.dto.PropertyFileReader;
import com.app.dto.Search;
import com.app.dto.SearchedFlightDetails;
import com.app.enums.SeatClass;
import com.app.pojos.Airport;
import com.app.pojos.CreditCard;
import com.app.pojos.Customer;
import com.app.pojos.FlightDetails;
import com.app.pojos.Seat;
import com.app.pojos.SeatStatus;
import com.app.pojos.TicketBooking;
import com.app.pojos.TravelCustomer;
import com.app.services.AirportService;
import com.app.services.CustomerService;
import com.app.services.FlightService;
import com.app.services.SearchedFlightDetailsService;
import com.app.services.SeatService;
import com.app.services.SeatStatusService;
import com.app.services.TicketBookingService;
import com.app.util.EmailService;
import com.app.util.ExtraUtilityWork;
import com.app.util.PdfJasper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

@Controller
@SessionAttributes({ "flightDetails", "search", "user", "customer", "role", "userObj", "userEmail" })
public class PublicUserController 
{
	@Autowired
	private SearchedFlightDetailsService searchedFlightDetailsService;

	@Autowired
	private FlightService flightService;

	@Autowired
	private SeatService seatService;

	@Autowired
	private SeatStatusService seatStatusService;

	@Autowired
	private PdfJasper pdfJasper;

	@Autowired
	private ExtraUtilityWork utility;

	@Autowired
	private TicketBookingService ticketBookingService;
	
	@Autowired
	private EmailService emailService;

	@Autowired
	private CustomerService customerService;

	@Autowired
	private PropertyFileReader propertyFileReader;

	
	@Autowired
	private AirportService airportService;

	Search search = null;
	TicketBooking ticket = null;
	FlightDetails flight = null;
	Seat seat = null;
	SeatStatus seatStatus = null;
	String classOfJourney = null;
	Customer customer = null;
	Airport sourceAirport = null;
	Airport destinationAirport = null;
//	User user = null;

	@GetMapping("/")
	public String airlineHomePage(ModelMap model, HttpSession session, Authentication authentication) 
	{
		/*
		 * if (model.containsAttribute("search")) model.remove("search"); if
		 * (model.containsAttribute("flightDetails")) model.remove("flightDetails");
		 * session.invalidate();
		 */
		if (authentication != null) 
		{
			boolean found = authentication.getAuthorities().stream().anyMatch(p -> p.getAuthority().equals("ADMIN"));
			model.addAttribute("role", found);
		}
//		flightService.op();
		model.addAttribute("search", new Search());

		return "index";
	}

	@PostMapping("/")
	public String airlineSearchResult(@RequestParam("source") String source,
			@RequestParam("destination") String destination, @RequestParam("journeyDate") String journeyDate,
			@RequestParam("returnDate") String returnDate, @RequestParam("passenger") String passenger,
			@RequestParam("classOfjourney") String classOfjourney, ModelMap model) 
	{
		LocalDate date = LocalDate.parse(journeyDate);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
		String text1 = date.format(formatter);
		LocalDate parsedJourneyDate = LocalDate.parse(text1, formatter);
		
		LocalDate date2 = LocalDate.parse(returnDate);
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy MM dd");
		String text2 = date2.format(formatter1);
		LocalDate parsedReturnDate = LocalDate.parse(text2, formatter1);

		Search search = new Search();
		search.setSource(source.toUpperCase());
		search.setDestination(destination.toUpperCase());
		search.setJourneyDate(parsedJourneyDate);
		search.setReturnDate(parsedReturnDate);
		search.setPassenger(Integer.parseInt(passenger));
		search.setClassOfjourney(classOfjourney);
		this.search = search;
		classOfJourney = search.getClassOfjourney();
		SearchedFlightDetails searchFlightDetails = searchedFlightDetailsService.getSearchDetails(search);
		model.addAttribute("searchedFlightDetailList", searchFlightDetails);
		model.addAttribute("flightData", searchFlightDetails.getFlightList().size() <= 0);
		return "SearchResult";
	}

	@GetMapping("/login")
	public String customerLogin(HttpServletRequest request, Model model) 
	{
		return "login";
	}

	@GetMapping("/userinfo")
	public String customerInfo(Model model, HttpSession session) 
	{
		this.customer = (Customer) session.getAttribute("userObj");
		String email = (String) session.getAttribute("userEmail");
		if (customer != null) {
			model.addAttribute("ticketBookingHistory",
					ticketBookingService.getTicketByCustomerId(customer.getCustomerId()));
		} else if (email != null) {
			model.addAttribute("ticketBookingHistory", ticketBookingService.getTicketByUserEmail(email));
		} else {
			model.addAttribute("ticketBookingHistory", null);
		}
		return "UserInfo";
	}

	@GetMapping("/signup")
	public String customerRegistration(ModelMap model) 
	{
		model.addAttribute("customer", new Customer());
		return "signup";
	}

	@PostMapping("/signup")
	public String customerRegistrationPost(@ModelAttribute Customer customer, BindingResult error, ModelMap model) 
	{
		this.customer = customerService.saveCustomerDetails(customer);
		emailService.performOtpOperation(customer);
		model.addAttribute("customer", customer);
		System.out.println("customer.getOneTimePassword() inside post signup" + customer.getOneTimePassword());
		return "redirect:/verify";
	}

	@GetMapping("/verify")
	public String customerEmailVerifyGet(ModelMap model) 
	{
		System.out.println("customer.getOneTimePassword() inside get verify" + customer.getOneTimePassword());
		model.addAttribute("code", customer.getOneTimePassword());
		return "EmailVerification";
	}

	@PostMapping("/verify")
	public String customerEmailVerifyPost() 
	{
		this.customer.setEnabled(true);
		customerService.updateCustomer(this.customer);
		return "redirect:/login";
	}

	@GetMapping("/moredetails")
	public String airlineFullSearchResult(@RequestParam int id, ModelMap model) 
	{
		flight = flightService.getFlightById(id);
		seat = seatService.getSeatByClassAndFlightId(search.getClassOfjourney(), id);
		seatStatus = seatStatusService.getSeatStatusOfFlight(id);
		sourceAirport = airportService.getAirportDetailsByFlightIdAndCity(id, flight.getSource());
		destinationAirport = airportService.getAirportDetailsByFlightIdAndCity(id, flight.getDestination());
		model.addAttribute("flightDetails", flight);
		model.addAttribute("seat", seat);
		model.addAttribute("listOfPassenger", search.getPassenger());
		model.addAttribute("sourceairport", sourceAirport);
		model.addAttribute("destinationairport", destinationAirport);
		return "AddTravelCustomer";
	}

	@PostMapping(value = "/payment", consumes = "application/json", produces = "application/json")
	public void airlineFullSearchResultPost(@RequestBody TicketBooking data)
			throws JsonMappingException, JsonProcessingException 
	{
		this.ticket = data;
//		System.out.println("Before: " +this.ticket);
		for (int i = 0; i < ticket.getTravelCustomer().size(); i++) 
		{
			ticket.getTravelCustomer().get(i).setCabin("7 Kg");
			ticket.getTravelCustomer().get(i).setCheckIn("15 Kg");
			if (classOfJourney.equals(SeatClass.ECONOMY.label)) {
				ticket.getTravelCustomer().get(i).setSeatNumber(seatStatus.getEconomySeatsBooked() + (i+1) + "E");
			} else if (classOfJourney.equals(SeatClass.BASIC_ECONOMY.label)) {
				ticket.getTravelCustomer().get(i).setSeatNumber(seatStatus.getBasicEconomySeatsBooked() + (i+1) + "BE");
			} else if (classOfJourney.equals(SeatClass.PREMIUM_ECONOMY.label)) {
				ticket.getTravelCustomer().get(i).setSeatNumber(seatStatus.getPremiumEconomySeatsBooked() + (i+1) + "PE");
			} else if (classOfJourney.equals(SeatClass.BUSINESS.label)) {
				ticket.getTravelCustomer().get(i).setSeatNumber(seatStatus.getBusinessSeatsBooked() + (i+1) + "B");
			} else {
				ticket.getTravelCustomer().get(i).setSeatNumber(seatStatus.getFirstSeatsBooked() + (i+1) + "F");
			}
		}

		ticket.setTicketId((int) (Math.random() * 10000000));
		ticket.setBookingId(String.valueOf((int) (Math.random() * 1000000)));
		int length = 5;
		boolean useLetters = true;
		boolean useNumbers = true;
		String generatedString = RandomStringUtils.random(length, useLetters, useNumbers);
		this.ticket.setPnrNumber(generatedString.toLowerCase());
//		System.out.println("CCCC /payment:- "+this.ticket);
		System.out.println("After: " + this.ticket);
	}

	@GetMapping(value = "/paymentProcess")
	public String airlineFullPayment(ModelMap model) 
	{
		model.addAttribute("payment", new CreditCard());
		return "PaymentProcess";
	}

	@PostMapping(value = "/paymentProcess")
	public String airlineFullPaymentPost(@ModelAttribute("payment") CreditCard credit, BindingResult error,
			ModelMap model, HttpSession session) 
	{
		this.customer = (Customer) session.getAttribute("userObj");
		String email = (String) session.getAttribute("userEmail");
//		System.out.println("CCC /paymentprocess:= " + this.ticket);
		if (this.customer != null) 
		{
			this.ticket.setCustomerId(this.customer.getCustomerId());
		} 
		else 
			if (email != null) 
			{
				this.ticket.setUserEmail(email);
			}
		List<TravelCustomer> tempTrav = new ArrayList<>();
		for (TravelCustomer cust : this.ticket.getTravelCustomer()) 
		{
			cust.setTicket(this.ticket);
			tempTrav.add(cust);
		}
		this.ticket.setTravelCustomer(tempTrav);
		this.ticket.setFlight(flight);
		ticketBookingService.saveTicketDetails(this.ticket);
		model.addAttribute("ticketBooking", ticket);
		model.addAttribute("credit", credit);
		model.addAttribute("flightDetails", flight);
		model.addAttribute("listOfPassenger", search.getPassenger());
		model.addAttribute("seat", seat);
		seatStatusService.saveSeatStatus(utility.updateSeats(seatStatus, search));
		pdfJasper.exportReport(ticket, credit, flight, seat, search, sourceAirport, destinationAirport);
		this.sendEmailData(session);
		return "PaymentSuccess";
	}

	@RequestMapping("/filedownload/{fileName}")
	public void downloadPDFResource(@PathVariable String fileName, HttpServletRequest request,
			HttpServletResponse response) throws IOException 
	{
		File file = new File(propertyFileReader.getDirPlace() + fileName + ".pdf");
		if (file.exists()) 
		{
			// get the mimetype
			String mimeType = URLConnection.guessContentTypeFromName(fileName + ".pdf");
			if (mimeType == null) 
			{
				// unknown mimetype so set the mimetype to application/octet-stream
				mimeType = "application/octet-stream";
			}
			response.setContentType(mimeType);
			/**
			 * In a regular HTTP response, the Content-Disposition response header is a
			 * header indicating if the content is expected to be displayed inline in the
			 * browser, that is, as a Web page or as part of a Web page, or as an
			 * attachment, that is downloaded and saved locally.
			 * 
			 */

			/**
			 * Here we have mentioned it to show inline
			 */
			response.setHeader("Content-Disposition", String.format("inline; filename=\"" + file.getName() + "\""));
			// Here we have mentioned it to show as attachment
			// response.setHeader("Content-Disposition", String.format("attachment;
			// filename=\"" + file.getName() + "\""));
			response.setContentLength((int) file.length());
			InputStream inputStream = new BufferedInputStream(new FileInputStream(file));
			FileCopyUtils.copy(inputStream, response.getOutputStream());

		}
	}

	public void sendEmailData(HttpSession session) 
	{
		String email = (String) session.getAttribute("userEmail");
		Map<String, String> model = new HashMap<>();
		if (this.customer != null) 
		{
			model.put("customerName", this.customer.getFirstName());
		} 
		else 
			if (email != null) 
			{
				model.put("customerName", (String) session.getAttribute("user"));
			}
		try 
		{
			emailService.sendMail(ticket, flight, model);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

	@GetMapping("/deletebooking")
	public String deleteBookingUser(@RequestParam int id) 
	{
		ticketBookingService.deleteTicketById(id);
		return "redirect:/userinfo";
	}

	@GetMapping("/403")
	public String accessDenied() 
	{
		return "AccessDenied";
	}

	@GetMapping("/about")
	public String aboutus() 
	{
		return "About";
	}

	@GetMapping("/contact")
	public String contactus(ModelMap model) 
	{
		model.addAttribute("contact", new Contact());
		return "Contact";
	}

	@PostMapping("/contact")
	public String contactusPost(@ModelAttribute("contact") Contact contact, BindingResult error, ModelMap model) 
	{
		model.addAttribute("isSuccess", emailService.sendEmailContact(contact));
		return "redirect:/contact";
	}

	@GetMapping("/privacypolicy")
	public String privacypolicy() 
	{
		return "PrivacyPolicy";
	}
}
