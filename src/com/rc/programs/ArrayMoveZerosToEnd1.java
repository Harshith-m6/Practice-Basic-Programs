package com.rc.programs;

import java.util.Arrays;

public class ArrayMoveZerosToEnd1 {
	public static void main(String[] args) {
		int[] arr = {1,0,1,0,2,3,0,1};
	    required(arr);
	    System.out.println(Arrays.toString(arr));
	}
	private static void required(int[] arr)
	{
		int index =0;
		for(int i =0; i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				arr[index++]=arr[i];
			}
		}
		while(index<arr.length)
		{
			arr[index++]=0;
		}
	}

}
