package com.rc.programs;

public class ArrayMoveZerosToEnd {
	public static void main(String[] args) {
		int[] ar= {0,1,0,3,0,12};
		int j=0;
		for(int i=0 ; i<ar.length;i++)
		{
			if(ar[i]!=0)
			{
				int temp=ar[i];
				ar[i]=ar[j];
				ar[j]=temp;
				j++;
			}
		}
		
		for(int i : ar)
		{
			System.out.print(i);
		}
	}

}
