package com.rc.programs;

public class Practice9 {
	public static void main(String[] args) {
		int x = 10001;
		System.out.println(pal(x)?"palindrome":"not palindrome");
		System.out.println(pali(x)?"palindrome":"not palindrome");

	}
	
	static boolean pal(int x)
	{
		int rev =0;
		int temp =x;
		while(x!=0)
		{
			int d = x%10;
			rev=rev*10+d;
			
			x/=10;
			
		}
		return temp==rev;
	}
	
	static boolean pali(int n)
	{
		return pali(n,0,0)==n;
	}
	
	static int pali(int n , int d , int rev)
	{
		if(n==0)
			return rev;
		d=n%10;
		rev=rev*10+d;
		return pali(n/10,0,rev);
	}

}
