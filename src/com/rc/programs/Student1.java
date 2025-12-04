package com.rc.programs;

import java.io.Serializable;

public class Student1 implements Serializable{
	
	private static final long serialVersionUID=1L;
	
	private int sid;
	private String sname;
	private transient double per;
	public Student1(int sid, String sname, double per) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.per = per;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public double getPer() {
		return per;
	}
	public void setPer(double per) {
		this.per = per;
	}
	@Override
	public String toString() {
		return "Student1 [sid=" + sid + ", sname=" + sname + ", per=" + per + "]";
	}
	
	

}
