package com.thread;

public class TestThreadMain {
	
	
	public static void main(String[] args){
		
		System.out.println(Thread.currentThread().getName()+"���߳̿�ʼִ�У�����������");
		
		Thread1 th1 = new Thread1("A");
		Thread1 th2 = new Thread1("B");
		
		th1.start();
		th2.start();
		
		//join()�ȴ��߳̽��������磺main����Ҳ���߳������̣߳��п������߳�û�����߳�ִ�н���
		//�ͽ����ˣ�������߳���Ҫ�ȴ����߳�ִ�н�����ȡ��������ô����join()�����ȴ��߳̽����ڣ��������߳�
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
		
		System.out.println(Thread.currentThread().getName()+"���߳�ִ�н���������������");
	}
	
}
