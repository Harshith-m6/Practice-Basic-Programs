package com.rc.programs;

public class ArrayUnique1 {
	//using XOR operation
	public static void main(String[] args) {

		int[] arr= {2,3,4,2,3,1,4};
		int uni = 0;
		for(int ele : arr)
		{
			uni = uni^ele;
		}
		System.out.println(uni);
	}
	

}
