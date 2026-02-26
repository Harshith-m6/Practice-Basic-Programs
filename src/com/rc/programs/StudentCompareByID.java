package com.rc.programs;
import java.util.*;
public class StudentCompareByID implements Comparator<Stu>{

	@Override
	public int compare(Stu o1, Stu o2) {
		return o1.id.compareTo(o2.id);
	}

}
