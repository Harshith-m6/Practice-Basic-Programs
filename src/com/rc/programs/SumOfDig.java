package com.rc.programs;

import java.util.Scanner;

public class SumOfDig {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		int sum =0;
		int temp=n;
		while(n!=0)
		{
			int d = n%10;
			sum+=d;
			n/=10;
		}
		System.out.println(sum+" is the sum of digits in "+temp);
	}

}
