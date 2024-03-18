package com.prowings.hardpracticeprogram;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example5UsingJava8 {

	public static void main(String[] args) {
		
		List<String> words = Arrays.asList("apple","banana","cherry","date","elderberry");
		
		Map<Integer,List<String>> wordsByLength = words.stream().collect(Collectors.groupingBy(String::length));
		
		
		System.out.println(wordsByLength);
	}
}
