package com.doume;

import java.util.ArrayList;
import java.util.List;

public class Test8 {
	
	public static void main(String[] args){
		List<User> userList = new ArrayList<User>();
		User user1 = new User();
		user1.setName("aaa");
		user1.setAge("2");
		user1.setSex("ÄÐ");
		
		User user2 = new User();
		user2.setName("bbb");
		user2.setAge("3");
		user2.setSex("ÄÐ");
		
		User user3 = new User();
		user3.setName("ccc");
		user3.setAge("4");
		user3.setSex("ÄÐ");
		
		User user4 = new User();
		user4.setName("ddd");
		user4.setAge("5");
		user4.setSex("ÄÐ");
		
		User user5 = new User();
		user5.setName("eee");
		user5.setAge("6");
		user5.setSex("ÄÐ");
		
		userList.add(user1);
		userList.add(user2);
		userList.add(user3);
		userList.add(user4);
		userList.add(user5);
		
		
		String strAge[] = {"3","5","4","2","6"};
		
		 List<User> list = Test8.getUserList(userList, strAge);
		 for(int i=0;i<list.size();i++){
			 System.out.println(list.get(i).getAge());
		 }
	}
	
	
	public static List<User> getUserList(List<User> userList,String[] strAge){
		List<User> newUserList = new ArrayList<User>();
		for(int i=0;i<strAge.length;i++){
			for(int j=0;j<userList.size();j++){
				if(strAge[i].equals(userList.get(j).getAge())){
					newUserList.add(userList.get(j));
				}
				
			}
		}
		return newUserList;
	}
}
