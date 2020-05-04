package com.doume;

public class Liyun {
	
	
	public static void main(String[] args){
		
		int[] a = {1,3,2,6,7,10,9,12,13,12,6666,4,4,4,44,44,4,4,4,1,2};
		int[] b = {1,15,5,6,12,8,0,11,17,16};
		
		int[] arrayList = Liyun.getIntNumberArray(a, b);
		for(int i=0;i<arrayList.length;i++){
			System.out.println(arrayList[i]);
		}
	}
	
	
	public static int[] getIntNumberArray(int[] a1,int[] b1){
		int[] array = new int[a1.length+b1.length];
		/*
		int a = 0;
		int b = 0;
		int c = 0;
		
		while(a<a1.length && b<b1.length){
			
			if(a1[a] < b1[b]){
				array[c++] = a1[a++];
			}else{
				array[c++] = b1[b++];
			}
			
			while(a<a1.length){
				array[c++] = a1[a++];
			}
			while(b<b1.length){
				array[c++] = b1[b++];
			}
		}
		
		return array;
		*/
		for(int i=0;i<a1.length;i++){
			array[i] = a1[i];
		}
		System.out.println("----------------------------------------------");
		for(int j = 0 ; j<b1.length;j++){
			array[a1.length+j] = b1[j];
		}
		
		return array;
	}
}
