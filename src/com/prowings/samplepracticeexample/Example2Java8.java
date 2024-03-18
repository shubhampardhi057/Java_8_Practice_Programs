package com.prowings.samplepracticeexample;

import java.util.stream.Stream;

public class Example2Java8 {
	
	public static void main(String[] args) {
		
		Stream<String> stream = Stream.of("apple","banana","orange","grape","kiwi");
		
		long count = stream.count();
		
		System.out.println("Total size of the stream : "+count);
	}

}
