package com.rc.programs;
import java.util.Scanner;
public class SwapTwoNums {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a ");
		int a = sc.nextInt();
		System.out.println("enter b");
		int b = sc.nextInt();
		
		a = a^b;
		b=b^a;
		 a^=b;
		 System.out.println("a is "+a);
		 System.out.println("b is  "+b);
		
		
	}

}
