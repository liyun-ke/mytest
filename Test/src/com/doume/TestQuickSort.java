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
	 * ��������
	 * @param arrays int ����
	 * @param low ���
	 * @param high �յ�
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
			
			//�ȿ��ұߣ���������ߵݼ�
			while(temp<=arrays[j] && i<j){
				j--;
			}
			//�ڿ���ߣ��������ҵ���
			while(temp>=arrays[i] && i<j){
				i++;
			}
			//���������������
			if(i<j){
				int number = i;
				i = j;
				j = number;
			}
		}
		 
		//��󽫻�׼λi��j����
		arrays[low] = arrays[i];
		arrays[i] = temp;
		//�ݹ�����������
		quickMinSor(arrays,low,j-1);
		//�ݹ�����Ұ�����
        quickMinSor(arrays, j+1, high);
	}
}
