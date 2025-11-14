package com.rc.programs;

import java.util.Scanner;

public class PDIrecursion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num");
		int n = sc.nextInt();
		pdi(n);
	}
	static void pdi(int n)
	{
		if(n==0) return ;
		System.out.println(n);// line executes before the method is called
		pdi(n-1); // recursion
		System.out.println(n); // prints during backtracking  (when the control comes back to caalled method and rest of the lines executes)
	}

}
