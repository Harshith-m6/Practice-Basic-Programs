package com.rc.programs;

public class ArrayPrintDuplicates {
	public static void main(String[] args) {
		int[] arr = {1,8,3,4,5,1,2,9,3,4,2,0};
		for(int i =0 ; i<arr.length ; i++)
		{
			boolean dup = false;
			for(int j =0 ; j<arr.length ; j++)
			{
			
				if(arr[i]==arr[j] && i!=j)
				{
					dup = true;
					break;
				}
			}
			if(!dup)
			{
				System.out.println("Unique values "+arr[i]);
			}
		}
	}

}
