package com.rc.programs;

public class Employe {
	
	private int id;
	private String name;
	private String dept;
	private double sal;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public Employe(int id, String name, String dept, double sal, int age) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.sal = sal;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employe [id=" + id + ", name=" + name + ", dept=" + dept + ", sal=" + sal + ", age=" + age + "]";
	}
	
	
	
	

}
