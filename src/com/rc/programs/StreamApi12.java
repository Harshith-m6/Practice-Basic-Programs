package com.rc.programs;

import java.util.Arrays;
import java.util.Comparator;

public class StreamApi12 {
	public static void main(String[] args) {
		//find the second biggest in the array using stream
		
		int[] ar = {12,34,56,78,89};
		
		int sbig = Arrays.stream(ar).distinct().boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		
		System.out.println(sbig);
		
		//Arrays.stream
		//String.
		//Collection(All).Stream
	}

}
