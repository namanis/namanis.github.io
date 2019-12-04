package com.alpi.datatimeapi;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class FormatDataHora {
	public static void main(String[] args) {
		
		LocalTime wakeupTime = LocalTime.of(6, 0, 0);
	System.out.println("Wake up time: " + DateTimeFormatter.ISO_TIME.format(wakeupTime));

	DateTimeFormatter customFormat = DateTimeFormatter.ofPattern("dd MMM yyyy");
	System.out.println(customFormat.format(LocalDate.of(2016, Month.JANUARY, 01)));
	}
}