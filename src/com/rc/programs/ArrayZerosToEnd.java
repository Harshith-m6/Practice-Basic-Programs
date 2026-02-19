package com.rc.programs;

import java.util.Arrays;

public class ArrayZerosToEnd {
	public static void main(String[] args) {
		int[] arr = {1,0,20,3,0,5,6};
		int index=0;
		for(int n : arr)
		{
			if(n!=0)
			{
				arr[index++]=n;
			}
		}
		
		while(index<arr.length)
		{
			arr[index++]=0;
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
