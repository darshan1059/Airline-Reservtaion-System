package com.app.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.stereotype.Service;

@Service
public class DateConversion {

	public LocalDateTime stringToLocalDateTime(String time) {

		String[] arr = time.split("/");
		int m = Integer.parseInt(arr[0]);
		int d = Integer.parseInt(arr[1]);
		int y = Integer.parseInt(arr[2]);
		LocalDateTime dateTime = LocalDateTime.of(LocalDate.of(y, m, d), LocalTime.of(0, 01, 01));
		System.out.println(dateTime);
		return dateTime;

	}

}
