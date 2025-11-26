package com.rc.programs;

import java.util.Arrays;

public class RecursionReverseArray {
	
	static void reverse(int[] x , int start , int end)
	{
		if(start>=end)
			return;
		int temp=x[start];
		x[start]=x[end];
		x[end]=temp;
		reverse(x , start+1 , end-1);
	}
	
	static void reverse(int[] x)
	{
		reverse(x,0,x.length-1);
	}
	
	public static void main(String[] args) {
		int [] ar = {10,20,30,40,50,60};
		reverse(ar);
		System.out.println("Reversed array "+Arrays.toString(ar));
	}

}
