package com.rc.programs;

public class Practice11 {
	public static void main(String[] args) {
		int a = 153;
		System.out.println(arm(a)==a?"armstrong":"not a armstrong");
	}
	static int arm(int a)
	{
		if(a==0)
			return 0;
		int d = a%10;
		return d*d*d+arm(a/10);
	}

}
