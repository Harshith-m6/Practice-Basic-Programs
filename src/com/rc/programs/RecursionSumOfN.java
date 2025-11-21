package com.rc.programs;

import java.util.Scanner;

public class RecursionSumOfN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the summation of digits");
		int n = sc.nextInt();
		System.out.println(sumN(n)+" is the sum of of n digits");
	}
	
	static int sumN(int n)
	{
		if(n==0)
			return 0;
		return n+sumN(n-1);
	}
	

}
