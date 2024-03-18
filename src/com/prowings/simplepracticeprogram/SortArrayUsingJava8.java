package com.prowings.simplepracticeprogram;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SortArrayUsingJava8 {
	
	public static void main(String[] args) {
		
		Integer [] myarr = {2,8,10,5,6,4,5,6,7};
		
		System.out.println(Arrays.stream(myarr).sorted().collect(Collectors.toList()));
	}

}
