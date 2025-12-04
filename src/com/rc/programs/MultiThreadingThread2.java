package com.rc.programs;

public class MultiThreadingThread2 {
	
	public static void main(String[] args) {
		System.out.println("Main method started");
		//when program executes main method loads into the stack memory
		//main method is loaded into a Thread (stack)
		//to check the id , name , priority of the main method thread
		//getter methods are non static methods required the references to call them
		//Thread nothing but stack - Stack and Thread both area Same
		Thread t =Thread.currentThread();//gives the reference(address) of the current Thread
		System.out.println(t.getId()); // marked because  its a depricated method since version 19
		System.out.println(t.getName());
		System.out.println(t.getPriority());
		
		System.out.println("Main method Ended");
		
	}

}
