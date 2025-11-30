package com.rc.programs;

public class Array2DSumOfCol {
	public static void main(String[] args) {
		int[][] a = {{1,2,3},
				{4,5,6},
				{7,8,9}};
		int[] sum = new int[a[0].length];
		for(int col=0 ; col<a[0].length;col++)
		{
			
			for(int row=0 ; row<a.length;row++)
			{
				sum[col] += a[row][col];
			}
		}
		for(int i : sum)
		{
			System.out.println(i);
		}
	}

}
