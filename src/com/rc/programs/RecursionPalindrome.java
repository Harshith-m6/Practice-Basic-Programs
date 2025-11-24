package com.rc.programs;

import java.util.Scanner;

public class RecursionPalindrome {
	
	static boolean palindrome(int x)
	{
		return x==rev(x , 0);
	}
	
	private static  int rev(int x , int rev)
	{
		if(x==0)
			return rev;
		return rev(x/10 , rev*10+x%10);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int x = sc.nextInt();
		System.out.println(palindrome(x)?"its a palindrome number":"its not a palindrome number");
		
	}
}
