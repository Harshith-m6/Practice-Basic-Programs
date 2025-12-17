package com.rc.programs;

import java.util.Comparator;
import java.util.List;
import java.util.*;
import java.util.stream.Collectors;

public class StreamApiNonPrimitive4 {
	
	public static void main(String[] args) {
		List<Employe> emplist = List.of(new Employe(111,"Harshith","IT",100000.0,23),new Employe(101,"Harshi","IT",10000.0,23),
				new Employe(102,"Pavan","IT",150000.0,21),new Employe(103,"Kushi","HR",50000.0,20),new Employe(104,"Abhi","HR",80000.0,24),new Employe(105,"Moni","IT",90000.0,25));
		
		
		//to print youngest Employee
		Employe young = emplist.stream().min(Comparator.comparing(Employe::getAge)).get();
		System.out.println(young);
		
		emplist.stream().sorted(Comparator.comparing(Employe::getName)).forEach(System.out::println);
		
		//department wise maximum salary
		
		Map<String , Optional<Employe>> deptMax = emplist.stream().collect(Collectors.groupingBy(Employe::getDept,Collectors.maxBy(Comparator.comparing(Employe::getSal))));
		
		deptMax.forEach((k,v)->System.out.println(k+" : "+v.get()));
		
		
	}

}
