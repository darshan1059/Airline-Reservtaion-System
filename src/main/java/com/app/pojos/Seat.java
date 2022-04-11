package com.app.pojos;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "seat")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Seat implements Serializable 
{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	@Column(name = "seat_id")
	private Integer seatId;
	
	@Column(name = "class")
	private String seatClass;
	
	@Column(name = "flight_id")
	private Integer flightId;
	
	@Column(name = "price_for_booking")
	private float priceForBooking;
	
	@Column(name = "price_for_cancel")
	private float priceForCancel;
	
	@Column(name = "tax")
	private float tax;

}
