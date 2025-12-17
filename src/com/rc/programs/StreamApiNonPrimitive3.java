package com.rc.programs;

import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiNonPrimitive3 {
	public static void main(String[] args) {
		List<Employe> emplist = List.of(new Employe(111,"Harshith","IT",100000.0,23),new Employe(101,"Harshi","IT",10000.0,23),
				new Employe(102,"Pavan","IT",150000.0,21),new Employe(103,"Kushi","HR",50000.0,20),new Employe(104,"Abhi","HR",80000.0,24),new Employe(105,"Moni","IT",90000.0,25));
		
		//partitioning the employees into sal greater than 120000 and less than 120000
		
		Map<Boolean , List<Employe>> partition = emplist.stream().collect(Collectors.partitioningBy(e->e.getSal()>120000));
		
		partition.forEach((k,v)->System.out.println(k+" : "+v));
		
		emplist.stream().collect(Collectors.partitioningBy(e->e.getSal()>12000)).forEach((k,v)->System.out.println(k+" : "+v));
		
		//forEach present in map (collection) also and stream also
		
		
		
	}

}
