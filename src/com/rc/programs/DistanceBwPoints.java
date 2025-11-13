package com.rc.programs;
import java.util.*;
public class DistanceBwPoints {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a coordinate");
		int a = sc.nextInt();
		int  b = sc.nextInt();
		System.out.println("Enter another coordinate");
		int  d = sc.nextInt();
		int c = sc.nextInt();
		
		double dist = pythogoras(a,b,c,d);
		System.out.println("the distance between two points is "+dist);
		
	}
	
	static double pythogoras(int x1, int x2, int y1, int y2) {
		
		
		return Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
	}
	

}
