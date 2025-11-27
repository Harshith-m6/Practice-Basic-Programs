package com.rc.programs;

public class ArrayIsSortedOrNot {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6};
		boolean sorted = true;
		for(int i=1 ; i<a.length;i++)
		{
			if(a[i]<a[i-1])
			{
				sorted = false;
				break;
			}
		}
		System.out.println(sorted?"array is sorted":"Array is not sorted");
	}

}
