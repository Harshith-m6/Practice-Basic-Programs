package com.rc.programs;

public class ArrayFrequencyOfElements {
	public static void main(String[] args) {
		int[] ar= {1,2,3,1,2,3,1,2,3,4,5};
		for(int i = 0 ; i<ar.length ; i++)
		{
			boolean encountered = false;
			for(int k=0 ; k<i ; k++)
			{
				if(ar[k]==ar[i])
				{
					encountered = true;
					break;
				}
			}
			
			if(encountered)
				continue;
			int count =1;
			for(int j =i+1 ; j<ar.length ; j++)
			{
				if(ar[i]==ar[j])
				{
					count++;
				}
			}
			System.out.println(ar[i]+" present "+count+" times");
		}
	}

}
