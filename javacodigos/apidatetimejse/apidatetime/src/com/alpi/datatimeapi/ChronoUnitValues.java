package com.alpi.datatimeapi;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
public class ChronoUnitValues {
public static void main(String []args) {
System.out.println("ChronoUnit DateBased TimeBased Duration");
System.out.println("---------------------------------------");
for(ChronoUnit unit : ChronoUnit.values()) {
System.out.printf("%10s \t %b \t\t %b \t\t %s %n",unit, unit.isDateBased(), unit.isTimeBased(), unit.getDuration());

System.out.println(Duration.of(1, ChronoUnit.MINUTES).getSeconds());
//prints: 60
System.out.println(Duration.of(1, ChronoUnit.HOURS).getSeconds());
//prints:3600
System.out.println(Duration.of(1, ChronoUnit.DAYS).getSeconds());
//prints: 86400
}
}
}