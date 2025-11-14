package com.rc.programs;
import java.util.*;
public class RotateNbyK {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		System.out.println("enter the order to swap");
		int k = sc.nextInt();
		
		int temp =n;
		int count = 0;
		while(temp!=0)
		{
			temp/=10;
			count++;
		}
		
		k = k%count;
		if(k<0)
		{
			k+=count;
		}
		
		int div = 1;
		int mul = 1;
		for(int i = 1 ; i<=count ; i++)
		{
			if(i<=k)
			{
				div*=10;
			}else {
				mul=mul*10;
			}
		}
		
		int q = n/div;
		int r = n%div;
		
		int rev = r*mul+q;
		
		System.out.println("reversed number "+rev);
		
	}

}
