package com.rc.programs;

import java.util.Scanner;

public class ArrayRotateElementsLeftByK {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the order of rotation");
		int k = sc.nextInt();
		k = k%a.length;
		reverse(a,0,k-1);
		reverse(a,k,a.length-1);
		reverse(a,0,a.length-1);
		
		for(int ele : a)
		{
			System.out.print(ele+" ");
		}
		
	}
	
	static void reverse(int[] a , int start , int end)
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
