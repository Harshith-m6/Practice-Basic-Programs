package com.rc.programs;
import java.io.*;
public class FileHandling4 {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("C:\\Users\\harsh\\OneDrive\\Desktop\\FileHandling\\new.txt");
		int ch = fr.read();
		//read()  reads the data in the form of characters
		//Filoutputstream uses only byte stream
		//FileWriter uses character stream
		while(ch!=-1)
		{
			System.out.print((char)ch);
			ch=fr.read();
		}
		fr.close();
	}

}
