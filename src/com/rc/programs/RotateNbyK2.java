package com.rc.programs;
import java.util.*;
public class RotateNbyK2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		System.out.println("Enter the number of rotations");
		int r = sc.nextInt();
		
		int temp=n;
		int count= 0;
		while(temp!=0)
		{
			temp/=10;
			count++;
		}
		
		r%=count;
		if(r<0)
		{
			r+=count;
		}
		
		int div=1;
		int mul =1;
		
		for(int i =1 ; i<=count ; i++)
		{
			if(i<=r)
			{
				div*=10;
			}else {
				mul*=10;
			}
		}
		
		int q = n/div;
		int rem = n%div;
		
		int rev = rem*mul+q;
		
		System.out.println("Reveresed number "+rev);
		
		
		
	}

}
