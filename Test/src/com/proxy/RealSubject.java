package com.proxy;

public class RealSubject implements Subject {

	@Override
	public void doSomething() {   //��ʵ��ɫ����
		System.out.println( "call doSomething()" );
	}

}
