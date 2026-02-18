package com.rc.programs;

public class SwapNums {
	public static void main(String[] args) {
		int a = 10;
		int b =20;
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("a values is "+a+"\nb values is "+b);
	}

}
