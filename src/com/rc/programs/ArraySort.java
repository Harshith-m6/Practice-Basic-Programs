package com.rc.programs;

public class ArraySort {
	public static void main(String[] args) {
		int[] a= {9,7,8,4,5,6,4,1};
		
		for(int i =0 ; i<a.length;i++)
		{
			for(int j =0 ; j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int x : a)
		{
			System.out.println(x);
		}
	}

}
