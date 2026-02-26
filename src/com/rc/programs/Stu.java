package com.rc.programs;

public class Stu {
	Integer id;
	String name;
	Double per;
	public Stu(Integer id, String name, Double per) {
		this.id = id;
		this.name = name;
		this.per = per;
	}
	@Override
	public String toString() {
		return "Student Object \nid=" + id + "\n name=" + name + "\n per=" + per;
	}
	
	
}
