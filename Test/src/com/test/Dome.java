package com.test;

public class Dome {
	
	private int id;
	private String name;
	private String sex;
	private double age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public double getAge() {
		return age;
	}
	public void setAge(double age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Dome [id=" + id + ", name=" + name + ", sex=" + sex + ", age=" + age + "]";
	}
	public Dome(int id, String name, String sex, double age) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	
	
	
}
