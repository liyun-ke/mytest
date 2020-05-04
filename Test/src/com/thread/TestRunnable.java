package com.thread;

public class TestRunnable implements Runnable{
	private String name;
	//AtomicInteger atomec = new AtomicInteger(0);
	public TestRunnable(String name){
		this.name = name;
	}
	volatile int number = 0;
	@Override
	public void run() {
		//synchronized (this){
				number = number+1;
				System.out.println(name + "ÔËÐÐ  :  " + number);
			//}
		}

}
