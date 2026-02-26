package com.rc.programs;
import java.util.*;
public class StudentCompareByName implements Comparator<Stu>{

	@Override
	public int compare(Stu o1 , Stu o2) {
		return o1.name.compareTo(o2.name);
	}

}
