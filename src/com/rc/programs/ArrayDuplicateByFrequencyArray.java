package com.rc.programs;

public class ArrayDuplicateByFrequencyArray {
	public static void main(String[] args) {
		int[] arr = {1,2,3,1,4};
		int n =arr.length;
		int[] freq = new int[n];
		for(int i =0 ; i<arr.length ; i++)
		{
			freq[arr[i]]++;
			
			if(freq[arr[i]]>1)
			{
				System.out.print(arr[i]+" is a duplicate element");
			}
		}
		
		
	}

}
