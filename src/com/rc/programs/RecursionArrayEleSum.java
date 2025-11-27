package com.rc.programs;

public class RecursionArrayEleSum {
	
	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5,6,7,8};
		
		int sum = sum(a);
		
	}
	
	static int sum(int[] a)
	{
		return sum(a,0);
	}
	
	static int sum(int[] a ,int ind)
	{
		if(ind==a.length)
		{
			return 0;
		}
		return a[ind]+sum(a,ind+1);
	}

}
