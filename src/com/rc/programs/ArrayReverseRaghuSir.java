package com.rc.programs;

public class ArrayReverseRaghuSir {
	public static void main(String[] args) {
		int[] ar = {1,2,3,4,5,6};
		int k =2;
		int[] right = rightShift(ar,k);
		int[] left = leftShift(ar,k);
		
		for(int i : right)
		{
			System.out.print(i);
		}
		System.out.println();
		
		for(int i : left)
		{
			System.out.print(i);
		}
	}
	
	private static  int[] rightShift(int[] arr ,int k)
	{
		int n = arr.length;
		k=k%n;
		int[] res = new int[n];
		for(int i=0 ; i<arr.length ; i++)
		{
			res[(i+k)%n]=arr[i];
		}
		
		return res;
		
	}
	
	private static  int[] leftShift(int[] arr ,int k)
	{
		int n = arr.length;
		k=k%n;
		int[] res = new int[n];
		for(int i=0 ; i<arr.length ; i++)
		{
			res[i]=arr[(i+k)%n];
		}
		
		return res;
		
	}

}
