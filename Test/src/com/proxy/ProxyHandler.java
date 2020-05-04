package com.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;



//��̬����ģʽ
public class ProxyHandler implements InvocationHandler {
	
	private Object tar;
	
	//��ί�ж��󣬲����ش�����
	public Object bind(Object tar){
		this.tar = tar;
		//�󶨸���ʵ�ֵ����нӿڣ�ȡ�ô�����
		return Proxy.newProxyInstance(tar.getClass().getClassLoader(),
				tar.getClass().getInterfaces(), this);
	}
	
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		  Object result = null;//�����������ΪObject����
	        //����Ϳ��Խ�����ν��AOP�����
	        //�ڵ��þ��庯������ǰ��ִ�й��ܴ���
	        result = method.invoke(tar,args);
	        //�ڵ��þ��庯��������ִ�й��ܴ���
	        System.out.println("������invok��������������"+proxy.getClass().getName());
	        return result;
	}

}
