package com.rc.programs;

public class Practice6 {
	public static void main(String[] args) {
		
		int n = 3;
		System.out.println(fact(n));
		System.out.println("Factorial "+factorial(n));
	}
	
	static int fact(int n)
	{
		
		if(n==1)
			return 1;
		return n*fact(n-1);
		
		
	}
	
	static int factorial(int n)
	{
		int prod = 1;
		while(n!=0)
		{
			prod*=n;
			n--;
		}
		return prod;
	}
	
	

}
