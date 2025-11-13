package com.rc.programs;
import java.util.*;

public class ValidTriangle {
	public static void main(String[] args) {
		System.out.println("Enter the sides of the traingle");
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		boolean triangle = valid(a,b,c);
		
		System.out.println(triangle?"its a valid triangle":"not a valid triangle");
	}
	static boolean valid(double a , double b , double c)
	{
		return (a+b>c)&&(b+c>a)&&(c+a>b);
	}

}
