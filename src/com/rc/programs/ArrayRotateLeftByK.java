package com.rc.programs;

import java.util.Scanner;

public class ArrayRotateLeftByK {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8,9};
		System.out.println("enter the order of rotation");
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		
		rev(a,0,k-1);
		rev(a,k,a.length-1);
		rev(a,0,a.length-1);
		
		for(int x : a)
		{
			System.out.print(x+"\s");
		}
		sc.close();
	}
	
	static void rev(int[] a , int start, int end )
	{
		while(start<end)
		{
			int temp = a[start];
			a[start]=a[end];
			a[end]=temp;
			start++;
			end--;
		}
	}

}
