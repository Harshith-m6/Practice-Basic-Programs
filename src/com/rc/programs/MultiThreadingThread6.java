package com.rc.programs;

public class MultiThreadingThread6 {
	//One Thread can start only one time if we try to start one more time it throws IllegalThreadStateException
	//there are 3 join() in Thread class(zero , milliSecond , (milliSecond , nanoSecond))
	static class MyRunnable implements Runnable //2nd way to give the implementation for the run() method
	{
		@Override
		public void run() {
			for(int i=1 ; i<=10 ; i++)
			{
				System.out.println(Thread.currentThread().getName()+"->"+i);
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	public static void main(String[] args) throws InterruptedException
	{
		Runnable task = new MyRunnable();
		Thread t1 = new Thread(task,"Java");
		Thread t2 = new Thread(task,"Python");
		Thread t3 = new Thread(task,"GoLang");
		t1.start();
		t1.join();//until go to dead state t2 and t3 will not execute
		t2.start();//java.lang.IllegalThreadStateException
		t2.join(5000); // t3 will start after 5 seconds of t2 execution
		t3.start();
		
	}

}
