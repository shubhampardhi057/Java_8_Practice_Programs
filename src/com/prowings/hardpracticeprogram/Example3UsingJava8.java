package com.prowings.hardpracticeprogram;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example3UsingJava8 {
	
	public static void main(String[] args) {
		
		List<String>  names = Arrays.asList("John","Jane","Adam","Eve","Alex","Aana");
		
		List<String> filteredNames = names.stream()
											.filter(name -> name.startsWith("A"))
											.collect(Collectors.toList());
		
		System.out.println(filteredNames);
		
	}

}
