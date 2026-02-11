package com.rc.programs;

public class ArrayDuplicatesFindingSorted {
	
	public static void main(String[] args) {
		
		int[] ar = {4,4,3,3,2,2,1,1};
		int j=0;
		for(int i=0 ; i<ar.length;i++)
		{
			if(ar[j]!=ar[i])
			{
				j++;
				ar[j]=ar[i];
			}
		}
		for(int i=0;i<=j;i++)
		{
			System.out.print(ar[i]);
		}
		
	}

}
