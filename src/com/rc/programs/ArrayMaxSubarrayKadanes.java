package com.rc.programs;

public class ArrayMaxSubarrayKadanes {
	public static void main(String[] args) {
		int[] arr= {1,2,3,0,-1,2,1,5,-1,3,-3,4,5};
		
		int cSum =0;
		int max=0;
		
		for(int i=0; i<arr.length;i++)
		{
			cSum = Math.max(arr[i], cSum+arr[i]);
			max = Math.max(max, cSum);
		}
		
		System.out.println("maximum sub Array sum is "+max);
	}

}
