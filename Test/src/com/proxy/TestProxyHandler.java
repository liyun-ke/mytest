package com.proxy;

public class TestProxyHandler {
	
	public static void main(String[] args){
		ProxyHandler prox = new ProxyHandler();
		//�󶨸���ʵ�ֵ����нӿ�
		Subject sub = (Subject) prox.bind(new RealSubject());
        sub.doSomething();
	}
	
}
