package com.test;

public class Student {
	
	private int sid;
	
	private String sname;
	
	private String sex;
	
	private int age;
	
	private String sclass;
	
	private int snumber;
	
	public void setSid(int sid){
		this.sid = sid;
	}
	public int getSid(){
		return sid;
	}
	
	public void setSname(String sname){
		this.sname = sname;
	}
	public String getSname(){
		return sname;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}
	
	public void setSclass(String sclass){
		this.sclass = sclass;
	}
	public String getSclass(){
		return sclass;
	}
	
	public void setSnumber(int snumber){
		this.snumber = snumber;
	}
	public int getSnumber(){
		return snumber;
	}
}
