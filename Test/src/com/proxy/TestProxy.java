package com.proxy;

public class TestProxy {
	
	
	
	//���о�̬����
	public static void main(String[] args){
		
		Subject subj = new SubjectProxy();
		subj.doSomething();
	}
}
