package com.rc.programs;

import java.util.List;

public class StreamApi25 {
	//How reduce methods works
	public static void main(String[] args) {
		List<Integer> values = List.of(23,45,67,89);
		int sum = values.stream().reduce(0, (a,b)->a+b);
		
		System.out.println("Sum "+sum);
		
		int product = values.stream().reduce(1,(a,b)->a*b);
		
		System.out.println("product is "+product);
	}

}
