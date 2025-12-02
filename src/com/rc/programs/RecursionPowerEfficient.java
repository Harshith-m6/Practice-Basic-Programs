package com.rc.programs;

import java.util.Scanner;

public class RecursionPowerEfficient {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base");
		int base = sc.nextInt();
		System.out.println("Enter the power");
		int power = sc.nextInt();
		
		System.out.println("Power Value is "+getPower(base , power));
		
	}
	
	static int getPower(int base , int power)
	{
		if(power ==0)
		{
			return 1;
		}
		
		int half = getPower(base , power/2);
		
		if(power%2==0)
		{
			return half*half;
		}
		else
			return half*half*base;
	}

}
