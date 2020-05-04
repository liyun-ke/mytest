package com.doume;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test13 {
	
	
	public static void main(String[] args){
		//Object[] ob = new Object[]{"1"};
		List<Object> arrayList = Arrays.asList(new Object[]{"1","4","6","8",
				"ab","c","d","a","10"});
		List<String> strList = new ArrayList<String>();
		for(int i=0;i<arrayList.size();i++){
			Pattern p = Pattern.compile(".*\\d+.*");
			String str = arrayList.get(i).toString();
		    Matcher m = p.matcher(str);
		    if (m.matches()) {
		    	Integer numVal = Integer.parseInt(str);
		        if(numVal%2 == 0){
		        	strList.add(numVal.toString());
		        }
		    }else{
		    	 byte[] byteAscii = str.getBytes();
		    }
		}
		
		for(int i=0;i<strList.size();i++){
			System.out.println(strList.get(i));
		}
		
	}
}
