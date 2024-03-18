package com.prowings.hardpracticeprogram;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example7UsingJava8 {
	
	public static void main(String[] args) {
		
		List<String> words = Arrays.asList("Hello","world","Stream","API");
		
		String joinedString = words.stream().collect(Collectors.joining("_#_"));
		
		System.out.println(joinedString);
	}

}
