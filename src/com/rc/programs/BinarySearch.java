package com.rc.programs;

public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		int k = 7;
		int index = search(k, arr);
		if(k==-1)
		{
			System.out.println("Element not found");
		}else {
			System.out.println("Element found at index "+index);
		}
	}
	
	private static int search(int k, int[] arr)
	{
		int left = 0;
		int right = arr.length-1;
		while(left<=right)
		{
			int mid = left+(right-left)/2;
			if(arr[mid]==k)
				return mid;
			if(k>arr[mid])
			{
				left=mid+1;
			}else {
				right= mid-1;
			}
		}
		return -1;
		

	}

}
