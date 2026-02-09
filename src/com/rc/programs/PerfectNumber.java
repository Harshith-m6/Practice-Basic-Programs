package com.rc.programs;
import java.util.*;
public class PerfectNumber {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int sum=1;
		for(int i=2;i*i<=n;i++)
		{
			if(n%i==0)
			{
				sum+=i;
				if(i!=n/i)
				{
					sum+=n/i;
				}
			}
		}
		System.out.println((sum==n)?"perfect number":"Not a perfect number");
	}
}
