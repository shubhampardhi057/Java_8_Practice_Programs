package com.prowings.samplepracticeexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example14Java8 {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(10);
        numbers.add(5);
        numbers.add(20);
        numbers.add(15);
        numbers.add(25);
        
        Collections.sort(numbers);
        
        int highest = numbers.get(numbers.size() -1);
        
        int lowest = numbers.get(0);
        
        int secondHighest = numbers.get(numbers.size() - 2);
        
        int secondLowest = numbers.get(1);
        
        System.out.println("Highest number: " + highest);
        System.out.println("Lowest number: " + lowest);
        System.out.println("Second highest number: " + secondHighest);
        System.out.println("Second lowest number: " + secondLowest);
	}

}
