package com.rc.programs;
import java.util.*;
public class BiggestOfThree {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println("biggest is :"+big(a,b,c));
		
	}
	static int big(int a , int b , int c)
	{
		if(a>b&&a>c)
			return a;
		if(b>a&&b>a)
			return b;
		else
			return c;
	}

}
