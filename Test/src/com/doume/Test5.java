package com.doume;

public class Test5 {
	
	
	public static void main(String[] args){
		
		int number = 12;
		Test5.getNumber(number);
		System.out.println(number+"��number����ֵ�޸ĺ�");
		
		
		Student stu = new Student();
		stu.setAge(33);
		Test5.getStudent(stu);
		System.out.println(stu.getAge()+"��Student�����޸ĺ�");
	}
	
	public static void getNumber(int number){
		number = 100;
		System.out.println(number+":�������޸ĺ���");
	}
	
	public static void getStudent(Student stu){
		//stu = new Student();
		stu.setAge(1001);
		
		System.out.println(stu.getAge()+":�������޸Ľ��");
	}
}
