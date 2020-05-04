package com.test;

import java.awt.ItemSelectable;
import java.util.ArrayList;

public class Test1 {
	
	
	public static void main(String[] args){
		
		//字符串倒序
		/*
		String str = "13423432423432";
		//第一种
		StringBuffer bu = new StringBuffer(str);
		bu.reverse();
		System.out.println(bu);
		
		System.out.println("------------------"+str.length()+"--------------------------------");
		*/
		//第二种
		/*
		StringBuffer buff = new StringBuffer();
		for(int i=str.length();i>0;i--){
			buff.append(str.substring(i-1, i));
		}
		System.out.println(buff);
		
		//查看字符串中某个字出现的次数
		System.out.println(StringUtils.countMatches(str, "3"));
		*/
		/*
		String ing = "java c# php javascrpion yyy 777 000 uuuuuuuu u u u u u u u u u 88 09090";
		String strArray[] = ing.split(" ");
		StringBuffer buffer = new StringBuffer();
		for(int i = strArray.length-1;i>=0;i--){
			if(i==0){
				buffer.append(strArray[i]);
			}else{
				buffer.append(strArray[i]+" ");
			}
		}
		
		System.out.println(buffer);
		*/
		
		
		/*
		List<String> list =Arrays.asList("aaa","fsa","ser","eere");
		Collections.sort(list,(a,b)->b.compareTo(a));
		for(String stri:list){
			System.out.println(stri);
		}
		*/
		
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("rerqqqq");
		arrayList.add("rertttt");
		arrayList.add("rer555");
		arrayList.add("re7r");
		arrayList.add("reooor");
		arrayList.add("rer9opl");
		arrayList.add("rerwww");
		arrayList.add("rerrtfg");
		arrayList.add("rer54444");
		
		/*
		/// 一下是遍历List集合的方式
		
		  // 增强for循环遍历
		for(String str:arrayList){
			System.out.println(str);
		}
		
		System.out.println("----------这是一条华丽的分割线-------------");
		 // 普通for循环遍历
		for(int i=0;i<arrayList.size();i++){
			System.out.println(arrayList.get(i));
		}
		*/
		// Lambda 表达式遍历（JDK 1.8）
		System.out.println("\n第三种遍历方式：Lambda 表达式遍历 List 集合");
		arrayList.forEach(array ->{
			System.out.println(array);
		});
		
		// Lambda 表达式遍历（JDK 1.8）
        System.out.println("\n第四种遍历方式：Lambda 表达式遍历 List 集合");
        arrayList.forEach(System.out::println);
        
        
        System.out.println("-------------------------------------------------------------------");
        
        
        arrayList.stream().filter(a->a.equals("re7r")).forEach(a->{
        	System.out.println(a);
        });
        
	}
}
