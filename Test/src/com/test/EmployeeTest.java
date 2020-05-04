package com.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeTest {
	public static void main(String[] args){
		Employee e1 = new Employee(7369, "SMITH", 800, 20);
		Employee e2 = new Employee(7499, "ALLEN", 1600, 30);
		Employee e3 = new Employee(7521, "WARD", 1250, 30);
		Employee e4 = new Employee(7782, "CLARK", 2450, 10);
		Employee e5 = new Employee(7876, "ADAMS", 1100, 20);
		
		/*
		ArrayList<Employee> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		*/
		
		List<Employee> list= Arrays.asList(e1,e2,e3,e4,e5);
		
		/*
		//java 1.8循环List
		list.stream().forEach(e ->{
			System.out.println(e.getDeptno());
		});
		
		//输出薪水大于1600的员工姓名
		list.stream().filter(e -> e.getSalary()>=1600).forEach(e ->{
			System.out.println(e.getEname());
		});
		
		//map方法
		list.stream().map(en -> en.getEname()).collect(Collectors.toList())
		.forEach(System.out::println);
		
		int sumem = list.stream().mapToInt(e -> e.getSalary()).sum();
		System.out.println(sumem);
		
		
		list.stream().filter(e -> e.getSalary()>1200).forEach(e ->{
			System.out.println(e.getEname());
		});
		 
		List<Employee> emList = list.stream().filter(e -> e.getSalary()>1200)
				.collect(Collectors.toList());
		emList.forEach(e -> {
			System.out.println(e.getEname());
		});
		
		
		//排序。由高到底排序
		List<Employee> emArray = list.stream()
				.sorted(Comparator.comparing(Employee::getSalary))
				.collect(Collectors.toList());
		emArray.stream().forEach(e -> {
			System.out.println(e.getEname()+"----"+e.getSalary());
		});
		*/
		
		String ename = list.stream().map(em -> em.getEname()).collect(Collectors.joining(","));
		System.out.println(ename);
		
		Map<Integer, List<Employee>> map = list.stream().collect(Collectors.groupingBy(em -> em.getDeptno()));
		for(Map.Entry<Integer, List<Employee>> emp : map.entrySet()){
			for(Employee emply : emp.getValue()){
				System.out.println("key："+emp.getKey()+"value："+emply.getEmpno());
			}
			
		}
		
		
		List<String> names = list.stream().filter(employee -> employee.getDeptno().equals(20))
				.sorted(Comparator.comparing(Employee::getSalary).reversed())
				.map(employee -> employee.getEname()).collect(Collectors.toList());
		names.stream().forEach(System.out::println);
	}
}
