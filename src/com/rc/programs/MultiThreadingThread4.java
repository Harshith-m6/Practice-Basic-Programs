package com.rc.programs;

public class MultiThreadingThread4 {
	public static void main(String[] args) {
		
		System.out.println("Main method Started");
		System.out.println(Thread.currentThread().getName());
		Thread t = new MyThread();
		t.setName("Harshith");
		t.start();
		System.out.println("Main Method Ended");
		//concurrancy happens here 
		//both main and Harshith executes simultaneously
	}

}
