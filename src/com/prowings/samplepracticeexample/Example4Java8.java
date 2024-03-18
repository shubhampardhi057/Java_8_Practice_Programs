package com.prowings.samplepracticeexample;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Example4Java8 {
	
	public static void main(String[] args) {
		
		Set<Integer> numbers = new HashSet<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		
		Set<Integer> doubleNumbers = numbers.stream().map(n -> n * 2).collect(Collectors.toSet());
		
		System.out.println("Doubled numbers :"+ doubleNumbers);
		
	}

}
