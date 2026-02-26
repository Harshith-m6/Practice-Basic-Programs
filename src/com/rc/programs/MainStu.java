package com.rc.programs;
import java.util.*;
public class MainStu {
	public static void main(String[] args) {
		Stu s1 = new Stu(9,"Prajju",99.9);
		Stu s2 = new Stu(6,"Harshith",100.0);
		Stu s3 = new Stu(1,"Abhi",88.00);
		Stu s4 = new Stu(2,"Pavan",90.0);
		
		List<Stu> stuList = Arrays.asList(s1,s2,s3,s4);
		
		Comparator<Stu> per = new StudentCompareByPer();
		Collections.sort(stuList, per);
		System.out.println(stuList);
		
		Comparator<Stu> name = new StudentCompareByName();
		Collections.sort(stuList,name);
		System.out.println(stuList);
		
		Comparator<Stu> id = new StudentCompareByID();
		Collections.sort(stuList, id);
		System.out.println(stuList);
	}

}
