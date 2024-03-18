package com.prowings.samplepracticeexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Example13Java8 {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		
		int sumOfFirstFive = numbers.stream()
										.limit(5)
										.mapToInt(Integer::intValue)
										.sum();
		
		
		OptionalDouble averageOfRemaining = numbers.stream()
													.skip(5)
													.mapToDouble(Integer::doubleValue)
													.average();
		
		 System.out.println("Sum of the first 5 elements: " + sumOfFirstFive);

	        if (averageOfRemaining.isPresent()) {
	            System.out.println("Average of the remaining elements: " + averageOfRemaining.getAsDouble());
	        } else {
	            System.out.println("No remaining elements.");
	        }
	}

}
