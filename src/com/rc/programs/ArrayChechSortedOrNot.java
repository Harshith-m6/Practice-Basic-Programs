package com.rc.programs;

public class ArrayChechSortedOrNot {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,9,6};
		int[] b = {6,5,4,3,2,1,9};
		
		System.out.println(isSorted(a)?" Yes ":" No ");
		System.out.println(isSorted(b)?" Yes ":" NO ");
	}
	
	static boolean isSorted(int[] x)
	{
		boolean as = true;
		boolean ds = true;
		for(int i =0 ; i<x.length-1 ; i++)
		{
			if(x[i+1]<x[i])
			{
				as=false;
			}
			
			if(x[i+1]>x[i])
			{
				ds=false;
			}
		}
		return as||ds;
	}

}
