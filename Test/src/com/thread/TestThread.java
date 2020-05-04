package com.thread;

public class TestThread {
	
	
	public static void main(String[] args){
		
		//匿名 内部类
		Runnable reun = new Runnable(){
			@Override
			public void run() {
				System.out.println("运行线程");
			}
			
		};
		reun.run();
		
		
		Runnable ab = ()->System.out.println("1.8新特性开始");
		ab.run();
	}
}
