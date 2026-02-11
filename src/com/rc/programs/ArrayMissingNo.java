package com.rc.programs;

public class ArrayMissingNo {
	public static void main(String[] args) {
		int ar[] = {1,2,4,5,6,7};
		int n = ar.length+1;
		int exSum = n*(n+1)/2;
		int acSum=0;
		for(int i : ar)
		{
			acSum+=i;
		}
		
		System.out.println("missing num "+(exSum-acSum));
	}

}
