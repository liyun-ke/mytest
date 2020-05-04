package com.test;

import java.util.Comparator;
import java.util.function.Consumer;

public class TestLamdba {

	
	public void test1(){
	    int number = 0;
		Runnable run = new Runnable(){
			public void run(){
				System.out.println("匿名内部类！！！！"+number);
			}
		};
		run.run();
		
		System.out.println("----------------------------");
		
		Runnable ru = ()->System.out.println("这是Lamdba！！"+number);
		ru.run();
	}
	
	public static void main(String[] args){
		TestLamdba test = new TestLamdba();
		test.test1();
		
		
		Consumer<String> com = (x) -> System.out.println(x);
		com.accept("4444444444");
		
		System.out.println("----------------------------");
		
		Comparator<Integer> cp = (x,y)->{
			return Integer.compare(x, y);
		};
		//cp.compare(11, 55);
		System.out.println(cp);
	}
}
