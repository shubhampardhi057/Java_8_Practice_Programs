package com.prowings.simplepracticeprogram;

import java.util.Arrays;
import java.util.List;

public class FindNumberStartWith1UsingJava8 {
	
	public static void main(String[] args) {
		
		List<Integer> myList = Arrays.asList(10,15,8,49,25,18,32);
		
		myList.stream()
			   .map(s -> s + "")
			   .filter(s -> s.startsWith("1"))
			   .forEach(System.out::println);
	}

}
