package com.rc.programs;

public class Arithematic {
	
	int a ;
	int b;
	
	Arithematic(int a , int b)
	{
		this.a = a;
		this.b = b;
	}
	
	synchronized void add(int a , int b)
	{
		System.out.println("A value is "+a);
		System.out.println("B value is "+b);
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("Sum is "+(a+b));
	}
	
	synchronized void update(int a , int b)
	{
		a+=10;
		b+=5;
	}

}
