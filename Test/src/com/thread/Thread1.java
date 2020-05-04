package com.thread;

public class Thread1 extends Thread{
	
	private String name;
	
	public Thread1(String name){
		super(name);
		this.name = name;
	}
	
	/*
	public void run(){
		System.out.println(Thread.currentThread().getName()+"�߳̿�ʼ���У�����������");
		for(int i = 0;i<5;i++){
			System.out.println("���̣߳�"+"����"+i);
			try{
				sleep((int)Math.random()*10);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+"���н�����");
	}
	*/
	
	public void run(){
		System.out.println(Thread.currentThread().getName()+"�߳̿�ʼ���У�����������");
		synchronized (this) {
			for(int i = 0;i<5;i++){
				System.out.println("���̣߳�"+"����"+i);
				try{
					sleep((int)Math.random()*10);
				}catch(Exception e){
					e.printStackTrace();
				}
				
			}
			System.out.println(Thread.currentThread().getName()+"���н�����");
		}
	}
	
}
