package com.rc.programs;
import java.util.*;
public class Permutation {
	
	public static long factorial(long num)
	{
		long fact = 1;
		while(num!=0)
		{
			fact = fact*num;
			num--;
			
		}
		return fact;
	}
	public static long permutation(long n , long r)
	{
		return factorial(n)/factorial(n-r);
	}
	
	public static long combination(long n , long r)
	{
		return factorial(n)/(factorial(r)*factorial(n-r));
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total number items");
		long n = sc.nextLong();
		System.out.println("Enter the items to be arranged");
		long r = sc.nextLong();
		if(n<r)
		{
			System.out.println("combination not formed");
		}else
		{
			System.out.println("Permutation "+permutation(n,r));
			System.out.println("Combinations "+combination(n,r));
		}
		sc.close();
	}

}
