package com.prowings.simplepracticeprogram;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNonRepeatedCharFromStringUsingJava8 {
	
	public static void main(String[] args) {
		
		String input = "India is nice";
		
		Character result = input.chars()
								.mapToObj(s -> Character.toLowerCase(Character.valueOf((char)s)))
								.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
								.entrySet()
								.stream()
								.filter(entry -> entry.getValue() == 1L)
								.map(entry -> entry.getKey())
								.findFirst()
								.get();
		

		System.out.println("first non-repeated character is :::: "+result);
	}

}
