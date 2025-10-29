package com.rc.programs;

import java.util.Scanner;

public class StrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		
		boolean isStrong = isStrong(n);
		if(isStrong==true)
		{
			System.out.println(n+" is a Strong number");
		}else {
			System.out.println("not a Strong number");
		}
	}
	
	static boolean isStrong(int n)
	{
		int temp = n ;
		int sum =0;
		while(n!=0)
		{
			int d = n%10;
			sum += fact(d);
			n/=10;
		}
		
		return sum==temp;
	}
	
	static int fact(int d)
	{
		int prod = 1;
		while(d>0)
		{
			prod*=d;
			d--;
		}
		
		return prod;
	}

}
