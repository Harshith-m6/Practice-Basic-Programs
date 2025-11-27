package com.rc.programs;

import java.util.Arrays;

public class ArrayReverse {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7};
		int i = 0 , j=a.length-1;
		System.out.println("Original Array "+Arrays.toString(a));
		while(i<j)
		{
			int t = a[i];
			a[i] = a[j];
			a[j]=t;
			i++;
			j--;
		}
		System.out.println("Reversed Array "+Arrays.toString(a));
	}

}
