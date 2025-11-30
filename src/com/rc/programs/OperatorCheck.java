package com.rc.programs;

public class OperatorCheck {
	public static void main(String[] args) {
		byte x = 10;
		char y = 'A';
		byte z = (byte)(x+y); //  explicit casting is required since Integers are by default int type
		System.out.println(z);
		System.out.println('B'+1);
		
		int a = 1;
		System.out.println(++a); // value is incremented and executed 
		System.out.println(a++); // executed and incremented
		System.out.println(a);
		
		
		int w = 1;
		boolean b = (w<2)&&(++w>1);
		System.out.println(b);
		System.out.println(w);
		
		var i = 2;
		var j = 3;
		var c =i>j?"hi":1;
		System.out.println(c);
		
		
	}

}
