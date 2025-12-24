package com.rc.programs;

public class Practice5 {
	public static void main(String[] args) {
		int a = 10;
		int b  =20;
		
		a^=b; // 10^20 = 30
		b^=a;// 30^20 = 10
		a^=b; // 30^10 = 20
		
		System.out.println(a);
		System.out.println(b);
		
		
		
	}

}
