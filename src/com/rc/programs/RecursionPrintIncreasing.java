package com.rc.programs;
import java.util.*;
public class RecursionPrintIncreasing {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("number :");
		int n = sc.nextInt();
		priInc(n);
	}
	static void priInc(int n)
	{
		if(n==0) return;
		priInc(n-1);
		System.out.println(n); //prints by backTracking
		
	}

}
