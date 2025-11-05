package com.rc.programs;

public class SecondLargestInArray {
	public static void main(String[] args) {
		int[] a = {14,10,8,9,5,12,13};
		
		int first = Integer.MIN_VALUE , second = Integer.MIN_VALUE;
		for(int num : a)
		{
			if( num>first)
			{
				second = first;
				first = num;
			}else if(num > second && num!= first)
			{
				second = num;
			}
		}
		System.out.println("second largest :"+ second);
	}

}
