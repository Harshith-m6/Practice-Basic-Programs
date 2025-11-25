package com.rc.programs;

public class MultiThreading1 {
	
	static void display()
	{
		for(int i =1 ; i<=5 ;i++)
		{
			System.out.println(i);
		}
	}
	
	static void write()
	{
		for(int i =1 ; i<=15 ;i++)
		{
			System.out.println(i);
		}
		
	}
	public static void main(String[] args) {
		System.out.println("Main method started");
		display();
		System.out.println("---------------------");
		write();
		System.out.println("Main method ended");
	}
	
	//JVM divides main memory into 3 parts
	//static area , heap area , static pool or class area
	//JVM loads into stack area when a program is executed
	//JIT , class loader , program controller , 
	// JVM calls the class loader to load the specified class into class area
	//class defination is loaded into class area
	//class loader is responsible to allocate the memory to the static members of the class
	//jvm - finds the main methods that is loaded into stack area (method must public )
	//one package member should load into another package only if it is public
	//main method should be public , static and it should take string array as an  argument
	// jvm is predefined code of java
	//jvm going to call the main method using class name so it should be static
	//program controller - its a register which holds the reference of next instruction to be excecuted
	// IR - holds the reference of current instruction which is executing
	// first jvm is loaded into stack area then static members are loaded into class area
	// then main method is loaded into stack area
	//  once main method is loaded into stack area and starts executing it calls the display method after display method is executed control comes back to main method
	// display method is unload from stack area and main method calls write method after write method executes the control comes back to main method
	// after main method is ended controller comes back into jvm
	// 

}
