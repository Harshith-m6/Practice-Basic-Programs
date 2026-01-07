package com.rc.programs;

public class ArrayFreq {
	public static void main(String[] args) {
		int[] ar= {1,2,3,1,2,3,4,5,4,5,6,7,8};
		for(int i=0 ; i<ar.length ; i++)
		{
			boolean enc = false;
			for(int k =0 ; k<i ; k++)
			{
				if(ar[i]==ar[k])
				{
					enc = true;
					break;
				}
			}
			if(enc)
				continue;
			int count =0;
			for(int j =0 ; j<ar.length ; j++)
			{
				if(ar[j]==ar[i])
				{
					count++;
				}
			}
			System.out.println(ar[i]+" present "+count+" times");
		}
	}

}
