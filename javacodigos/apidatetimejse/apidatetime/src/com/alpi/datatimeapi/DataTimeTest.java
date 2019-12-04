package com.alpi.datatimeapi;

import java.time.LocalTime;

public class DataTimeTest {
	 public static void main(String [] args){
		 LocalTime currTime = LocalTime.now();
		 System.out.println("Current time is: " + currTime);
		 System.out.println(LocalTime.of(18,30));
		 
		 //reunião e hora marcada
		 long hours = 6;
		 long minutes = 30;
		 LocalTime currTime2 = LocalTime.now();
		 System.out.println("Current time is: " + currTime2);
		 System.out.println("My meeting is at: " + currTime2.plusHours(hours).plusMinutes(minutes));
}
}