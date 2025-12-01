package com.rc.programs;

public class Account {
	int accno;
	int balance;
	
	Account(int accno , int balance)
	{
		this.accno=accno;
		this.balance=balance;
	}
	
	synchronized void deposit(int amt)
	{
		balance+=amt;
		System.out.println("Amount Deposited : "+amt);
		System.out.println("Available Balance :"+balance);
		notify();
	}
	
	synchronized void withDraw(int amt)
	{
		if(amt>balance)
		{
			System.out.println("Low Balance..."+balance);
			try {
				wait();
			}catch(InterruptedException e)
			{
				System.out.println(e);
			}
			return;
		}
		balance-=amt;
		System.out.println("Successfully withdrawn: "+amt);
		System.out.println("Available balance : "+balance);
	}
	
	//InterThread communication when Threads are synchronized
	//duman thread
	//runnable
	//user thread
	

}
