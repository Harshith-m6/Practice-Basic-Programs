package com.rc.programs;

public class RecursionPrimeNo {
	
	boolean prime(int n)
	{
		if(n<2)
			return false;
		return isPrime(2,n);
	}
	
	private boolean isPrime(int d , int n)
	{
		if(d*d>n)
			return true;
		if(n%d==0)
			return false;
		return isPrime(d+1,n);
	}

}
