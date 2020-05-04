package com.doume;

public class TestQuickSort {
	
	
	public static void main(String[] args){
		
		int array[] = {1,4,2,3,5,7,6,9,8,12,10,11};
		TestQuickSort.quickMinSor(array,0,array.length-1);
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
	}
	
	
	/**
	 * 快速排序
	 * @param arrays int 数组
	 * @param low 起点
	 * @param high 终点
	 */
	public static void quickMinSor(int[] arrays,int low,int high){
		int i,j,temp;
		if(low>high){
			return;
		}
		i = low;
		j = high;
		temp = arrays[low];
		while(i<j){
			
			//先看右边，依次往左边递减
			while(temp<=arrays[j] && i<j){
				j--;
			}
			//在看左边，依次往右递增
			while(temp>=arrays[i] && i<j){
				i++;
			}
			//如果满足条件交换
			if(i<j){
				int number = i;
				i = j;
				j = number;
			}
		}
		 
		//最后将基准位i于j交换
		arrays[low] = arrays[i];
		arrays[i] = temp;
		//递归调用左半数组
		quickMinSor(arrays,low,j-1);
		//递归调用右半数组
        quickMinSor(arrays, j+1, high);
	}
}
