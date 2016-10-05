package com.yc.bean2.sort.s1_bubleSort;

import com.yc.bean2.sort.Sortable;

public class BubbleSorter implements Sortable {
	private int[] arr;
	
	public BubbleSorter( int[] arr ){
		this.arr=arr;
	}
	
	public void sort(){
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-1-i;j++){
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}	
			}
		}
	}
}
