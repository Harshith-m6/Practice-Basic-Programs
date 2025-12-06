package com.rc.programs;
import java.io.*;
import java.util.*;
public class Filehandling6 {
	
	public static void main(String[] args) throws IOException {
		// create a folder object
		File folder = new File("C:\\Users\\harsh\\OneDrive\\Desktop\\FileHandling\\Practice");
		//creates a filoutputstream object to  a file
		FileOutputStream fout = new FileOutputStream("C:\\Users\\harsh\\OneDrive\\Desktop\\FileHandling\\Practice\\AllInOne.txt");
		//creates a vector (collection) of fileinputstream objects
		Vector<FileInputStream> vector = new Vector<FileInputStream>();
		
		for(File f : folder.listFiles())
		{
			if(f.getName().endsWith(".txt"))
			{
				//adds each file that ends with .txt to the vector
				vector.add(new FileInputStream(f));
			}
		}
		
		//converting the objects in vector to enumeration so that can iterate
		Enumeration<FileInputStream> e = vector.elements();
		
		//converts multiple objects into single sequence of objects
		SequenceInputStream seq = new SequenceInputStream(e);
		
		//reads the bytes from sequenceinputstream 
		int data = seq.read();
		
		//traverse till the end of the file
		while(data!=-1)
		{
			System.out.print((char)data);
			//writing each byte into the fileoutputstream object
			fout.write(data);
			//reads next byte
			data = seq.read();
		}
		System.out.println("Successfully written");
	}

}
