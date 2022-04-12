package com.app.advice;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.app.exception.FlightDetailsException;
import com.app.exception.SeatException;
import com.app.exception.SeatStatusException;


@ControllerAdvice
public class MyExceptionHandler 
{
	@ResponseStatus(value=HttpStatus.NOT_FOUND)
	@ExceptionHandler(value=FlightDetailsException.class) public String
	FlightDetailsExceptionHandler(Model m, FlightDetailsException f) 
	{
		m.addAttribute("msg",f.getMessage()); 
		return "ExceptionPage"; 
	}
	
	@ResponseStatus(value=HttpStatus.BAD_REQUEST)
	@ExceptionHandler(value=SeatException.class) 
	public String SeatExceptionHandler(Model m, SeatException s) 
	{
		m.addAttribute("msg",s.getMessage()); 
	 	return "ExceptionPage"; 
	}
	
	@ResponseStatus(value=HttpStatus.BAD_REQUEST)
	@ExceptionHandler(value=SeatStatusException.class) 
	public String SeatStatusExceptionHandler(Model m, SeatStatusException sst) 
	{
		m.addAttribute("msg",sst.getMessage()); 
	 	return "ExceptionPage"; 
	}
	
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value=RuntimeException.class)
	public String RuntimeExceptionHandler(Model m, RuntimeException e) 
	{
		m.addAttribute("msg",e.getMessage());
		return "ExceptionPage";
	}
	
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value=Exception.class) public String ExceptionHandler(Model m) 
	{ 
		m.addAttribute("msg","Some Exception Occured, Please Try Again"); 
		return "ExceptionPage"; 
	}
}