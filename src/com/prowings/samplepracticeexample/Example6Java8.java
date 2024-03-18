package com.prowings.samplepracticeexample;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Example6Java8 {
	
	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		names.add("John");
        names.add("Kate");
        names.add("Kevin");
        names.add("Alice");
        names.add("Kylie");
        names.add("Bob");
        names.add("Kelly");
        
        Set<String> namesStartingWithK = names.stream().filter(name -> name.startsWith("K")).collect(Collectors.toSet());
        
        System.out.println("Names Starting with k :- "+ namesStartingWithK);
	}

}
