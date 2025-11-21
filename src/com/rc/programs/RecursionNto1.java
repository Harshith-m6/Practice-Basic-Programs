package com.rc.programs;

import java.util.Scanner;

public class RecursionNto1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the nth digit");
		int n = sc.nextInt();
		print(n);
	}
	
	static void print(int n)
	{
		if(n==0)
			return ;
		System.out.println(n);
		print(n-1);
	}

}
