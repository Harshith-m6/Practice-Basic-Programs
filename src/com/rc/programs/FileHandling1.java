package com.rc.programs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class FileHandling1 {
	
	//SequqnceInputStream is used add multiple files into a single file
	//reading content from multiple files and write into a single file
	public static void main(String[] args) throws IOException {
		Vector<FileInputStream> v = new Vector<FileInputStream>();
		//to pass Enumeration Object
		//Create Enumeration object using Elements
		FileOutputStream fout = new FileOutputStream("C:\\Users\\harsh\\OneDrive\\Desktop\\Alljava.doc");
		File f = new File("C:\\Users\\harsh\\OneDrive\\Desktop\\java");
		for(File f1 : f.listFiles())
		{
			if(f1.getName().endsWith(".java"))
			{
				v.add(new FileInputStream(f1));
			}
		}
		Enumeration enm = v.elements();
		SequenceInputStream sin = new SequenceInputStream(enm);
		int b = sin.read();
		while(b!=-1)
		{
			System.out.print((char)b);
			fout.write(b);
			b=sin.read();
		}
		fout.flush();
		fout.close();
		sin.close();
	}

}
