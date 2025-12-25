package com.rc.programs;

public class Practice26 {
	//left perpendicular triangle
	public static void main(String[] args) {
		int n = 5;
		for(int i = 1 ; i<=n ; i++)
		{
			for(int j = 1 ; j<=n-i ; j++)
			{
				System.out.print("   ");
			}
			for(int k = 1 ; k<=i ; k++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
		
		System.out.println("\n");
		
		int x = 5;
		
		//inverted left perpendicular triangle
		
		for(int i = 1 ; i<=n ; i++)
		{
			for(int j = 1 ; j<=n-i+1 ; j++)
			{
				System.out.print(" * ");
			}
			for(int k = 1 ; k<i ; k++)
			{
				System.out.print("   ");
			}
			
			System.out.println();
		}
		
		System.out.println("\n");
		
		//diamond
		
		for(int i = 1 ; i<= n ; i++)
		{
			for(int j = 1 ; j<=n-i ; j ++)
			{
				System.out.print(" ");
			}
			for(int k = 1 ; k<=i ; k++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
		
		for(int i = n-1 ; i>=1 ; i-- )
		{
			for(int j = 1 ; j<=n-i ; j ++)
			{
				System.out.print(" ");
			}
			for(int k = 1 ; k<=i ; k++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
		
		
	}

}
