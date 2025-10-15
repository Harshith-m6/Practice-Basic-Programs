package com.rc.programs;
import java.util.Scanner;
public class PrintNtoM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter starting number ");
		int n = sc.nextInt();
		System.out.println("enter ending number ");
		int m = sc.nextInt();
		print(n,m);
		
		
		
	}
	
	static void print(int n , int m)
	{
		if(n>m)
		{
			return;
		}
		System.out.print(n+((n<m)?" ":""));
		print(n+1,m);
	}

}
