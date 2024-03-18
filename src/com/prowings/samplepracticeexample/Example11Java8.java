package com.prowings.samplepracticeexample;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Example11Java8 {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,2,9,10,6,7,8,9,10);
		
		Set<Integer> duplicates = numbers.stream()
											.filter(n -> numbers.indexOf(n) != numbers.lastIndexOf(n))
											.collect(Collectors.toSet());
		
		System.out.println("Duplicates numbers : "+ duplicates);
	}

}
