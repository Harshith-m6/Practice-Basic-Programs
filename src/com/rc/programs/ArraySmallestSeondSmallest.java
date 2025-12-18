package com.rc.programs;

public class ArraySmallestSeondSmallest {
	public static void main(String[] args) {
		int[] ar = {9,1,2,0,3,4,5,6,7,8};
		int fsmall = Integer.MAX_VALUE;
		int ssmall = Integer.MAX_VALUE;
		
		for(int ele : ar)
		{
			if(ele<fsmall)
			{
				ssmall = fsmall;
				fsmall= ele;
				
			}else if(ele<ssmall && ele!=fsmall)
			{
				ssmall=ele;
			}
		}
		
		System.out.println("First Small is "+fsmall);
		System.out.println("Second Small is "+ssmall);
	}

}
