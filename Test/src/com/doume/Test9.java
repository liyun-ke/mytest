package com.doume;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Test9 {
	
	public static void main(String[] args){
		Map<String,String> map = new HashMap<String,String>();
		map.put("1", "2");
		map.put("2", "2");
		map.put("3", "2");
		map.put("4", "2");
		
		map.put(null, null);
		
		System.out.println(map.size());
		
		//��һ��
		for(Map.Entry<String, String> maps : map.entrySet()){
			System.out.println(maps.getKey()+"----"+maps.getValue());
		}
		
		//�ڶ���
        Iterator<Entry<String, String>> ite = map.entrySet().iterator();
        while(ite.hasNext()){
        	Entry<String,String> en = ite.next();
        	System.out.println(en);
        }
	}
}
