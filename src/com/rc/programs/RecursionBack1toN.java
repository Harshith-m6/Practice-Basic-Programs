package com.rc.programs;

import java.util.Scanner;

public class RecursionBack1toN {
	public static void main(String[] args) {
		System.out.println("Enter N");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		print(n);
	}
	
	public static void print(int n)
	{
		if(n==0)
			return;
		print(n-1);
		System.out.println(n);
	}
	
	
}
