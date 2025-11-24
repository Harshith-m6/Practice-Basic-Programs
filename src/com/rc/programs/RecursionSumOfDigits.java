package com.rc.programs;

import java.util.Scanner;

public class RecursionSumOfDigits {
	
	static int sum(int x)
	{
		if(x==0)
			return 0;
		return x%10+sum(x/10);
	}
	
	static int digits(int x)
	{
		if(x<10 && x>-10)
			return x;
		return digits(sum(x));
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int x= sc.nextInt();
		int sm = sum(x);
		System.out.println("Number of digits = "+sm);
	}

}
