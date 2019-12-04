package com.alpi.datatimeapi;

import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;

public class DealingTimeTest {
	public static void main(String[] args) {
	ZoneId kolkataZone = ZoneId.of("Asia/Kolkata");
	Duration kolkataDST = kolkataZone.getRules().getDaylightSavings(Instant.now());
	System.out.printf("Kolkata zone DST is: %d hours %n", kolkataDST.toHours());
	ZoneId aucklandZone = ZoneId.of("Pacific/Auckland");
	Duration aucklandDST = aucklandZone.getRules().getDaylightSavings(Instant.now());
	System.out.printf("Auckland zone DST is: %d hours", aucklandDST.toHours());
}
}