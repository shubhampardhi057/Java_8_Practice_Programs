package com.prowings.hardpracticeprogram;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Example8UsingJava8 {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(5,2,8,1,6,3);
		
		Optional<Integer> maxNumbers = numbers.stream().max(Integer::compareTo);
		
		System.out.println("Maximum Numbers : "+maxNumbers.orElse(-1));
		
		Optional<Integer> minNumbers = numbers.stream().min(Integer::compareTo);
		
		
		System.out.println("Maximum Numbers : "+minNumbers.orElse(-1));
	}

}
