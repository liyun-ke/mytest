package com.test;

import java.awt.ItemSelectable;
import java.util.ArrayList;

public class Test1 {
	
	
	public static void main(String[] args){
		
		//�ַ�������
		/*
		String str = "13423432423432";
		//��һ��
		StringBuffer bu = new StringBuffer(str);
		bu.reverse();
		System.out.println(bu);
		
		System.out.println("------------------"+str.length()+"--------------------------------");
		*/
		//�ڶ���
		/*
		StringBuffer buff = new StringBuffer();
		for(int i=str.length();i>0;i--){
			buff.append(str.substring(i-1, i));
		}
		System.out.println(buff);
		
		//�鿴�ַ�����ĳ���ֳ��ֵĴ���
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
		/// һ���Ǳ���List���ϵķ�ʽ
		
		  // ��ǿforѭ������
		for(String str:arrayList){
			System.out.println(str);
		}
		
		System.out.println("----------����һ�������ķָ���-------------");
		 // ��ͨforѭ������
		for(int i=0;i<arrayList.size();i++){
			System.out.println(arrayList.get(i));
		}
		*/
		// Lambda ���ʽ������JDK 1.8��
		System.out.println("\n�����ֱ�����ʽ��Lambda ���ʽ���� List ����");
		arrayList.forEach(array ->{
			System.out.println(array);
		});
		
		// Lambda ���ʽ������JDK 1.8��
        System.out.println("\n�����ֱ�����ʽ��Lambda ���ʽ���� List ����");
        arrayList.forEach(System.out::println);
        
        
        System.out.println("-------------------------------------------------------------------");
        
        
        arrayList.stream().filter(a->a.equals("re7r")).forEach(a->{
        	System.out.println(a);
        });
        
	}
}
