package com.prowings.simplepracticeprogram;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CountDuplicatesFromListUsingJava8 {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(5, 3, 4, 1, 1,3, 7, 1, 2, 9, 9, 4);
		
		Set<Integer> items = new HashSet<>();
		
		Set<Integer> result = list.stream().filter(n -> !items.add(n)).collect(Collectors.toSet());
		
		result.forEach(System.out::println);
		
		System.out.println("count of duplicates ---> "+result.size()); 
		
		
		
		
		
		
	}

}
