/**
 * 
 */
package com.app.controller;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
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
import com.app.services.AdminService;
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
    
	@Autowired
	private AdminService adminService;
	
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

	@GetMapping("/getAllCustomer")
	public String adminCustomerGet(ModelMap model, Authentication authentication) 
	{
		model.addAttribute("customerList", adminService.getAllCustomerDetails());
		return "GetAllCustomer";
	}

	/*
	 * private Pageable gotoPage(int page) { Pageable request = PageRequest.of(page,
	 * PAGE_SIZE, Sort.Direction.ASC, "flightId"); return request; }
	 */
	
	@GetMapping("/getAllFlight/{pageNo}")
	public String adminAllFlightGet(ModelMap model, Authentication authentication, HttpSession session, @PathVariable String pageNo) 
	{
		//model.addAttribute("flightList", flightService.getAllFlightDetails());
		//return "GetAllFlight";
	
        int lastPageNo;
        int gotoPageNo = Integer.parseInt(pageNo);
        
        
        Set<FlightDetails> allFlights = new LinkedHashSet<FlightDetails>();
//		session.setAttribute("currentPageNo", 0);
        for (FlightDetails f: flightService.getAllFlight(PageRequest.of(gotoPageNo, PAGE_SIZE, Sort.Direction.ASC, "flightId"))) // fetches rows from Database as per Page No
        {
            allFlights.add(f);
        }
        
        //flightService.getAllFlight(gotoPage(gotoPageNo)).forEach(f -> allFlights.add(f));

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

	@GetMapping("/getAllSeat")
	public String adminAllSeatGet(ModelMap model, Authentication authentication) 
	{
		model.addAttribute("seatList", seatService.getAllSeats());
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
		return "redirect:/getAllCustomer";
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
		return "redirect:/getAllCustomer";
	}

	@GetMapping("/deletecustomer")
	public String adminDeleteCustomerGet(@RequestParam int id, ModelMap model) 
	{
		customerService.deleteCustomerById(id);
		return "redirect:/getAllCustomer";
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
		return "redirect:/getAllFlight";
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
		return "redirect:/getAllSeat";
	}

	@GetMapping("/deleteseat")
	public String adminDeleteSeatGet(@RequestParam int id, ModelMap model) 
	{
		seatService.deleteSeatById(id);
		return "redirect:/getAllSeat";
	}

	@GetMapping("/getallairport")
	public String adminAirportAllGet(ModelMap model) 
	{
		model.addAttribute("airportList", airportService.getAllAirportDetails());
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
		return "redirect:/getallairport";
	}

	@GetMapping("/deleteairport")
	public String adminAirportDeleteGet(@RequestParam int id, ModelMap model) 
	{
		airportService.deleteAirportDetailsById(id);
		return "redirect:/getallairport";
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
		return "redirect:/getallairport";
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
