package com.rc.programs;

import java.util.Arrays;

public class StreamApi11 {
	public static void main(String[] args) {
		int[] ar = {34,45,64,23,45,22,11,90};
		
		Object[] ob = Arrays.stream(ar).boxed().sorted((a,b)->b-a).toArray();
		
		System.out.println(Arrays.toString(ob));
		
		
		ar = Arrays.stream(ar).boxed().sorted().mapToInt(a->(int)a).toArray();
		
		System.out.println(Arrays.toString(ar));
	}

}
