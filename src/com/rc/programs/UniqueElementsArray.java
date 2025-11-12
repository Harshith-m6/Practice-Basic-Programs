package com.rc.programs;

public class UniqueElementsArray {
	public static void main(String[] args) {
		int[] ar = {1,1,2,3,4,5,5,6,7,6,2,9,9,8};
		for(int i = 0 ; i < ar.length ; i++)
		{
			boolean unique = true;
			for(int j =0 ; j < ar.length ; j++)
			{
				if(i!=j && ar[i]==ar[j])
				{
					unique = false;
					break;
				}
			}
			if(unique)
			{
				System.out.println(ar[i]+" is unique");
			}
		}
		
	}

}
