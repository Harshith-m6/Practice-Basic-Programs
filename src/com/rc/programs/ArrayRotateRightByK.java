package com.rc.programs;

import java.util.Scanner;

public class ArrayRotateRightByK {
	public static void main(String[] args) {
		int[] a = {0,1,2,3,4,5,6,7,8,9,10};
		System.out.println("Enter the order by which element should rotate");
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		
		k =k %10;
		
		rev(a,0,a.length-1);
		rev(a,0,k-1);
		rev(a,k,a.length-1);
		
		for(int x : a)
		{
			System.out.print(x+"\s");
		}
		sc.close();
	}
	
	static void rev(int[] a , int first , int last)
	{
		while(first<last)
		{
			int temp = a[first];
			a[first] = a[last];
			a[last] = temp;
			first++;
			last--;
		}
	}

}
