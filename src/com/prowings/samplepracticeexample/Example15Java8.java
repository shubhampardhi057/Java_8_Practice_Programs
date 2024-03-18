package com.prowings.samplepracticeexample;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Example15Java8 {
	
	public static void main(String[] args) {
		
		 List<Employee> employees = new ArrayList<>();
	     employees.add(new Employee("John", 30));
	     employees.add(new Employee("Alice", 25));
	     employees.add(new Employee("Bob", 35));
	     employees.add(new Employee("Alice", 30));
	     
	     
	     employees.sort(Comparator.comparing(Employee::getName));
	     
	     System.out.println("Sorted by name :");
	     employees.forEach(System.out::println);
	     
	     employees.sort(Comparator.comparing(Employee::getAge));
	     
	     System.out.println("\nSorted by age :");
	     employees.forEach(System.out::println);
	     
	     employees.sort(Comparator.comparing(Employee::getAge).thenComparing(Employee::getName));
	     
	     System.out.println("\nSorted by age , and if same age , then by name:");
	     employees.forEach(System.out::println);
	}

}
