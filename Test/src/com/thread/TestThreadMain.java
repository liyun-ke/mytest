package com.thread;

public class TestThreadMain {
	
	
	public static void main(String[] args){
		
		System.out.println(Thread.currentThread().getName()+"主线程开始执行！哈哈哈哈！");
		
		Thread1 th1 = new Thread1("A");
		Thread1 th2 = new Thread1("B");
		
		th1.start();
		th2.start();
		
		//join()等待线程结束，例如：main方法也是线程是主线程，有可能主线程没等子线程执行结束
		//就结束了，如果主线程需要等待子线程执行结束获取东西，那么就用join()方法等待线程结束在，结束主线程
		try{
			th1.join();
		}catch(Exception e){
			e.printStackTrace();
		}
		try{
			th2.join();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName()+"主线程执行结束！哈哈哈哈！");
	}
	
}
