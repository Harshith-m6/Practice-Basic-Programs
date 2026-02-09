package com.rc.programs;
import java.util.*;
public class PrimeCheck {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean isPrime = true;
		if(n<=1)
		{
			isPrime = false;
		}else {
			for(int i=2;i*i<n;i++)
			{
				if(n%i==0)
				{
					isPrime = false;
					break;
				}
			}
		}
		System.out.println(n+" is prime ?:"+isPrime);
		
	}

}
