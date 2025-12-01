package com.rc.programs;

public class MultiThreadingSynchronization {
	public static void main(String[] args) throws InterruptedException {
		Account a = new Account(12,10000);
		
		Thread t1 = new Thread(()->a.deposit(100));
		Thread t2 = new Thread(()->a.withDraw(200));
		
		t2.start();
		
		Thread.sleep(1000);
		t1.start();
		
		
	}

}
