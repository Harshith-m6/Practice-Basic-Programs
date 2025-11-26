package com.rc.programs;

public class MultiThreadingThread5 {
	public static void main(String[] args) {
		System.out.println("Main method Started");
		//if we call run method it will execute in the same stack
		// if we call start method it will creates separate execution path and targets the run method execute in separate stack
		Thread t1 = new CapitalThread();
		t1.start();
		Thread t2 = new SmallThread();
		t2.start();
		System.out.println("Main method Ended");
		//since Threads executes simultaneously output will be not in order
	}

}
