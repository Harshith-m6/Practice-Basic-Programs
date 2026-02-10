package com.rc.programs;
import java.util.*;
public class ArrayRotateByk {
	public static void main(String[] args) {
		int[] ar = {1,2,3,4,5};
		System.out.println("Enter the order of rotation");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		n=n%ar.length;
		for(int k=0 ; k<n ; k++)
		{
			int start = ar[0];
			for(int i =0 ; i<ar.length-1 ; i++)
			{
				ar[i]=ar[i+1];
			}
			ar[ar.length-1]=start;
		}
		System.out.println(Arrays.toString(ar));
		
	}

}
