package com.rc.programs;

import java.util.Arrays;

public class ArrayRemoveDuplicates3 {
	public static void main(String[] args) {
		int[] a= {1,6,7,6,7,1,1,2,2,2,3,4,5,1,2,3,};
		int[] temp = new int[a.length];
		int index = 0;
		
		for(int i =0 ; i< a.length; i++)
		{
			boolean found = false;
			for(int j=0 ; j<index;j++)
			{
				if(a[i]==temp[j])
				{
					found = true;
					break;
				}
			}
			if(!found)
			{
				temp[index]=a[i];
				index++;
			}
		}
		
		int[] result = Arrays.copyOf(temp, index);
		for(int x : result)
		{
			System.out.print(x+"\s");
		}
	}

}
