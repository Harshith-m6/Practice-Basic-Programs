package com.rc.programs;

import java.util.Arrays;

public class ArrayReverse1 {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7};
		int low =0;
		int high = a.length-1;
		while(low<high)
		{
			int temp=a[low];
			a[low]=a[high];
			a[high]=temp;
			low++;
			high--;
		}
		System.out.println(Arrays.toString(a));
	}

}
