package com.rc.programs;

public class ExoDiagonal {
	
	static int exoDaigonal(int[][] x)
	{
		int row = x.length;
		int col =x[0].length;
		int sum =0;
		for(int i=0 ;i<col;i++)
		{
			sum=sum+x[i][i];
			if(i<col-1)
				sum=sum+x[row-1-i][i];
		}
		return sum;
	}

}
