package com.prowings.hardpracticeprogram;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example4UsingJava8 {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(5,2,8,1,6,3,4,7,9);
		
		List<Integer> sortedNumbers = numbers.stream()
												.sorted()
												.limit(5)
												.collect(Collectors.toList());
		
		System.out.println(sortedNumbers);
	}

}
