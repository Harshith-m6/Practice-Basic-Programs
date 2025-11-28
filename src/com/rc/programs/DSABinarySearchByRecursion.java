package com.rc.programs;

import java.util.Arrays;

public class DSABinarySearchByRecursion {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8,9,0,6,5,43,2,1};
		Arrays.sort(a);
		int index = binarySearch(a ,6);
		if(index==-1)
		{
			System.out.println("ELement is not present ");
		}else {
			System.out.println("Element is present at the index "+index);
		}
	}
	
	static int binarySearch(int[] x , int ele)
	{
		return binarySearch(x , ele , 0 , x.length-1);
	}
	static int binarySearch(int[] x , int ele , int low , int high )
	{
		int mid = (low+high)/2;
		if(low>high)
			return -1;
		if(ele==x[mid])
			return mid;
		if(ele>x[mid])
			return binarySearch(x,ele,mid+1,high);
		else
			return binarySearch(x,ele,low , mid-1);
	}

}
