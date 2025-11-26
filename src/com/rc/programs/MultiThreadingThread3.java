package com.rc.programs;

public class MultiThreadingThread3 {
	//How to create a user thread
	public static void main(String[] args) {
		System.out.println("Main method ended");
		Thread t1 = new Thread();
		t1.start(); // loads the run() of Thread class
		//1 main method loaded into stack area
		//program controller switches from JVM to main method
		//2 Thread object is created inside the Heap area
		// start() creates separate stack (separate execution path)
		//loads the run() in that separate execution path (stack)
		//run() will not execute in the main stack
		System.out.println("Main method ended");
	}


}
