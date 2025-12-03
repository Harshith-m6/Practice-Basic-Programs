package com.rc.programs;
import java.io.*;
public class FileHandling2 {
	//To read how many lines of code present in the file
	public static void main(String[] args) throws IOException {
		FileInputStream fin = new FileInputStream("C:\\Users\\harsh\\OneDrive\\Desktop\\FileHandling\\new.txt");
		int b = fin.read();
		int count=0;
		while(b!=-1)
		{
			if(b=='\n')
			{
				count++;
			}
			b = fin.read();
		}
		
		System.out.println(count);
	}

}
