package com.proxy;

public class TestProxy {
	
	
	
	//运行静态代理
	public static void main(String[] args){
		
		Subject subj = new SubjectProxy();
		subj.doSomething();
	}
}
