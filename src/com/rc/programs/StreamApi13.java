package com.rc.programs;

import java.util.Arrays;
import java.util.Comparator;

public class StreamApi13 {
	//Top 3 elements from the array
	public static void main(String[] args) {
		int[] ar = {11,23,45,67,89};
		
		int[] t3 = Arrays.stream(ar).boxed().sorted(Comparator.reverseOrder()).limit(3).mapToInt(Integer::intValue).toArray();
		
		System.out.println(Arrays.toString(t3));
	}

}
