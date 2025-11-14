package com.rc.programs;
import java.util.*;
public class Array2D1 {
	
	public static void main(String[] args) {
		
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		
		int cols = matrix[0].length;
		int rows = matrix.length;
		
		int[] colsum = new int[cols];
		
		for(int c=0 ; c<cols ; c++)
		{
			int sum = 0;
			for(int r = 0 ; r<rows ; r++)
			{
				sum+=matrix[r][c];
			}
			colsum[c] = sum;
		}
		
		System.out.print("[");
		for(int c =0 ; c< cols ; c++)
		{
			System.out.print(colsum[c]);
			if(c<cols-1)System.out.println(",");
		}
		System.out.print("]");
	}

}
