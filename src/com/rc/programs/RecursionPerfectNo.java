package com.rc.programs;

public class RecursionPerfectNo {
	//perfect number sum of its factors is equal to the number
	boolean perfect(int n)
	{
		return n==isPer(1 , n);
	}
	
	private int isPer(int d , int n)
	{
		if(d>n/2)
			return 0;
		return (n%d==0?d:0)+isPer(d+1,n);
	}

}
