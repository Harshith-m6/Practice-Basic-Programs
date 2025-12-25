package com.rc.programs;

import java.util.Arrays;

public class Practice15 {
	public static void main(String[] args) {
		int[] ar = {1,2,3,4,5,6};
		int[] rev =rev(ar , 0 ,ar.length-1 );
		System.out.println(Arrays.toString(rev));
		
	}
	
	static int[] rev(int[] a ,int start ,int end )
	{
		if(start>=end)
		{
			return a;
		}
		int temp = a[start];
		a[start] = a[end];
		a[end]= temp;
		return rev(a,++start, --end);
	}

}
