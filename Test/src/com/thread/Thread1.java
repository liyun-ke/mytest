package com.thread;

public class Thread1 extends Thread{
	
	private String name;
	
	public Thread1(String name){
		super(name);
		this.name = name;
	}
	
	/*
	public void run(){
		System.out.println(Thread.currentThread().getName()+"线程开始运行！哈哈哈哈哈");
		for(int i = 0;i<5;i++){
			System.out.println("子线程："+"运行"+i);
			try{
				sleep((int)Math.random()*10);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+"运行结束！");
	}
	*/
	
	public void run(){
		System.out.println(Thread.currentThread().getName()+"线程开始运行！哈哈哈哈哈");
		synchronized (this) {
			for(int i = 0;i<5;i++){
				System.out.println("子线程："+"运行"+i);
				try{
					sleep((int)Math.random()*10);
				}catch(Exception e){
					e.printStackTrace();
				}
				
			}
			System.out.println(Thread.currentThread().getName()+"运行结束！");
		}
	}
	
}
