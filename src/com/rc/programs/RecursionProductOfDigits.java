package com.rc.programs;

import java.util.Scanner;

public class RecursionProductOfDigits {
	
	static int product(int x)
	{
		if(x/10==0)
			return x;
		return x%10*product(x/10);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int x = product(n);
		System.out.println("The product is "+x);
	}

}
