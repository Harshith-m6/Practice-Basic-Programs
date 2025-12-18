package com.rc.programs;

import java.util.Arrays;

public class ArrayMergeInZigZag {
	public static void main(String[] args) {
		int[] a = {1,3,5,7,9};
		int[] b = {2,4,6,8,0,11,12,13};
		int[] c = zigZag(a,b);
		System.out.println(Arrays.toString(c));
	}
	
	static int[] zigZag(int[] x , int[] y)
	{
		int[] z = new int[x.length+ y.length];
		int i =0 , j=0 , k=0;
		while(k<z.length)
		{
			if(i<x.length && j<y.length)
			{
				z[k++]=x[i++];
				z[k++]=y[j++];
			}else if(i<x.length)
			{
				z[k++]=x[i++];
			}else {
				z[k++]=y[j++];
			}
		}
		
		return z;
	}

}
