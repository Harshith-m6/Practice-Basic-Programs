package com.rc.programs;
import java.util.*;
public class DistBwTwoPoints {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter point 1");
		int a1 = sc.nextInt();
		int b1 = sc.nextInt();
		System.out.println("Enter point 2");
		int a2 = sc.nextInt();
		int b2 = sc.nextInt();
		
		double distance = diff(a1,a2,b1,b2);
		
		System.out.println("Distance between two points is :"+distance);
		
		
	}
	
	public static double diff(int x1 ,int x2 , int y2 , int y1 )
	{
		return Math.sqrt(Math.pow(x2-x1,2)+(Math.pow(y2-y1,2)));
	}

}
