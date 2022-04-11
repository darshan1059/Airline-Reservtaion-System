package com.app.pojos;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "travel_customer")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TravelCustomer implements Serializable 
{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "travel_customer_id")
	private Integer travelCustomerId;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "seat_number")
	private String seatNumber;
	
	@Column(name = "cabin")
	private String cabin;
	
	@Column(name = "check_in")
	private String checkIn;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="ticketId", nullable=false)
	private TicketBooking ticket;
}
