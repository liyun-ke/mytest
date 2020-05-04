package com.test;

public class Test4 {
	
	public static void main(String[] args){
		int[] array = {};
		try{
			int arrayNumber[] = Test4.getIntArray(array);
			for(int i=0;i<arrayNumber.length;i++){
				System.out.println(arrayNumber[i]);
			}
		}catch(Exception e){
			System.out.println("调用排序方法出现异常！！！！");
		}
		
	}
	
	public static int[] getIntArray(int[] array){
		if(array.length<=0){
			throw new NullPointerException();
		}
		for(int i=0;i<array.length;i++){
			for(int j=i+1;j<array.length;j++){
				if(array[i]>array[j]){
					int number = array[i];
					array[i] = array[j];
					array[j] = number;
				}
			}
		}
		
		return array;
	}
}
