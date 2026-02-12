package com.rc.programs;

public class RecursionBinarySearch {
	
	int binarySearch(int[] arr , int ele)
	{
		return binary(arr,ele,0,arr.length-1);
	}
	
	private int binary(int[] arr , int ele , int low , int high)
	{
		if(low>high)
			return -1;
		int mid = (low+high)/2;
		if(arr[mid]==ele)
			return mid;
		if(ele<arr[mid])
		{
			return binary(arr,ele,low, mid-1);
		}else {
			return binary(arr,ele,mid+1,high);
		}
	}

}
