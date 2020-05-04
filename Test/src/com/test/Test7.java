package com.test;

import java.util.Comparator;
import java.util.function.Consumer;

public class Test6 {
		
	public static void main(String[] args){
		Runnable r2 = () -> System.out.println("hello lambda");
        r2.run();
        
    	Consumer<String> str= (x) -> System.out.println(x);
        str.accept("fsfsfd");
        
        Comparator<Integer> num = (x,y) ->{
        	System.out.println(x+y);
        	return Integer.compare(x, y);
        };
        num.compare(1, 2);
        System.out.println(num);
        
        System.out.println("--------------------------");
        
        Comparator<Integer> com = (x,y) -> Integer.compare(x, y);
        com.compare(2, 4);
        System.out.println(com.reversed());
	}
}
