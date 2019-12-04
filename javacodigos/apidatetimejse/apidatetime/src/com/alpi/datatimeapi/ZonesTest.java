package com.alpi.datatimeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZonesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("My zone id is: " + ZoneId.systemDefault());
		
		Set<String> zones = ZoneId.getAvailableZoneIds();
		System.out.println("Number of available time zones is: " + zones.size());
		zones.forEach(System.out::println);
		System.out.println("--------------------------------------");
		//usar tudo junto 
		LocalDate currentDate = LocalDate.now();
		LocalTime currentTime = LocalTime.now();
		ZoneId myZone = ZoneId.systemDefault();
		ZonedDateTime zonedDateTime = ZonedDateTime.of(currentDate, currentTime, myZone);
		System.out.println(zonedDateTime);
		
		System.out.println("--------------------------------------");
		
		ZoneId myZone2 = ZoneId.of("GMT-03:00");
		LocalDateTime dateTime = LocalDateTime.now();
		ZonedDateTime zonedDateTime2 = dateTime.atZone(myZone2);
		ZoneOffset zoneOffset = zonedDateTime2.getOffset();
		System.out.println(zoneOffset);
	}

}
