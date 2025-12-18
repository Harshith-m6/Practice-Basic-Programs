package com.rc.programs;

import java.util.Arrays;

public class ArrayMergeSortedArrayDsc {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3 };
		int[] b = { 4, 5, 6 };
		int[] c = new int[a.length+b.length];
		int i = a.length-1;
		int j = b.length-1;
		for(int k =0 ; k<c.length ; k++)
		{
			if(i>=0 && j>=0)
			{
				if(a[i]>b[j])
				{
					c[k]=a[i--];
				}else {
					c[k]=b[j--];
				}
			}else if(i>=0)
			{
				c[k]=a[i--];
			}else if(j>=0)
			{
				c[k]=b[j--];
			}
			
			
		}
		
		System.out.println(Arrays.toString(c));
	}

}
