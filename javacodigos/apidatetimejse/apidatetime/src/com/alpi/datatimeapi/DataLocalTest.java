package com.alpi.datatimeapi;

import java.time.LocalDate;
import java.time.Month;

public class DataLocalTest {
 public static void main(String [] args){
 
	 LocalDate today = LocalDate.now();
	 System.out.println("Today's date is: " + today);
	 
	 LocalDate newYear2016 = LocalDate.of(2016, 1, 1);
	 System.out.println("New year 2016: " + newYear2016);
	 
	 LocalDate valentinesDay = LocalDate.of(2016, Month.FEBRUARY, 14);
	 System.out.println("Valentine's day is on: " + valentinesDay);
	 
	 long visaValidityDays = 180L;
	 LocalDate currDate = LocalDate.now();
	 System.out.println("My Visa expires on: " + currDate.plusDays(visaValidityDays));
	
 }
}
