package com.doume;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class Doume {
	
	
	
	public static void main(String[] args){
		
		/*List<String> list = new ArrayList<String>();
		list.add("胖子");
		list.add("胖子");
		list.add("胖子");
		list.add("胖子");
		list.add("胖子");
		list.add("胖子");
		
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}*/
		
		
		Map<String,String> map = new HashMap<String,String>();
		map.put("1", "123654");
		map.put("2", "123654");
		map.put("3", "123654");
		map.put("4", "123654");
		map.put("5", "123654");
		map.put("6", "123654");
		map.put("7", "123654");
		map.put("8", "123654");
		
		
		//第一种循环map：key-value
		Iterator<Map.Entry<String, String>> iter = map.entrySet().iterator();
		while(iter.hasNext()){
			Map.Entry<String, String> ent = iter.next();
			System.out.println("第一种循环：Key = " + ent.getKey() + " value = " +ent.getValue());
		}
		
		//第二种循环map:key-value
		for(Map.Entry<String, String> set : map.entrySet()){
			System.out.println("第二种循环：KEY = " + set.getKey() + " VALUE = " +set.getValue());
		}
		
		//第三种循环map:key
		for(String key : map.keySet()){
			System.out.println("第三种循环：KEY = " + key);
		}
		
		//第四种循环map:value
		for(String val : map.values()){
			System.out.println("第四种循环：VALUE = " + val);
		}
		
		/**
		 * 
		 * java 基本类型如下:
		 *   byte int long double char float short boolean
		 *   
		 * jsp 内置对象：
		 * 
		 * out session application request response config page pageContext Exception
		 * 
		 * 
		 * java 修饰符:
		 * 
		 *   修饰符                             当前类                            同一package            子孙类                                其他package
		 *   
		 *   public           Y               Y						Y				Y
		 *   
		 *   protected		  Y               Y                     Y               N
		 *   
		 *   default		  Y				  Y						N				N
		 *   
		 *   private          Y				  N						N				N
		 *   
		 *   
		 *   
		 * 
		 * 
		 * 
		 *   try{
		 *   
		 *   
		 *   }catch(Exception e){
		 *   
		 *   }finally{
		 *   
		 *   }
		 *   
		 *   
		 *   
		 *  final 可以用来修饰 类、方法、属性：分别表示类不能继承、方法不能重写、属性不能变
		 *  
		 *  static 静态的 用来修饰方法和属性，被static修饰的属性和方法属于类，可以用类名直接访问，对象之间共享
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		
		Date date1 = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");//初始化Formatter的转换格式。  
		String hms1 = formatter.format(date1.getTime());
		System.out.println("程序开始时间:"+hms1);
		
		
		
		
		Date date2 = new Date();
		String hms2 = formatter.format(date2.getTime());
		System.out.println("程序结束时间:"+hms2);
		
	}
}
