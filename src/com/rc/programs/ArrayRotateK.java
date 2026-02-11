package com.rc.programs;

public class ArrayRotateK {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		int k = 2;
		
		leftShift(arr,k);
		rightShift(arr,k);
	}
	private static void leftShift(int[] arr ,int k) {
		int n = arr.length-1;
		reverse(arr,0,k-1);
		reverse(arr,k,n);
		reverse(arr,0,n);
		
		for(int i : arr)
		{
			System.out.print(i);
		}
		System.out.println();
	}
	private static void reverse(int[] arr , int start , int end )
	{
		while(start<end)
		{
			int temp = arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}
//	
	private static void rightShift(int[] arr ,int k)
	{
		k=4;
		int n = arr.length-1;
		reverse(arr,0,n);
		reverse(arr,0,k-1);
		reverse(arr,k,n);
		
		for(int i : arr)
		{
			System.out.print(i);
		}
	}

}
