package com.yc.bean2.sort.s2_selectionSort;

import com.yc.bean2.sort.Sortable;

//选择排序    比较次数减少

public class SelectionSorter implements Sortable {
	private int[] arr;

	
	public SelectionSorter(int[] arr) {
		this.arr = arr;
	}

	//每次内循环 找一个最小值  记录最小值的索引  当内循环完毕后  将这个最小值与外循环的值进行交换
	public void sort() {
		for(int i=0;i<arr.length;i++){
			int minindex=i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[minindex]>=arr[j]){
					minindex=j;
				}
			}
			int temp;
			temp=arr[i];
			arr[i]=arr[minindex];
			arr[minindex]=temp;
		}
	}
	
}
