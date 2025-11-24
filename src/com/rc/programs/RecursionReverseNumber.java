package com.rc.programs;

import java.util.Scanner;

public class RecursionReverseNumber {
	
	static int rev(int x)
	{
		return rev(x , 0);
				
	}
	
	private static int rev(int x , int rev)
	{
		if(x==0)
			return rev;
		return rev(x/10 , rev*10+x%10);
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number to reverse");
		int x= sc.nextInt();
		System.out.println("Reverse of "+x+" is "+rev(x));
	}

}
