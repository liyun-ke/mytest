package com.doume;

import org.apache.commons.lang3.StringUtils;

public class Test2 {
	
	
	public static void main(String[] args){
		
		//Apache Commons Lang包，不是java jdk只带的
		String str = "abcd";
		//将以个字符串重复几次
		String repeated = StringUtils.repeat(str,4);
		System.out.println(repeated);
		
		//计算以个字符串某个字符出现的次数
		
		int count = StringUtils.countMatches("gsdgdsfgffffff","f");
		System.out.println(count);
		
		
		short s1 = 1;
				s1+=1; 
				System.out.println(s1);
	}
}
