package com.rc.programs;

import java.util.Arrays;
import java.util.Comparator;

public class StreamApi14 {
	//only even elements from array
	public static void main(String[] args) {
		
		
		int[] ar = {11,23,45,67,89,22,44,66};
		
		int[] even = Arrays.stream(ar).filter(n->n%2==0).toArray();
		
		System.out.println(Arrays.toString(even));
		
		
	}

}
