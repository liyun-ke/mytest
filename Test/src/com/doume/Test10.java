package com.doume;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Test10 {
	
	
	public static void main(String[] args){
		
		LinkedList<Integer> linked = new LinkedList<Integer>();
		
		//ArrayList<Integer> arrayList = new ArrayList<Integer>();
		linked.add(1);
		linked.add(3);
		linked.add(2);
		linked.add(4);
		/*
		Collections.reverse(linked);
		
		System.out.println("-----------开始---------------");
		
		for(int y=0;y<linked.size();y++){
			System.out.println(linked.get(y));
		}
		*/
		//System.out.println("-----------开始---------------");
		
		Iterator it = linked.descendingIterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		
		for(int i=0;i<linked.size();i++){
			for(int j=i+1;j<linked.size();j++){
					if(linked.get(i)<linked.get(j)){
					int templ = linked.get(i);
					linked.set(i, linked.get(j));
					linked.set(j,templ);
				}
			}
		}
		
		 
		System.out.println("-------------华丽分割线-------------------");
		
		for(int i=0;i<linked.size();i++){
			System.out.println(linked.get(i));
		}
	}
}
