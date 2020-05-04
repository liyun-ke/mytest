package com.doume;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Domu1 {
	
	public static List<String> getStrList(String x){
		String str[] = {"22","24","23","23","22","123","45"};
		List<String> list = new ArrayList<String>(Arrays.asList(str));
		list.add(0,x);
		List<String> newList = new ArrayList<String>();
		Set<String> setStr = new HashSet<String>();
		for(int i=0;i<list.size();i++){
			if(setStr.add(list.get(i))){
				newList.add(list.get(i));
			}
		}
		
		return newList;
	}
	
	public static void main(String[] args){
		String x = "12";
		List<String> list = Domu1.getStrList(x);
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}
}
