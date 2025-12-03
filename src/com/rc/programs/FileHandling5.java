package com.rc.programs;
import java.io.*;
public class FileHandling5 {
	public static void main(String[] args) throws IOException {
		String str = "Rama and Laxmana are brothers";
		FileOutputStream fout = new FileOutputStream("C:\\Users\\harsh\\OneDrive\\Desktop\\FileHandling\\RamaLaxmana.txt");
		//Specifying the file where to write the data if not present it will be created
		byte[] b = str.getBytes(); // method in the string that converts string to byte array
		fout.write(b); // writes the bytes into the specified stream
		fout.flush(); // flush all the bytes in the stream
		fout.close(); // closes the resources (closes the stream)
		System.out.println("Success");
		
	}

}
