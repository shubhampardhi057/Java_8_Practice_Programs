package com.prowings.hardpracticeprogram;

import java.util.Arrays;
import java.util.List;

public class Example6UsingJava8 {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		
		boolean anyMatch = numbers.stream().anyMatch(n -> n > 3);
		
		System.out.println("Any number greater than 3 :"+ anyMatch);
	}

}
