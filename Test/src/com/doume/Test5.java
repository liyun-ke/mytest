package com.doume;

public class Test5 {
	
	
	public static void main(String[] args){
		
		int number = 12;
		Test5.getNumber(number);
		System.out.println(number+"：number变量值修改后");
		
		
		Student stu = new Student();
		stu.setAge(33);
		Test5.getStudent(stu);
		System.out.println(stu.getAge()+"：Student对象修改后");
	}
	
	public static void getNumber(int number){
		number = 100;
		System.out.println(number+":方法内修改后结果");
	}
	
	public static void getStudent(Student stu){
		//stu = new Student();
		stu.setAge(1001);
		
		System.out.println(stu.getAge()+":方法内修改结果");
	}
}
