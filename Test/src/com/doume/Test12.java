package com.doume;

public class Test12 {
	static int count = 1;
	public static void main(String[] args){
		int i = Test12.getNumber(2);
		System.out.println(i);
	}
	public static int getNumber(int n){
		int number = n*2;
		if(number > 5000){
			System.out.println(number);
			return count;
		}
		count++;
		return getNumber(number);
	}
}
