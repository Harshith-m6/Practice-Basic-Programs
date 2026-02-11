package com.rc.programs;

public class StringReverseWordsInSentence {
	public static void main(String[] args) {
		String sent = "i love java";
		String[] words = sent.split(" ");
		StringBuilder reSb = new StringBuilder();
		for(String word : words)
		{
			StringBuilder sb = new StringBuilder();
			for(int i=word.length()-1 ; i>=0;i--)
			{
				sb.append(word.charAt(i));
			}
			reSb.append(sb).append(" ");
			
		}
		
		System.out.println(reSb.toString().trim());
	}

}
