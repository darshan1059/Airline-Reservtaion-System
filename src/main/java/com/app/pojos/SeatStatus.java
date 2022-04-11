package com.app.pojos;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "seat_status")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SeatStatus implements Serializable 
{	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "seat_status_id")
	private Integer seatStatusId;
	
	@Column(name = "flight_id")
	private Integer flightId;
	
	@Column(name = "total_seats")
	private int totalSeats;
	@Column(name = "available_seats")
	private int availableSeats;
	@Column(name = "booked_seats")
	private int bookedSeats;
	
	@Column(name = "economy_seats_total")
	private int economySeatsTotal;
	@Column(name = "economy_seats_available")
	private int economySeatsAvailable;
	@Column(name = "economy_seats_booked")
	private int economySeatsBooked;
	
	@Column(name = "basic_economy_seats_total")
	private int basicEconomySeatsTotal;
	@Column(name = "basic_economy_seats_available")
	private int basicEconomySeatsAvailable;
	@Column(name = "basic_economy_seats_booked")
	private int basicEconomySeatsBooked;
	
	@Column(name = "premium_economy_seats_total")
	private int premiumEconomySeatsTotal;
	@Column(name = "premium_economy_seats_available")
	private int premiumEconomySeatsAvailable;
	@Column(name = "premium_economy_seats_booked")
	private int premiumEconomySeatsBooked;
	
	@Column(name = "business_seats_total")
	private int businessSeatsTotal;
	@Column(name = "business_seats_available")
	private int businessSeatsAvailable;
	@Column(name = "business_seats_booked")
	private int businessSeatsBooked;
	
	@Column(name = "first_seats_total")
	private int firstSeatsTotal;
	@Column(name = "first_seats_available")
	private int firstSeatsAvailable;
	@Column(name = "first_seats_booked")
	private int firstSeatsBooked;
}
