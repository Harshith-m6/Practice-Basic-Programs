package com.rc.programs;
import java.util.*;
public class LCM1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("LCM :"+lcm(a,b));
	}
	
	static int lcm(int a , int b)
	{
		int min , max;
		
		 min = Math.min(a, b);
		max = Math.max(a, b); 
		
		for(int i = max  ; i <= a*b ; i+=max)
		{
			if(i%min==0)
				return i;
		}
		return a*b;
	}

}
