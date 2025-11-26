package com.rc.programs;

public class MyThread extends Thread{
	//define a subclass to Thread and override the run() 
	//separate execution code should inside the run()
	//here the code will be executes in different Thread
	
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		for(char ch='A'; ch<='Z';ch++)
		{
			System.out.println(ch);
		}
	}

}
