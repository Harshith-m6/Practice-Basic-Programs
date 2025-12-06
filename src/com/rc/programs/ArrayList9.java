package com.rc.programs;
//check if arraylist is palindrome or not
import java.util.*;
public class ArrayList9 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,3,2,1));
		boolean isPalindrome = true;
		int left =0 , right = list.size()-1;
		while(left<right)
		{
			if(!list.get(left).equals(list.get(right)))
			{
				isPalindrome = false;
			}
			left++;
			right--;
		}
		
		System.out.println("Is Palindrome ? "+isPalindrome);
		
		
	}

}
