package com.prowings.samplepracticeexample;

import java.util.Arrays;
import java.util.List;

public class Example7Java8 {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		
		int sum = numbers.stream().reduce(0,Integer::sum);
		
		System.out.println("Sum of all numbers : "+ sum);
	}

}
