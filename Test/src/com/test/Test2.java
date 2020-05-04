package com.test;

import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Test2 {
	
	
	public static void main(String[] args){
		/*
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		list.add("f");
		list.add("g");
		
		list.forEach(a->{
			System.out.println(a);
		});
		System.out.println("-------这是一条华丽的分割线--------------");
		list.forEach(System.out::println);
		*/
		
		//HashMap<Student,Student>  map = new HashMap<>();
		
		/*
		Stream<Integer> stream = Stream.of(1,2,3,4,5,6);
 
		Stream<Integer> stream2 = Stream.iterate(0, (x) -> x + 2).limit(6);
		stream2.forEach(System.out::println); // 0 2 4 6 8 10
		
		System.out.println("这是一条java不归路，哇哈哈哈哈哈哈，叼飞起来");
		
		Stream<Double> stream3 = Stream.generate(Math::random).limit(2);
		stream3.forEach(System.out::println);
		*/
		
		String str = "a,b,c,d,e,a,a,b,b,b,r";
		Stream<String> strem = Pattern.compile(",").splitAsStream(str);
		strem.forEach(System.out::println);
		
		System.out.println("----------------------------------------");
		
		int number = (int)Pattern.compile(",").splitAsStream(str).filter(s -> s.equals("a")).count();
		System.out.println(number);
	}
}
