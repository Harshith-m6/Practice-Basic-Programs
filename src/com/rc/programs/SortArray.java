package com.rc.programs;

public class SortArray {
	public static void main(String[] args) {
		int[] a = {9,3,4,1,5,6,2,8,7};
		for(int i = 0 ; i<a.length;i++)
		{
			for(int j=i+1 ; j<a.length ;j++)
			{
				if(a[i]>a[j])
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		
		}
		for(int n : a)
		{
			System.out.print(n+" ");
		}
	}

}
