package com.rc.programs;

import java.util.Scanner;

public class ReversingDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		int d = 0;
		int rev =0;
		while(n!=0)
		{
			d=n%10;
			
			n /=10;
			rev = rev*10+d;
			
			
		}
		System.out.println("reversed number is "+rev);
	}

}
