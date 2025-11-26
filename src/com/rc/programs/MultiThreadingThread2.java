package com.rc.programs;

public class MultiThreadingThread2 {
	
	//How to create a thread
	public static void main(String[] args) {
		System.out.println("Main method started");
		//when program executes main method loads into the stack memory
		//main method is loaded into a Thread
		//to check the id , name , priority of the main method thread
		//getter methods are non static methods required the refernces to call them
		
		Thread t =Thread.currentThread();//gives the reference(address) of the current Thread
		System.out.println(t.getId());
		System.out.println(t.getName());
		System.out.println(t.getPriority());
		
		System.out.println("Main method Ended");
		
	}

}
