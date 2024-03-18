package com.prowings.samplepracticeexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example10Java8 {
	
	public static void main(String[] args) {
		
		List<String> numbers = Arrays.asList("123","256","109","178","145","101","921");
		
		
		List<String> numberStartingWithOne = numbers.stream()
													.filter(n -> n.startsWith("1"))
													.collect(Collectors.toCollection(ArrayList::new));
		
		System.out.println("Numbers starting with '1' : "+ numberStartingWithOne);
		
		
	}

}
