package com.doume;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Liyun1 {
	
	
	public static void main(String[] args){
		/*
		String str1 = "abc";
		String str2 = "abc";
		
		String str3 = new String("abc");
		String str4 = new String("abc");
		
		String str5 = str1;
		
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		
		System.out.println(str1 == str5);
		System.out.println(str1.equals(str2));
		
		System.out.println(str3.equals(str3));
		System.out.println(str1.equals(str1));
		*/
		
		/*
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("启动一个线程！哈哈哈哈");
				
			}
		}).start();
		
		new Thread(() -> System.out.println("hhhh")).start();
		*/
		
		List<String> list = Arrays.asList("peter", "anna", "mike", "xenia");

		Collections.sort(list, new Comparator<String>(){

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
			
		});
	
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		
		System.out.println("--------------------华丽分割线---------------------------");
		
		
		Collections.sort(list, (String a, String b) -> b.compareTo(a));
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		
	}
}
