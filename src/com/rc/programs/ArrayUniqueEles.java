package com.rc.programs;

public class ArrayUniqueEles {
	public static void main(String[] args) {
		int[] ar= {1,2,3,1,2,3,4,5,6};
		for(int i=0; i<ar.length ; i++)
		{
			boolean found = false;
			for( int j =0 ; j<ar.length ; j++)
			{
				if(i!=j && ar[i]==ar[j])
				{
					found = true;
					break;
				}
			}
			if(!found)
			{
				System.out.println("Unique element "+ar[i]);
			}
		}
	}

}
