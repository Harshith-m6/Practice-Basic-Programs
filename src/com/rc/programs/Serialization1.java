package com.rc.programs;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Serialization1 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		List<Student1> students = new ArrayList<Student1>();
		while(true)
		{
			System.out.println("enter the id , name and percentage");
			int id = sc.nextInt();
			String name = sc.next();
			double per = sc.nextDouble();
			
			Student1 std = new Student1(id , name , per);
			students.add(std);
			System.out.println("do you have more students");
			String str = sc.next();
			if(str.equalsIgnoreCase("no"))
			{
				break;
			}
			
		}
		
		//Serialization
		FileOutputStream fout = new FileOutputStream("C:\\Users\\harsh\\OneDrive\\Desktop\\Serialization\\Objects.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(students);
		System.out.println("Success");
		out.flush();
		fout.flush();
		out.close();
		fout.close();
		
		
		
	}

}
