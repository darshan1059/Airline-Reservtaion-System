package com.app.pojos;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "flight_details")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class FlightDetails implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	@Column(name = "flight_id")
	private Integer flightId;
	
	@Column(name = "flight_number")
	private String flightNumber;
	
	@Column(name = "flight_name")
	private String flightName;
	
	@Column(name = "source")
	private String source;
	
	@Column(name = "destination")
	private String destination;
	
	@Column(name = "distance")
	private float distance;
	
	@Column(name = "days")
	private String days;
	
	@Column(name = "luggage")
	private String luggage;
	
	@Column(name = "arrival_date")
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private LocalDate arrivalDate;
	
	@Column(name = "departure_date")
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private LocalDate departureDate;
	
	@Column(name="arrival_time")
	private LocalTime arrivalTime;
	
	@Column(name="departure_time")
	private LocalTime departureTime;
	
	@Column(name = "image_name")
	private String imageName;
	
	@Column(name = "extra_facility")
	private String extraFacility;
	
	@Column(name = "duration")
	private String duration;

//	public String returnArrivalHourAndMinute() {
//		String hour ="";
//		hour = String.format("%02d:%02d", this.arrival.getHour(), this.arrival.getMinute());
//		return hour;
//	}
//
//	public String returnDepartureHourAndMinute() {
//		String hour ="";
//		hour = String.format("%02d:%02d", this.departure.getHour(), this.departure.getMinute());
//		return hour;
//	}
//	
//	public String getDepartureFormatedDate() {
//	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E, MMM dd yyyy");  
//	    return this.departure.format(myFormatObj); 
//	}
//	public String getArrivalFormatedDate() {
//		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E, MMM dd yyyy");  
//		return this.arrival.format(myFormatObj); 
//	}
}
