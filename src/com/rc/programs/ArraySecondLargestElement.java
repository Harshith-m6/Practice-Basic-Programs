package com.rc.programs;

public class ArraySecondLargestElement {
	public static void main(String[] args) {
		int[] a = {1,3,2,5,4,7,6};
		int max = a[0];
		int second = a[0];
		for(int x : a)
		{
			if(x>max)
			{
				second = max;
				max = x;
			}else if(x> second && x!=max )
			{
				second = x;
			}
		}
		System.out.println("Second Highest element : "+second);
	}

}
