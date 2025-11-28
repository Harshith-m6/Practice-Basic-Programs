package com.rc.programs;

import java.util.Arrays;

public class DSABinarySearchArray {
	public static void main(String[] args) {
		int[] a = {10,90,70,40,60,50};
		Arrays.sort(a);
		int index =binarySearch(a , 90);
		if(index==-1)
		{
			System.out.println("Element not present");
		}else
		{
			System.out.println("Element present at "+index);
		}
	}
	
	static int binarySearch(int[] a ,int ele)
	{
		int low =0 , high = a.length-1;
		
		while(low<=high) {
			int mid= (low+high)/2;
		if(ele==a[mid])
		{
			return mid;
		}
		if(ele>a[mid])
		{
			low = mid +1;
		}else {
			high= mid-1;
		}
		}
		return -1;
	}

}
