package com.rc.programs;

import java.util.Arrays;

public class StreamApi10 {
	public static void main(String[] args) {
		
		int[] arr = {3,2,1,3,1,2,4,5,6,7};
		
		System.out.println(Arrays.toString(arr));
		
		arr = Arrays.stream(arr).distinct().toArray();
		
		System.out.println(Arrays.toString(arr));
	}

}
