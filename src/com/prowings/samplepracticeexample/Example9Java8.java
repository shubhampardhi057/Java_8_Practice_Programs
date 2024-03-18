package com.prowings.samplepracticeexample;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Example9Java8 {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		OptionalDouble average = numbers.stream()
										.mapToInt(n -> n * n)
										.filter(n -> n > 50)
										.average();
		
		if(average.isPresent())
		{
			System.out.println("Average of square greater than 50 : "+ average.getAsDouble());
		}
		else 
		{
			System.out.println("No numbers found with square greater than 50 .");
		}
		
	}

}
