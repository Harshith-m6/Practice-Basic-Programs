package com.rc.programs;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number to find the factotial");
		int n = sc.nextInt();
		int prod = 1;
		while(n!=0)
		{
			prod *=n;
			n--;
		}
		System.out.println(prod+" is the factorial of ");
	}

}
