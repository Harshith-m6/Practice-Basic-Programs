package com.rc.programs;

public class MultiThreadingObjectSharing {
	//when multiple threads share same resource 
	//there we chance to occur data interruption , deadlock , can't maintain the consistency
	//to avoid this we go with synchronization
	//synchronization :- when one thread is executing other threads will be in ideal state
	
	public static void main(String[] args) throws InterruptedException{
		Arithematic a = new Arithematic(5,2);
		//when synchronized is used only one thread can use that object
		//when all the methods of a class is synchronized than that class is thread-safe
		Thread t1 = new Thread(()->a.add(3, 1));
		Thread t2 = new Thread(()->a.update(3, 3));
		
//		Thread t1 = new Thread(a::add);//Functional Programming
//		Thread t2 = new Thread(a::update);
//		
		
		
		//from java 1.8 = functional argument (can pass function as an argument) 
		t1.start();
		Thread.sleep(1000);
		t2.start();
	}
}
