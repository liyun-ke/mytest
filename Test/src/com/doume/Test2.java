package com.doume;

import org.apache.commons.lang3.StringUtils;

public class Test2 {
	
	
	public static void main(String[] args){
		
		//Apache Commons Lang��������java jdkֻ����
		String str = "abcd";
		//���Ը��ַ����ظ�����
		String repeated = StringUtils.repeat(str,4);
		System.out.println(repeated);
		
		//�����Ը��ַ���ĳ���ַ����ֵĴ���
		
		int count = StringUtils.countMatches("gsdgdsfgffffff","f");
		System.out.println(count);
		
		
		short s1 = 1;
				s1+=1; 
				System.out.println(s1);
	}
}
