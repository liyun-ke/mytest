package com.doume;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;

public class Test7 {
	public static void main(String[] args){
		List<String> list = Test7.getStrList("123");
		System.out.println(StringUtils.join(list));
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}
	
	
	public static List<String> getStrList(String x){
		String[] strs = {"12","13","45","58","12","45"};
		List<String> listArray = new ArrayList<String>(Arrays.asList(strs));
		listArray.add(0,x);
		List<String> newList = new ArrayList<String>();
		Set<String> set = new HashSet<String>();
		for(int i = 0;i<listArray.size();i++){
			if(set.add(listArray.get(i))){
				newList.add(listArray.get(i));
			}
		}
		return newList;
	}
}
