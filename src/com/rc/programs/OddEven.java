package com.rc.programs;

import java.util.Scanner;

public class OddEven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		if(oddEven(n))
		{
			System.out.println(n+ " is a even number");
		}else {
			System.out.println(n+ "  is a odd number");
		}
	}
	static boolean oddEven(int n )
	{
		int d = 0;
		if(n%2==0)
		{
			return true;
		}
		else {
			return false;
		}
	}

}
