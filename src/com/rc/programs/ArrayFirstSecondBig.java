package com.rc.programs;

public class ArrayFirstSecondBig {
	public static void main(String[] args) {
		int[] ar = {4,3,5,2,1,6,7};
		int big = Integer.MIN_VALUE;
		int sbig = Integer.MIN_VALUE;
		for(int i =0 ; i<ar.length ; i++)
		{
			if(ar[i]>big)
			{
				sbig=big;
				big=ar[i];
				
			}else if(ar[i]>sbig && ar[i]!=big)
			{
				sbig=ar[i];
			}
		}
		System.out.println(big+" is first big");
		System.out.println(sbig+" is second big");
		
	}

}
