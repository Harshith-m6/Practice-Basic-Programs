package com.rc.programs;

public class StaticVariable {
	static int a =10 ;
	int b ;
	public static void main(String[] args) {
		System.out.println(a);  // static variables are created at the class / method area JVM intialize them with default values
		StaticVariable s = new StaticVariable();
		System.out.println(s.a); //instance variables are created at the heap area JVM intialise them with defualt values
	}

}
