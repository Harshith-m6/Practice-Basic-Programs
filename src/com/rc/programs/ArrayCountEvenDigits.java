package com.rc.programs;

public class ArrayCountEvenDigits {
	public static void main(String[] args) {
		int[] a = {12,34,56,78,90};
		int evenCount =0;
		int d =0;
		for(int e : a)
		{
		
			int temp = e;
			while(e!=0)
			{
				d = e%10;
				if(d%2==0)
				{
					evenCount++;
				}
				e/=10;
			}
		}
		
		System.out.println(evenCount);
	}

}
