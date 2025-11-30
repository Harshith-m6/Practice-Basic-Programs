package com.rc.programs;

public class ShortCircuitOps {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		if(a>b&&a++<b) {} //java skipped the right side condition
		System.out.println(a);
		
		if(a<b||a++<b) {} 
		System.out.println(a); // java skipped the right side condition
		//to improve performance jvm skips (so they called as short circuit operators)
		
		if(a>b&a++<b) {} 
		System.out.println(a);
		
		if(a<b|a++<b) {} 
		System.out.println(a);
		
		
	}

}
