package com.doume;

public class Liyun2 {
	
	public static void main(String[] args){
		
		/*
		String str = "java c# payth go php";
		
		String[] arrays = str.split(" ");
		StringBuilder bu = new StringBuilder();
		for(int i=arrays.length-1;i>=0;i--){
			if(i==0){
				bu.append(arrays[i]);
			}else{
				bu.append(arrays[i]);
				bu.append(" ");
			}
		}
		
		System.out.println(bu);
		*/
		
		/*
		String str = "abcdefghijk";
		String arrayStr = "";
		for(int i = str.length();i>=0;i--){
			arrayStr +=str.substring(i==0?0:i-1, i);
		}
		System.out.println(arrayStr);
		*/
		
		/*
		String str = "abcdefghijk";
		StringBuffer bf = new StringBuffer(str);
		bf.reverse();
		System.out.println(bf);
		*/
		
		String str = "abcdefghijk";
		StringBuilder bu = new StringBuilder();
		for(int i=str.length()-1;i>=0;i--){
			bu.append(str.charAt(i));
		}
		
		System.out.println(bu);
		
	}
	
}
