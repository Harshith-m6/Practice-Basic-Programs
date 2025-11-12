package com.rc.programs;

public class MaxMinArray {
	public static void main(String[] args) {
		int[] a = {9,1,5,3,7,4,9,0,2};
		int max = a[0];
		int min = a[0];
		for(int i = 0 ; i<a.length ; i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			if(a[i]<min)
			{
				min = a[i];
			}
		}
		System.out.println("Max value is "+max);
		System.out.println("Min value is "+min);
	}

}
