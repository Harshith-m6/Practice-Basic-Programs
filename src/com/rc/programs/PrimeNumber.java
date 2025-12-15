package com.rc.programs;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		boolean prime = true;
		for(int i=2; i<=n/2 ; i++) // i*i<=n
		{
			if(n%i==0)
			{
				prime = false;
				break;
			}
		}
		System.out.println(prime?"Prime Number":"Not a Prime Number");
	}

}
