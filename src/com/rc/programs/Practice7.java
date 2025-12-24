package com.rc.programs;

public class Practice7 {
	public static void main(String[] args) {
		int n =10;
		fib(n);
		fibo(n , 0);
	}
	
	static void fib(int n)
	{
		int x =0;
		int y=1;
		while(x<=n)
		{
			System.out.println(x);
			x=y;
			y++;
			
		}
	}
	
	
	static void fibo(int n, int x)
	{
		if(x==n)
			return;
		System.out.println(x);
		fibo(n, x+1);
	}

}
