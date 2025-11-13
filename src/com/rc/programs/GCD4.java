package com.rc.programs;
import java.util.*;
public class GCD4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("Gcd :"+gcd(a,b));
	}

	static int gcd(int a , int b)
	{
		int rem =0;
		if(a>b)
		{
			rem = a%b;
			if(rem!=0) {
				return gcd(b,rem);
			}else {
				return b;
			}	
		}else {
			rem = b%a;
			if(rem!=0) {
				return gcd(a,rem);
			}else {
				return a;
			}	
		}
	}
}
