package com.rc.programs;

public class ArrayMax2D {
	public static void main(String[] args) {
		int[][] a = {{5,4,6},{9,7,8},{4,3,5}};
		int max = a[0][0];
		for(int i =0 ; i<a.length;i++)
		{
			for(int j =0 ; j<a[i].length;j++)
			{
				if(a[i][j]>max)
				{
					max = a[i][j];
				}
			}
		}
		System.out.println(max);
	}

}
