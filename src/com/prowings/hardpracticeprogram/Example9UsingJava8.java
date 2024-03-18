package com.prowings.hardpracticeprogram;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example9UsingJava8 {
	
	public static void main(String[] args) {
		
		List<List<Integer>> numberLists = Arrays.asList(
															Arrays.asList(1,2,3),
															Arrays.asList(4,5,6),
															Arrays.asList(7,8,9));
		
		System.out.println(numberLists);	
		
		List<Integer> flattenedList = numberLists.stream()
													.flatMap(List::stream)
													.collect(Collectors.toList());
		
		System.out.println(flattenedList);
	}

}
