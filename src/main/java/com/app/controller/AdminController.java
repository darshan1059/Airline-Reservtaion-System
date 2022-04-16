/**
 * 
 */
package com.app.controller;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.app.pojos.Airport;
import com.app.pojos.Customer;
import com.app.pojos.FlightDetails;
import com.app.pojos.Seat;
import com.app.services.AirportService;
import com.app.services.CustomerService;
import com.app.services.FlightService;
import com.app.services.SeatService;
import com.app.services.TicketBookingService;
import com.app.services.TravelCustomerService;

@Controller
@SessionAttributes({ "role" })
public class AdminController 
{
	private static final int PAGE_SIZE = 10; // Number of rows to contain per page
    private long totalFlightsCount; // number of rows in Database
    
    private long totalCustomerCount;
    
    private long totalSeatCount;
    
    private long totalAirportCount;
    
	
	@Autowired
	private FlightService flightService;
	
	@Autowired
	private SeatService seatService;
	
	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private AirportService airportService;
	
	@Autowired
	private TicketBookingService ticketBookingService;
	
	@Autowired
	private TravelCustomerService travelCustomerService;

	@GetMapping("/getAllCustomer/{pageNo}")
	public String adminCustomerGet(ModelMap model, Authentication authentication, @PathVariable String pageNo) 
	{
		int lastPageNo;
		int goToPageNo = Integer.parseInt(pageNo);

		Set<Customer> allCustomers = new LinkedHashSet<Customer>();
		for (Customer c : customerService
				.getAllCustomers(PageRequest.of(goToPageNo, PAGE_SIZE, Sort.Direction.ASC, "customerId"))) {
			allCustomers.add(c);
		}

		totalCustomerCount = customerService.countCustomers();
		if (totalCustomerCount % PAGE_SIZE != 0)
			lastPageNo = (int) (totalCustomerCount / PAGE_SIZE) + 1;
		else
			lastPageNo = (int) (totalCustomerCount / PAGE_SIZE);

		model.addAttribute("lastPageNo", lastPageNo);
		model.addAttribute("customerList", allCustomers);
		return "GetAllCustomer";
	}

	@GetMapping("/getAllFlight/{pageNo}")
	public String adminAllFlightGet(ModelMap model, Authentication authentication, HttpSession session, @PathVariable String pageNo) 
	{	
        int lastPageNo;
        int gotoPageNo = Integer.parseInt(pageNo);
        
        Set<FlightDetails> allFlights = new LinkedHashSet<FlightDetails>();

        for (FlightDetails f: flightService.getAllFlight(PageRequest.of(gotoPageNo, PAGE_SIZE, Sort.Direction.ASC, "flightId"))) // fetches rows from Database as per Page No
        {
            allFlights.add(f);
        }

        totalFlightsCount = flightService.count(); //total no of flights
        if (totalFlightsCount % PAGE_SIZE != 0)
            lastPageNo = (int)(totalFlightsCount / PAGE_SIZE) + 1; // get last page No (zero based)
        else
            lastPageNo = (int)(totalFlightsCount / PAGE_SIZE);
        
        System.out.println("GoToPageNo "+gotoPageNo);
        System.out.println("PageNo "+pageNo);
        System.out.println("LastPageNo "+lastPageNo);
        System.out.println("Set "+allFlights);
        System.out.println("Count "+totalFlightsCount);
        
        model.addAttribute("lastPageNo", lastPageNo);
        model.addAttribute("flightList", allFlights);
        return "GetAllFlight";
    }

	@GetMapping("/getAllSeat/{pageNo}")
	public String adminAllSeatGet(ModelMap model, Authentication authentication, @PathVariable String pageNo) 
	{
		int lastPageNo;
		int gotoPageNo = Integer.parseInt(pageNo);
		Set<Seat> allSeats = new LinkedHashSet<Seat>();
		for (Seat s : seatService.getAllSeat(PageRequest.of(gotoPageNo, PAGE_SIZE, Sort.Direction.ASC, "seatId"))) {
			allSeats.add(s);
		}
		totalSeatCount = seatService.countSeats();
		if (totalFlightsCount % PAGE_SIZE != 0)
			lastPageNo = (int) (totalSeatCount / PAGE_SIZE) + 1; // get last page No (zero based)
		else
			lastPageNo = (int) (totalSeatCount / PAGE_SIZE);

		model.addAttribute("lastPageNo", lastPageNo);
		model.addAttribute("seatList", allSeats);
		return "GetAllSeat";
	}

	@GetMapping("/updatecustomer")
	public String adminUpdateCustomerGet(@RequestParam int id, ModelMap model) 
	{
		model.addAttribute("customer", customerService.getCustomerById(id));
		return "UpdateUser";
	}

	@PostMapping("/updatecustomer")
	public String adminAddCustomerPost(@ModelAttribute("customer") Customer customer, BindingResult bindingResult,
			ModelMap model) 
	{
		customerService.saveCustomerDetails(customer);
		return "redirect:/getAllCustomer/0";
	}

	@GetMapping("/addcustomer")
	public String adminAddCustomerGet(ModelMap model) 
	{
		model.addAttribute("customer", new Customer());
		return "AddCustomer";
	}

	@PostMapping("/addcustomer")
	public String adminUpdateCustomerPost(@ModelAttribute("customer") Customer customer, BindingResult bindingResult,
			ModelMap model) 
	{
		customerService.saveCustomerDetails(customer);
		return "redirect:/getAllCustomer/0";
	}

	@GetMapping("/deletecustomer")
	public String adminDeleteCustomerGet(@RequestParam int id, ModelMap model) 
	{
		customerService.deleteCustomerById(id);
		return "redirect:/getAllCustomer/0";
	}

	@GetMapping("/updateflight")
	public String adminUpdateFlightGet(@RequestParam int id, ModelMap model) 
	{
		model.addAttribute("flightDetails", flightService.getFlightById(id));
		return "UpdateFlight";
	}

	@PostMapping("/updateflight")
	public String adminUpdateFlightPost(@ModelAttribute("flightDetails") FlightDetails flightDetails,
			BindingResult bindingResult, ModelMap model) 
	{
		System.out.println(flightDetails);
		flightService.saveFlightDetails(flightDetails);
		return "redirect:/getAllFlight/0";
	}

	@GetMapping("/deleteflight")
	public String admindeleteFlightGet(@RequestParam int id, ModelMap model) 
	{
		flightService.deleteFlightById(id);
		return "redirect:/getAllFlight/0";
	}

	@GetMapping("/updateseat")
	public String adminUpdateSeatGet(@RequestParam int id, ModelMap model) 
	{
		model.addAttribute("seat", seatService.getSeatById(id));
		return "UpdateSeat";
	}

	@PostMapping("/updateseat")
	public String adminUpdateSeatPost(@ModelAttribute("seat") Seat seat, BindingResult bindingResult, ModelMap model) 
	{
		seatService.saveSeat(seat);
		return "redirect:/getAllSeat/0";
	}

	@GetMapping("/deleteseat")
	public String adminDeleteSeatGet(@RequestParam int id, ModelMap model) 
	{
		seatService.deleteSeatById(id);
		return "redirect:/getAllSeat/0";
	}

	@GetMapping("/getAllAirport/{pageNo}")
	public String adminAirportAllGet(ModelMap model, Authentication authentication, HttpSession session,
			@PathVariable String pageNo) 
	{
		int lastPageNumber;
		int goToPageNumber = Integer.parseInt(pageNo);
		Set<Airport> allAirports = new LinkedHashSet<Airport>();
		for (Airport a : airportService
				.getAllAirports(PageRequest.of(goToPageNumber, PAGE_SIZE, Sort.Direction.ASC, "airportId"))) {
			allAirports.add(a);
		}

		totalAirportCount = airportService.countAirports();
		if (totalAirportCount % PAGE_SIZE != 0)
			lastPageNumber = (int) (totalAirportCount / PAGE_SIZE) + 1;
		else
			lastPageNumber = (int) (totalAirportCount / PAGE_SIZE);
		model.addAttribute("lastPageNumber", lastPageNumber);
		model.addAttribute("airportList", allAirports);
		return "GetAllAirport";
	}

	@GetMapping("/updateairport")
	public String adminAirportGet(@RequestParam int id, ModelMap model) 
	{
		model.addAttribute("airport", airportService.getAirportDetailsById(id));
		return "UpdateAirport";
	}

	@PostMapping("/updateairport")
	public String adminAirportPost(@ModelAttribute("airport") Airport airport, ModelMap model,
			BindingResult bindingResult) 
	{
		airportService.saveAirportDetails(airport);
		return "redirect:/getAllAirport/0";
	}

	@GetMapping("/deleteairport")
	public String adminAirportDeleteGet(@RequestParam int id, ModelMap model) 
	{
		airportService.deleteAirportDetailsById(id);
		return "redirect:/getAllAirport/0";
	}

	@GetMapping("/addairport")
	public String adminAirportAddGet(ModelMap model) 
	{
		model.addAttribute("airport", new Airport());
		model.addAttribute("flightDetailsIdList", flightService.getAllFlightsId());
		return "AddAirport";
	}

	@PostMapping("/addairport")
	public String adminAirportAddPost(@ModelAttribute("airport") Airport airport, ModelMap model,
			BindingResult bindingResult) 
	{
		airportService.saveAirportDetails(airport);
		return "redirect:/getAllAirport/0";
	}

	@GetMapping("/getallticketbooking")
	public String adminTicketBookingAllGet(ModelMap model) 
	{
		model.addAttribute("ticketBookingDetails", ticketBookingService.getAllTicketBookingDetails());
		return "GetAllTicketBooking";
	}
	
    @PostMapping("/getallticketbooking")
    public String adminDisplayBookingsByFlightId(@RequestParam int flightId, ModelMap map)
    {
        map.addAttribute("travelCustomerList", ticketBookingService.getTravelCustomerByFlight(flightId));
        map.addAttribute("flightId", flightId);
        return "GetTravelCustomerByFlight";
    }	

	@GetMapping("/deleteticketbooking")
	public String adminTicketBookingDeleteGet(@RequestParam int id, ModelMap model) 
	{
		ticketBookingService.deleteTicketById(id);
		return "redirect:/getallticketbooking";
	}
	
	@GetMapping("/getticketbookingcustomerinfo")
	public String adminTicketBookingCustomerInfo(@RequestParam int id, ModelMap model) 
	{
		model.addAttribute("ticketBookingDetailstraveler", travelCustomerService.findByTicketId(id));
		return "GetTravelCustomerDetails";
	}
}
