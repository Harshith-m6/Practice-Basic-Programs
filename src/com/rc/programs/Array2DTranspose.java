package com.rc.programs;

public class Array2DTranspose {
	public static void main(String[] args) {
		int[][] a = {{1,2,3},
				{4,5,6},
				{7,8,9}};
		int[][] t = new int[a.length][a[0].length];
		for(int r =0 ; r<a.length;r++)
		{
			for(int c=0 ; c<a[0].length;c++)
			{
				t[c][r]=a[r][c];
				
			}
			
		}
		for(int r =0 ; r<t.length;r++)
		{
			for(int c=0 ; c<t[0].length;c++)
			{
				System.out.print(t[r][c]);
				
			}
			System.out.println();
			
		}
	}

}
