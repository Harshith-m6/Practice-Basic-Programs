package com.rc.programs;

public class RecursionGCDofTwoNumbers {
	
	int gcd(int m , int n)
	{
		if(n%m==0)
			return m;
		return gcd(n%m,m);
	}

}
