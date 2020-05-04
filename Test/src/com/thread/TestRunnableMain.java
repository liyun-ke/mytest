package com.thread;

public class TestRunnableMain {
	
	public static void main(String[] args){
		
		
		Thread th1 = new Thread(new TestRunnable("a"));
		Thread th2 = new Thread(new TestRunnable("b"));
		Thread th3 = new Thread(new TestRunnable("c"));
		Thread th4 = new Thread(new TestRunnable("d"));
		Thread th5 = new Thread(new TestRunnable("e"));
		Thread th6 = new Thread(new TestRunnable("f"));
		Thread th7 = new Thread(new TestRunnable("g"));
		
		th1.start();
		th2.start();
		th3.start();
		th4.start();
		th5.start();
		th6.start();
		th7.start();
		
		
		
	}
}
