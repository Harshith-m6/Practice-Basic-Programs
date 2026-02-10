package com.rc.programs;
import java.util.*;
public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int original = n;
		int sum=0;
		int s=0;
		while(n!=0)
		{
			int d = n%10;
			s = cube(d);
			sum+=s;
			n/=10;
			
		}
		
		System.out.println((sum==original?"armstrong":"not a armstrong"));
		
		
	}
	public static int cube(int n)
	{
		return n*n*n;
	}

}
