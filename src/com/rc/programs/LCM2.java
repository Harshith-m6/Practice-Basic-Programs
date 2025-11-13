package com.rc.programs;
import java.util.*;
public class LCM2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("LCM :"+lcm(a,b));

	}
	
	static int gcd(int a , int b)
	{
		return (b==0)?a:gcd(b,a%b);
	}
	static int lcm(int a , int b) {
		return a*b/gcd(a,b);
	}
	
	
	
	

}
