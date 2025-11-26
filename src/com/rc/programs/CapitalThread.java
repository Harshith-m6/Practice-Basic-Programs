package com.rc.programs;

public class CapitalThread extends Thread {
	
	public void run()
	{
		for(char ch='A' ; ch<='Z' ; ch++)
		{
			System.out.println(ch);
			if(ch=='M')
				try {
					Thread.sleep(20000);
				}catch(Exception e)
			{
					System.out.println(e);
			}
		}
	}

}
//sleep() static overloaded method of Thread class
//if we calls current executing Thread stops 