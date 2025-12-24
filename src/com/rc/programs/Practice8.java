package com.rc.programs;

public class Practice8 {
	
	public static void main(String[] args) {
		int n = 12345;
		rev(n);
		rever(n);
	}
	
	static void rev(int n)
	{
		int rev=0;
		while(n!=0)
		{
			int d = n%10;
			rev=rev*10+d;
			n/=10;
			
		}
		System.out.println(rev);
	}
	
	static void rever(int n )
	{
		int y =rev(n ,0);
		System.out.println(y);
	}
	
	static int rev(int n , int x)
	{
		if(n==0)
			return x;
		return rev(n/10, x*10+n%10);
	}

}
