package com.rc.programs;
import java.util.*;
public class BiggestOfThree2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println("Biggest is :"+big(a,b,c));
	}
	
	static int big(int x , int y , int z)
	{
		return z>((x>y)?x:y)?z:((x>y)?x:y);
	}
	
	

}
