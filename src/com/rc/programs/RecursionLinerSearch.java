package com.rc.programs;

public class RecursionLinerSearch {
	
	int search(int[] arr  , int ele)
	{
		return linearSearch(arr , ele , arr.length-1);
	}
	
	private int linearSearch(int arr[] , int ele , int ind)
	{
		if(ind<0)
		{
			return -1;
		}
		
		return (arr[ind]==ele)?ind:linearSearch(arr,ele,ind-1);
	}

}
