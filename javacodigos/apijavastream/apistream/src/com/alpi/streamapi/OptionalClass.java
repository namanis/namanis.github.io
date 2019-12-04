package com.alpi.streamapi;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class OptionalClass {
	/*public static void selectHighestTemperature(Stream<Double> temperatures) {
		//System.out.println(temperatures.max(Double::compareTo));
		Optional<Double> max = temperatures.max(Double::compareTo);
		max.ifPresent(System.out::println);
		/*if(max.isPresent()) {
		System.out.println(max.get());
		
		}		
	}
	*/
	public static void selectHighestTemperature(DoubleStream temperatures) {
		OptionalDouble max = temperatures.max();
		max.ifPresent(System.out::println);
		}
		public static void main(String []args) {
			/*selectHighestTemperature(Stream.of(24.5, 23.6, 27.9, 21.1, 23.5, 25.5, 28.3));
			selectHighestTemperature(Stream.of());*/
			selectHighestTemperature(DoubleStream.of(24.5, 23.6, 27.9, 21.1, 23.5, 25.5, 28.3));
		}
		}

