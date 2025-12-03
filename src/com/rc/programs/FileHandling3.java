package com.rc.programs;
import java.io.*;
public class FileHandling3 {
	public static void main(String[] args) throws Exception {
		String str = "Rama and Laxmana ";
		FileWriter fw = new FileWriter("C:\\Users\\harsh\\OneDrive\\Desktop\\FileHandling\\MyFileWriter.txt");
		fw.write(str);
		//writing into the stream by character stream
		//FileWriter is a character stream data
		
		System.out.println("Success");
		fw.flush();
		fw.close();
	}

}
