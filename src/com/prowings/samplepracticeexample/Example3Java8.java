package com.prowings.samplepracticeexample;

import java.util.ArrayList;
import java.util.List;

public class Example3Java8 {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<>();
		
		numbers.add(5);
		numbers.add(2);
		numbers.add(8);
		numbers.add(1);
		numbers.add(9);
		
		
		List<Integer> sortedNumbers = numbers.stream().sorted().toList();
		
		System.out.println("Sorted Number: "+ sortedNumbers);
		
	}

}
