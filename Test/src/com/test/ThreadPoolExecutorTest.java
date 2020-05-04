package com.test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorTest implements Runnable{

	@Override
	public void run() {
		System.out.println("行程"+Thread.currentThread()+"开始运行");
		int i =10000*10000;
		while(i>0){
			i--;
		}
	}
	
	public static void main(String[] args){
		ThreadPoolExecutor thread = 
				new ThreadPoolExecutor(3, 6, 1, TimeUnit.MINUTES, new ArrayBlockingQueue<>(3));
		
		for(int i=0;i<20;i++){
			ThreadPoolExecutorTest thTest = new ThreadPoolExecutorTest();
			thread.submit(thTest);
		}
		
		
	}
	
}
