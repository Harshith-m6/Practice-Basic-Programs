package com.rc.programs;
import java.util.*;
public class LengthComparator implements Comparator<String> {
	@Override
	public int compare(String o1, String o2) {
		
		return Integer.compare(o1.length(), o2.length());
	}

}
