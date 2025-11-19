package com.rc.programs;
import java.util.*;
public class RecursiveFactorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n");
		int n = sc.nextInt();
		
		int fact = fact(n);
		System.out.println("Factorial :"+fact);
	}
	
	static int fact(int n)
	{
		if(n==1)
		{
			return 1;
		}
			
		int fnm1 = fact(n-1);
		int fn = n * fnm1;
		return fn;
	}

}
