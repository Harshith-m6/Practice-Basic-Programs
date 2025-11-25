package com.rc.programs;

import java.util.Arrays;

public class ReverseArray {
	
	
	static void reverse(int[] x)
	{
		int start =0, end = x.length-1;
		while(start<end)
		{
			int temp=x[start];
			x[start]=x[end];
			x[end] = temp;
			start++;
			end--;
		}
	}
	
	public static void main(String[] args) {
		int[] ar = {1,2,3,4,5,6};
		System.out.println(Arrays.toString(ar));
		
		reverse(ar);
		System.out.println(Arrays.toString(ar));

	}

}
