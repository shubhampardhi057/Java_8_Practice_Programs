package com.prowings.simplepracticeprogram;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromListUsingJava8 {
	
	public static void main(String[] args) {
		
		List<String> companies = new ArrayList<>();
		
		companies.add("Meta");
        companies.add("Apple");
        companies.add("Amazon");
        companies.add("Netflix");
        companies.add("Meta"); 
        companies.add("Google");
        companies.add("Apple"); 
        
        // 1.2 print original List to console
        System.out.println("1. Original List with duplicates : \n");
        companies.forEach(System.out::println);
        
     // 2. get unique elements after removing duplicates
        List<String> distinctCompanies = companies.stream().distinct().collect(Collectors.toList());
        
        
     // 2.1 print unique elements
        System.out.println("\n2. Unique elements : \n");
        distinctCompanies.forEach(System.out::println);
        
  

		// 3.1 print duplicate elements
        System.out.println("\n3. Duplicate elements : \n");
        companies.forEach(System.out::println);
        
        
	}

}
