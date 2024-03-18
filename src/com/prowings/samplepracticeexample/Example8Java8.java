package com.prowings.samplepracticeexample;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Example8Java8 {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		
		OptionalDouble average = numbers.stream().mapToDouble(Integer::doubleValue).average();
		
		if(average.isPresent())
		{
			System.out.println("Average of all numbers : "+ average.getAsDouble());
		}
		else
		{
			System.out.println("The list is empty.");
		}
	}

}
