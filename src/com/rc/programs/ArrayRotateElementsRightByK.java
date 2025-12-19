package com.rc.programs;

import java.util.Scanner;

public class ArrayRotateElementsRightByK {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7};
		System.out.println("Enter the order of rotation");
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		k=k%a.length;
		reverse(a,0,a.length-1);
		reverse(a,a.length-k,a.length-1);
		reverse(a,0,k-1);
		for(int ele : a)
		{
			System.out.print(ele+" ");
		}
		
	}
	
	static void reverse(int [] a ,int start , int end)
	{
		while(start<end)
		{
			int temp= a[start];
			a[start]=a[end];
			a[end]=temp;
			start++;
			end--;
			
		}
	}

}
