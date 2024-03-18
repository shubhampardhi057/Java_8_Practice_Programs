package com.prowings.samplepracticeexample;

import java.util.stream.IntStream;

public class Example1Java8 {
	
	public static void main(String[] args) {
		
		IntStream stream = IntStream.rangeClosed(1, 10);
		
		stream.forEach(System.out::println);
	}

}
