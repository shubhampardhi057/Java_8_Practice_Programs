package com.prowings.samplepracticeexample;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Example12Java8 {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,5,3,9,2,7,4,8);
		
		Optional<Integer> max = numbers.stream().max(Integer::compareTo);
		
		Optional<Integer> min = numbers.stream().min(Integer::compareTo);
		
		 if (max.isPresent()) 
		 {
	            System.out.println("Maximum number: " + max.get());
	     } 
		 else 
		 {
	            System.out.println("List is empty.");
	     }

	     if (min.isPresent()) 
	     {
	            System.out.println("Minimum number: " + min.get());
	      } 
	     else 
	     {
	            System.out.println("List is empty.");
	     }
		
	}

}
