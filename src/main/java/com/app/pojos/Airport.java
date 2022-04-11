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
@Table(name = "airport")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Airport implements Serializable 
{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "airport_id")
	private Integer airportId;
	
	@Column(name = "name_of_airport")
	private String nameOfAirport;
	
	@Column(name = "flight_id")
	private Integer flightId;
	
	@Column(name = "country")
	private String country;
	
	@Column(name = "city")
	private String city;
}
