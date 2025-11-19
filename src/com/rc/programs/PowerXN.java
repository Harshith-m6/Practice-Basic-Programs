package com.rc.programs;
import java.util.*;
public class PowerXN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter n and x");
		int n = sc.nextInt();
		int x = sc.nextInt();
		
		int pow = power(n,x);
		System.out.println("Power "+pow);
	}
	
	static int power(int n,int x)
	{
		if(x==1)
			return n;
		int pm1 = power(n , x-1);
		int p = n * pm1;
		return p;
	}

}
