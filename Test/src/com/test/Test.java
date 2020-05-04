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
			System.out.println(name+"第"+i+"次");
		}
	}
	
	public static void main(String[] args){
		//实现一个接口Runneabl 或者继承Thread类，的可以实现java多线程
		//java多线程，在分布式高并发访问的情况下无效
		Thread thread1 = new Thread( new Test("李四"));
		
		Thread thread2 = new Thread( new Test("张三"));
		
		thread1.start();
		thread2.start();
		
	}
}
