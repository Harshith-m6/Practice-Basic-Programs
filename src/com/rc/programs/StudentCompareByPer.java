package com.rc.programs;

import java.util.Comparator;

public class StudentCompareByPer implements Comparator<Stu> {

	@Override
	public int compare(Stu o1, Stu o2) {
		return o1.per.compareTo(o2.per);
	}

}
