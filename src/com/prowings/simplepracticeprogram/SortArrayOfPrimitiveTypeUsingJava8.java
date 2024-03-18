package com.prowings.simplepracticeprogram;

import java.util.Arrays;

public class SortArrayOfPrimitiveTypeUsingJava8 {
	
	public static void main(String[] args) {
		
//		Normal Way
		
		int[] arry = { 2, 8, 10, 5, 6, 4, 5, 6, 7 };
		
		Arrays.sort(arry);
		
		System.out.println(Arrays.toString(arry));
		
//		Using Java 8 Way
		
		int[] arryy = { 2, 8, 10, 5, 6, 4, 5, 6, 7 };
		
		arryy = Arrays.stream(arryy).sorted().toArray();
		
		System.out.println(Arrays.toString(arryy));
		
		
		
		
	}

}
