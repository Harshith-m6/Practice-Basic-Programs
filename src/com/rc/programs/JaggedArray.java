package com.rc.programs;

public class JaggedArray {
	public static void main(String[] args) {
		int[][] jag = {{1,2,3},{3,4},{5,6,7,8}};
		
		for(int i = 0 ; i<jag.length;i++)
		{
			for(int j =0 ; j<jag[i].length;j++)
			{
				System.out.print(jag[i][j]+"\s");
			}
		}
	}

}
