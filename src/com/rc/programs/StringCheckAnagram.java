package com.rc.programs;

public class StringCheckAnagram {
	public static void main(String[] args) {
		String str1 = "listen";
		char[] ch1 = str1.toCharArray();
		String str2 = "silent";
		boolean ana = true;
		
		for(char c : ch1)
		{
			if(str2.indexOf(String.valueOf(c))==-1)
			{
				ana=false;
			}
		}
		
		System.out.println(ana?"True ":"False");
	}

}
