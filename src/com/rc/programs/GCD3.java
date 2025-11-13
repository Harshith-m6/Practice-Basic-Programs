package com.rc.programs;
import java.util.*;
public class GCD3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("GCD is :"+gcd(a , b));
	}
	
	static int gcd(int a , int b)
	{
		if(a==0)
		{
			return b;
		}
		if(b==0)
		{
			return a;
		}
		if(a>b)
		{
			if(a%b==0)
			{
				return b;
			}else
			{
				return gcd(a-b,b);
			}
		}else {
			if(b%a==0)
				return a;
			else
				return gcd(a,b-a);
		}
		
		
		
	}

}
