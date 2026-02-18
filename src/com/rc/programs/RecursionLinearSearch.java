package com.rc.programs;

public class RecursionLinearSearch {
	
	int linearSearch(int[] arr ,int ele)
	{
		return search(arr,ele,0);
	}
	
	private int search(int[] arr ,int ele , int i)
	{
		if(i>arr.length-1)
			return -1;
		return (arr[i]==ele)?i:search(arr, ele , i+1);
	}

}
