package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test3 {
	
	List<String> ipList = new ArrayList<String>(10);
	
	public static void main(String[] args){
		
		// 假如调用接口，接口每次返回Ip地址，存入数组中，数组大小是10，只有出现同一个Ip地址有
		// 5个就打印出来某个Ip地址加次数
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
					System.out.println("IP地址："+mapent.getKey()+"出现："+mapent.getValue()+"次");
				}else{
					System.out.println("没出现5次重复的数据");
				}
			}
		}
  }
}
