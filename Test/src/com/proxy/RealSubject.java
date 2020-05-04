package com.proxy;

public class RealSubject implements Subject {

	@Override
	public void doSomething() {   //真实角色对象
		System.out.println( "call doSomething()" );
	}

}
