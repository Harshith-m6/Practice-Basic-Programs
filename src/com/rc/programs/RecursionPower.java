package com.rc.programs;

import java.util.Scanner;

public class RecursionPower {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base");
		int b = sc.nextInt();
		System.out.println("Enter the power");
		int p = sc.nextInt();
		
		System.out.println("Power value is "+getPow(b,p));
	}
	
	static int getPow(int b , int p)
	{
		if(p==0)
		{
			return 1;
		}
		
		return b*getPow(b,p-1);
	}

}
