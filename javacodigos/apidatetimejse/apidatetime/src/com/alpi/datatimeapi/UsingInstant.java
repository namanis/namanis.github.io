package com.alpi.datatimeapi;

import java.time.Instant;
import java.time.LocalDateTime;
public class UsingInstant {
public static void main(String args[]){
// prints the current timestamp with UTC as time zone
Instant currTimeStamp = Instant.now();
System.out.println("Instant timestamp is: "+ currTimeStamp);
// prints the number of seconds as Unix timestamp from epoch time
System.out.println("Number of seconds elapsed: " + currTimeStamp.getEpochSecond());
// prints the Unix timestamp in milliseconds
System.out.println("Number of milliseconds elapsed: " + currTimeStamp.toEpochMilli());

LocalDateTime localDateTime = LocalDateTime.now();
Instant instant = Instant.now();
System.out.println("LocalDateTime is: " + localDateTime + " \nInstant is: " + instant);
}
}