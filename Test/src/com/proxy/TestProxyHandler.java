package com.proxy;

public class TestProxyHandler {
	
	public static void main(String[] args){
		ProxyHandler prox = new ProxyHandler();
		//绑定该类实现的所有接口
		Subject sub = (Subject) prox.bind(new RealSubject());
        sub.doSomething();
	}
	
}
