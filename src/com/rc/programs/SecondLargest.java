package com.rc.programs;

public class SecondLargest {
	public static void main(String[] args) {
//		int[] a = {9,3,4,1,5,6,2,8,7};
//		int first = Integer.MIN_VALUE; int second = Integer.MIN_VALUE;
//		for(int n : a)
//		{
//			if(n>first)
//			{
//				second = first;
//				first = n;
//			}else if(n>second && first!=second)
//			{
//				second =n;
//			}
//		}
//		System.out.println("First "+first+" and Second "+second );
		
		
		int[] a = {9,3,4,1,5,6,2,8,7};
		int first = Integer.MIN_VALUE ;
		int second = Integer.MIN_VALUE;
		
		for(int n : a )
		{
			if(n>first)
			{
				second = first;
				first = n;
			}else if(n>second && first!=second)
			{
				second =n;
			}
		}
		System.out.println("First :"+first+"\n"+"second :"+second);
	}

}
