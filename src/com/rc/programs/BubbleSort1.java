package com.rc.programs;

public class BubbleSort1 {
	public static void main(String[] args) {
		int[] arr = {1,5,2,3,5,7,8,8,3,2};
		bubbleSort(arr);
		for(int i : arr)
		{
			System.out.print(i+" ");
		}
	}
	private static void bubbleSort(int[] arr)
	{
		boolean swapped ;
		int n = arr.length;
		for(int i =0 ; i<arr.length-1 ; i++)
		{
			swapped = false;
			for(int j =0 ; j <n-1-i ; j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swapped = true;
				}
			}
			if(!swapped)
				break;
		}
	}

}
