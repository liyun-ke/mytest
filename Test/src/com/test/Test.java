package com.test;

public class Test implements Runnable{
	
	private String name;
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	
	public Test(String name){
		this.name = name;
	}
	
	
	public void run(){
		
		for(int i=0;i<=1000;i++){
			System.out.println(name+"��"+i+"��");
		}
	}
	
	public static void main(String[] args){
		//ʵ��һ���ӿ�Runneabl ���߼̳�Thread�࣬�Ŀ���ʵ��java���߳�
		//java���̣߳��ڷֲ�ʽ�߲������ʵ��������Ч
		Thread thread1 = new Thread( new Test("����"));
		
		Thread thread2 = new Thread( new Test("����"));
		
		thread1.start();
		thread2.start();
		
	}
}
