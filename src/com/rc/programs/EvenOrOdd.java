package com.rc.programs;
import java.util.*;
public class EvenOrOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		if((n&1)==0)
		{
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
		
		if((n&1)==1)
		{
			System.out.println("Odd");
		}else {
			System.out.println("Even");
		}
	}

}
