package com.rc.programs;

public class RecursionFindArrayElementIndex {
	//find the index of the element present in Array using recursion
	public static void main(String[] args) {
		int[] a = {1,2,4,3,5,6,7,8,9};
		int n = 4;
		
		int index = index(a,n);
		if(index==-1)
		{
			System.out.println("Element is not present in the Array");
		}else {
			System.out.println("Index of "+n+" is "+index);
		}
	}
	
	static int index(int[] a , int n)
	{
		return index(a,n,0);
	}
	
	static int index(int[] a , int ele , int index) 
	{
		if(index==a.length)
		{
			return -1;
		}
		if(a[index]==ele)
		{
			return index;
		}
		return index(a,ele,index+1);
	}
	
}
