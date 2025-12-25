package com.rc.programs;

public class Practice14 {
	public static void main(String[] args) {
		int[] ar = {1,2,3,4,5,6};
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for(Integer i : ar)
		{
			if(i<min)
			{
				min =i;
			}
			if(i>max)
				
			{
				max=i;
			}
		}
		System.out.println(min);
		System.out.println(max);
	}
}
