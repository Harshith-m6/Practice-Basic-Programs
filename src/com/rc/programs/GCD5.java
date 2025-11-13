package com.rc.programs;
import java.util.*;
public class GCD5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("GCD :"+gcd(a,b));
	}
	static int gcd(int a , int b)
	{
		return (b==0)?a:gcd(b,a%b);
	}

}
