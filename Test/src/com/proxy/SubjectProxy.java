package com.proxy;



//��̬����ģʽ
public class SubjectProxy implements Subject { //�����ɫ
	
	//����ģʽ�������ǣ�Ϊ���������ṩһ�ִ����Կ��ƶ��������ķ��ʡ�
	Subject subimpl = new RealSubject();
	@Override
	public void doSomething() {
		System.out.println("before"); //����Ŀ�����֮ǰ��������ز���
	    subimpl.doSomething();
	    System.out.println("after");//����Ŀ�����֮���������ز���

	}

}
