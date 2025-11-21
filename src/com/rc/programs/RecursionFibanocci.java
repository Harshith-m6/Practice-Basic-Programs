package com.rc.programs;

import java.util.Scanner;

public class RecursionFibanocci {
	public static void main(String[] args) {
		//gives nth fibonacci number
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the term");
		int n = sc.nextInt();
		System.out.println(n+"th fibonacci number is "+fib(n));
	}
	
	static int fib(int n)
	{
		if(n<=1)
			return n;
		return fib(n-1)+fib(n-2);
	}

}
