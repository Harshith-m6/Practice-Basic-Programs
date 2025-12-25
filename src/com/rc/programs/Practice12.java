package com.rc.programs;

public class Practice12 {
	public static void main(String[] args) {
		print(100);
		prints(100, 1);
	}
	static void print(int n) {
		if(n==0)
			return ;
		System.out.println(n);
		print(n-1);
	}
	
	static void prints(int n , int x)
	{
		if(x>n)
		{
			return;
		}
		System.out.println(x);
		prints(n,x+1);
	}
	

}
