package com.rc.programs;
import java.util.*;
public class GCD {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("GCD of two numbers is :"+gcd(a,b));
		
		
	}
	
	static int gcd(int a , int b)
	{
		int min ;
		if(a>b)
		{
			min =b;
		}else
			min =a;
		
		while(min!=0)
		{
			if(a%min==0 && b%min==0)
			{
				break;
			}
			min--;
		}
		return min;
		
		
	}

}
