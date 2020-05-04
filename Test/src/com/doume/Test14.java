package com.doume;

public class Test14 {
   
	
	public int printInt(int a){
		
		System.out.println(a);
		return a;
	}
	
	public static void main(String[] args){
		Test14 test = new Test14();
		int i=0;
		for(test.printInt(i++),test.printInt(++i);i<6 && test.printInt(i++)<5;test.printInt(++i)){
			test.printInt(0);
		}
	}
}
