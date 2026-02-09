package com.rc.programs;

public class RecursionReverseNumbers {
	
	int reverse(int n)
	{
		return rev(n , 0);
	}
	
	private int rev(int n , int rev)
	{
		if(n==0)
			return rev;
		return rev(n/10 , rev*10+n%10);
	}

}
