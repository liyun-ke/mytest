package com.doume;

public class Test11 extends Test{
	
	static{
		System.out.println("ÎÒÊÇstatic---Test11");
	}
	
	public Test11(){
		System.out.println("test11");
	}
	
	public void getTest11(){
		System.out.println("GetTest11");
	}
	
	
	public static void main(String[] args){
		Test11 test1 = new Test11();
		test1.getTest();
		
		Test11 test2 = new Test11();
		test2.getTest();
		
	}
	
}
