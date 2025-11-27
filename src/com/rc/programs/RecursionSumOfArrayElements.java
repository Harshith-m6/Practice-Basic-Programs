package com.rc.programs;

public class RecursionSumOfArrayElements {
	
		//calculate the sum of array elements using recursion
	static int sum(int[] a , int sum , int index)
	{
		if(index>=a.length)
		{
			return sum;
		}
		sum+=a[index];
		return sum(a,sum,index+1);
	}
	static int sum(int[] a)
	{
		return sum(a,0,0);
	}
	
	public static void main(String[] args) {
		int a[] = {1,1,1,1,1,1,1};
		int sum = sum(a);
		System.out.println(sum);
	}
	}


