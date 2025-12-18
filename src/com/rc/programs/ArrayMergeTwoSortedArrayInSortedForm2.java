package com.rc.programs;

import java.util.Arrays;

public class ArrayMergeTwoSortedArrayInSortedForm2 {
	public static void main(String[] args) {
		int[] a = {12,34,56,78,90};
		int[] b = {23,45,67,89,100};
		
		int[] c = mergeSort(a,b);
		
		System.out.println(Arrays.toString(c));
	}
	
	static int[] mergeSort(int[] x , int[] y)
	{
		int i =0 , j=0 , k=0;
		int[] z = new int[x.length+y.length];
		
		while(i<x.length && j<y.length)
		{
			if(x[i]<y[j])
			{
				z[k++]=x[i++];
			}else {
				z[k++]=y[j++];
			}
		}
		
		while(i<x.length)
		{
			z[k++]=x[i++];
		}
		
		while(j<y.length)
		{
			z[k++]=y[j++];
		}
		
		return z;
	}

}
