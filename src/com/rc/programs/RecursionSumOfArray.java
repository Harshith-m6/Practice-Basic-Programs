package com.rc.programs;

public class RecursionSumOfArray {
	
	int sum( int[] arr)
	{
		return sums(0 , arr);
	}
	
	private int sums(int ind , int[] arr)
	{
		if(ind==arr.length)
			return 0;
		return arr[ind]+sums(ind+1 , arr);
	}
	

}
