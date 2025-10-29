package com.rc.programs;

import java.util.Scanner;

public class ArmstrongNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();
		if(isArm(n))
		{
			System.out.println("its a Armstrong number");
		}else
		{
			System.out.println("not a ArmStrong number");
		}
		
	}
	static boolean isArm(int n)
	{
		int temp = n;
		int sum =0;
		int prod = 0;
		while(n!=0)
		{
			int d = n%10;
			prod = pow(d , count(temp));
			sum +=prod;
			n/=10;
		}
		if(sum==temp)
			return true;
		else 
			return false;
	}
	static int count(int n)
	{
		int count =0;
		while(n!=0)
		{
			
			n/=10;
			count++;
		}
		return count;
	}
	static int pow(int d , int count)
	{
		int prod = 1;
		while(count!=0)
		{
			prod *=d;
			count--;
			
		}
		return prod;
	}

}
