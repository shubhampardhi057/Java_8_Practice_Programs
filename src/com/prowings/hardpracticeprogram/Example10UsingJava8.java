package com.prowings.hardpracticeprogram;

import java.util.ArrayList;
import java.util.List;

public class Example10UsingJava8 {
	
	public static void main(String[] args) {
		
		Student s1 = new Student("Abhay",20,80);
		Student s2 = new Student("Apeksha",30,70);
		Student s3 = new Student("Manoj",18,88);
		Student s4 = new Student("Sneha",22,62);
		
		
		List<Student> list1 = new ArrayList<>();
		list1.add(s1);
		list1.add(s2);
		list1.add(s3);
		list1.add(s4);


		System.out.println("original --> "+list1);
		
		
//		Option -1 :
		
		list1.stream().filter(n -> n.getAge() > 20).forEach(System.out::println);
		
//		Option -2 :
		
		list1.removeIf(e -> e.getAge() > 20);
		
		System.out.println("\n\nNew list --> "+ list1);
	}

}
