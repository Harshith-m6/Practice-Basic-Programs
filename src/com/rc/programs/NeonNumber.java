package com.rc.programs;
import java.util.*;
public class NeonNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the number");
		int n = sc.nextInt();
		
		System.out.println("neon number :" +( neon(n)?"Yes":"No"));
		
	}
	
	static boolean neon(int n)
	{
		boolean isNeon = false;
		if(n==sum(n))
			return !isNeon;
		else 
			return isNeon;
		
	}
	static int square(int n)
	{
		return n*n;
	}
	static int sum(int n)
	{
		int sum =0;
		int s = square(n);
		while(s!=0)
		{
			int d = s%10;
			sum+=d;
			s/=10;
		}
		return sum;
	}

}
