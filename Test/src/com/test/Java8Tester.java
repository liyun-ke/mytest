package com.test;

import impl.MyLamda;
import impl.Sumable;

public class Java8Tester {
	
	public static void main(String[] args){
		
		test1(() -> System.out.println("ss"));
		
		int sumber = sum(123,22,(a,b)->a+b);
		System.out.println(sumber);
	}
	
	public static void test1(MyLamda myLamda){
		myLamda.test1();
	}
	
	public static int sum(int a,int b,Sumable sum){
		return sum.sum(a, b);
	}
}
