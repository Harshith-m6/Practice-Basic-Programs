package com.rc.programs;

public class ArrayFrequencyLogic {
	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5,1,2,3,6};
		
		for(int i =0 ; i<a.length;i++)
		{
			boolean counted = false;
			for(int k =0 ; k<i;k++)
			{
				if(a[i]==a[k])
				{
					counted = true;
					break;
				}
			}
			
			if(!counted)
			{
				int count =0;
				for(int j=0 ; j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						count++;
					}
				}
				System.out.println(a[i]+" present "+count+" times");
			}
		}
	}

}
