package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test3 {
	
	List<String> ipList = new ArrayList<String>(10);
	
	public static void main(String[] args){
		
		// ������ýӿڣ��ӿ�ÿ�η���Ip��ַ�����������У������С��10��ֻ�г���ͬһ��Ip��ַ��
		// 5���ʹ�ӡ����ĳ��Ip��ַ�Ӵ���
		Test3 test = new Test3();
		for(int i=0;i<4;i++){
			test.getIpCount("11.55.55");
		}
		for(int i=0;i<6;i++){
			test.getIpCount("161.5665.355");
		}
	}
	
	
	public  void getIpCount(String ipAdder){
		//String[] ipArray = new String[10];
		//String[] ipArray = new String[]{"12","3"};
		//String ipArray[] = {"1","yyy"};
		if(ipList.size()>10){
			ipList.remove(0);
		}
		ipList.add(ipAdder);
		if(ipList.size()==10){
			Map<String, Long> map = ipList.stream().collect(Collectors.groupingBy(x->x.toString(),Collectors.counting()));
			for(Map.Entry<String, Long> mapent: map.entrySet()){
				if(mapent.getValue()>=5){
					System.out.println("IP��ַ��"+mapent.getKey()+"���֣�"+mapent.getValue()+"��");
				}else{
					System.out.println("û����5���ظ�������");
				}
			}
		}
  }
}
