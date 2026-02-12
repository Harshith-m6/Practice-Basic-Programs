package com.rc.programs;

public class RecursionArmstrongOrNot {
	boolean checkArm(int n)
	{
		return n==armstrong(n);
	}
	
	private int armstrong(int n)
	{
		if(n==0)
			return 0;
		int d = n%10;
		return d*d*d + armstrong(n/10);
	}
}
