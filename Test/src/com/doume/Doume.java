package com.doume;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class Doume {
	
	
	
	public static void main(String[] args){
		
		/*List<String> list = new ArrayList<String>();
		list.add("����");
		list.add("����");
		list.add("����");
		list.add("����");
		list.add("����");
		list.add("����");
		
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
		
		
		//��һ��ѭ��map��key-value
		Iterator<Map.Entry<String, String>> iter = map.entrySet().iterator();
		while(iter.hasNext()){
			Map.Entry<String, String> ent = iter.next();
			System.out.println("��һ��ѭ����Key = " + ent.getKey() + " value = " +ent.getValue());
		}
		
		//�ڶ���ѭ��map:key-value
		for(Map.Entry<String, String> set : map.entrySet()){
			System.out.println("�ڶ���ѭ����KEY = " + set.getKey() + " VALUE = " +set.getValue());
		}
		
		//������ѭ��map:key
		for(String key : map.keySet()){
			System.out.println("������ѭ����KEY = " + key);
		}
		
		//������ѭ��map:value
		for(String val : map.values()){
			System.out.println("������ѭ����VALUE = " + val);
		}
		
		/**
		 * 
		 * java ������������:
		 *   byte int long double char float short boolean
		 *   
		 * jsp ���ö���
		 * 
		 * out session application request response config page pageContext Exception
		 * 
		 * 
		 * java ���η�:
		 * 
		 *   ���η�                             ��ǰ��                            ͬһpackage            ������                                ����package
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
		 *  final ������������ �ࡢ���������ԣ��ֱ��ʾ�಻�ܼ̳С�����������д�����Բ��ܱ�
		 *  
		 *  static ��̬�� �������η��������ԣ���static���ε����Ժͷ��������࣬����������ֱ�ӷ��ʣ�����֮�乲��
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		
		Date date1 = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");//��ʼ��Formatter��ת����ʽ��  
		String hms1 = formatter.format(date1.getTime());
		System.out.println("����ʼʱ��:"+hms1);
		
		
		
		
		Date date2 = new Date();
		String hms2 = formatter.format(date2.getTime());
		System.out.println("�������ʱ��:"+hms2);
		
	}
}
