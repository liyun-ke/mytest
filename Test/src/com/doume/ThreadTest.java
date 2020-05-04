package com.doume;

public class ThreadTest extends Thread {
	public void run(){
		System.out.println("In run");
		yield();
		System.out.println("Leaving run");
	}
	
	public static void main(String[] args){
		(new ThreadTest()).start();
	}
}
