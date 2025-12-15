package com.rc.programs;

import java.util.Scanner;

public class Recursion12N {
	
	public static void main(String[] args) {
		System.out.println("Enter n");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		print(n,1);
		
	}
	
	public static void print(int n , int x)
	{
		if(x>n)
			return;
		System.out.println(x);
		print(n,x+1);
		
		
	}

}
