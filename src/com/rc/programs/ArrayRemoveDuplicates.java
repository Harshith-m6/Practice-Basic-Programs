package com.rc.programs;

import java.util.Arrays;

public class ArrayRemoveDuplicates {
	public static void main(String[] args) {
		int[] a= {1,2,3,1,2,3,4,3,1,2,3,5,6,7,7,8,7};
		
		Arrays.sort(a);
		
		int j =0 ;
		for(int i = 1 ; i<a.length; i++)
		{
			if(a[i]!=a[j])
			{
				j++;
				a[j]=a[i];
			}
		}
		
		int[] result = Arrays.copyOf(a, j+1);
		for(int x : result)
		{
			System.out.println(x);
		}
	}

}
