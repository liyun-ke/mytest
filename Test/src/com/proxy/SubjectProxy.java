package com.proxy;



//静态代理模式
public class SubjectProxy implements Subject { //代理角色
	
	//代理模式的作用是：为其他对象提供一种代理以控制对这个对象的访问。
	Subject subimpl = new RealSubject();
	@Override
	public void doSomething() {
		System.out.println("before"); //调用目标对象之前可以做相关操作
	    subimpl.doSomething();
	    System.out.println("after");//调用目标对象之后可以做相关操作

	}

}
