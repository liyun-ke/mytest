package com.thread;

public class TestThread {
	
	
	public static void main(String[] args){
		
		//���� �ڲ���
		Runnable reun = new Runnable(){
			@Override
			public void run() {
				System.out.println("�����߳�");
			}
			
		};
		reun.run();
		
		
		Runnable ab = ()->System.out.println("1.8�����Կ�ʼ");
		ab.run();
	}
}
