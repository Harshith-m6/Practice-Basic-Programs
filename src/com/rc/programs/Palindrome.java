package com.rc.programs;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		if(isPal(n))
		{
			System.out.println("is a palindrome number");
		}else {
			System.out.println("not a palindrome number");
		}
		
	}
	static boolean isPal(int n)
	{
		int temp = n;
		int pal=0;
		while(n!=0)
		{
			int d=n%10;
			pal = pal*10+d;
			n/=10;
		}
		if(temp==pal)
		{
			return true;
		}else {
			return false;
		}
	}

}
