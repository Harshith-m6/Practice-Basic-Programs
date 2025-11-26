package com.rc.programs;

public class SmallThread extends Thread{
	
	public void run()
	{
		for(char ch='a'; ch<='z';ch++)
		{
			System.out.println(ch);
		}
		
	}

}
