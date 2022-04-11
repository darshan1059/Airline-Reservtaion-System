package com.app.pojos;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Search implements Serializable
{
	private static final long serialVersionUID = 1L;
	private String source;
	private String destination;
	private LocalDate journeyDate;
	private LocalDate returnDate;
	private int passenger;
	private String classOfjourney;
}
