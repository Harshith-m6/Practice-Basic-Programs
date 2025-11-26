package com.rc.programs;

public class MultiThreadingThread1 {
	//if we want to execute multiple task simultaneously we want to load them in different stack
	public static void main(String[] args) {
		Thread t1 = new Thread();
		System.out.println(t1.getName()); // default name : Thread-0 (name , id , priority are 3 properties of thread)
		System.out.println(t1.getId());//21
		System.out.println(t1.getPriority());//5
		
		Thread t2 = new Thread();
		System.out.println(t2.getName());//Thread-2
		System.out.println(t2.getId());//22
		System.out.println(t2.getPriority());////5

		Thread t3 = new Thread("Recursive");
		System.out.println(t3.getName());//Recurs
		System.out.println(t3.getId());//23
		System.out.println(t3.getPriority());//5
		
		//we can set Name and priority of a Thread but not id
		//Thread is a predefined class  present in java.lan package
		//Priority of the Thread will be between 1 to 10
		// 1 is least priority and 10 is the max priority
		//out of this range if we mention the priority is throws illegal argument exception
		// by default it will be NORM_Priority
		t1.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t1.getPriority());
		
		t1.setPriority(Thread.MIN_PRIORITY);
		System.out.println(t1.getPriority());
		
		t1.setName("Harshith");
		System.out.println(t1.getName());
		
	}
}
