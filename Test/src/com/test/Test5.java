package com.test;

public class Test5 {
	
	
	public static void main(String[] args){
		int[] array = {1,4,3,2,5,7,8,6,9,22,11,10};
		int[] testArray = Test5.IntArray(array);
		for(int i=0;i<testArray.length;i++){
			System.out.println(testArray[i]);
		}
	}
	
	public static int[] IntArray(int[] array){
		if(array.length<=0){
			throw new NullPointerException();
		}
		for(int i=0;i<array.length;i++){
			for(int j=i+1;j<array.length;j++){
				if(array[i]<array[j]){
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}
}
