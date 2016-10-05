package com.yc.bean2.sort.s3_InsertionSorter;

import com.yc.bean2.sort.Sortable;

public class InsertSorter implements Sortable {
	private int[] arr;

	
	public InsertSorter(int[] arr) {
		this.arr = arr;
	}
	
	
	@Override
	//将前面的元素当成一个已经排好序的数组 在内循环中  拿后面一个元素与前面排好序的部分和最后一个元素比较
	//如果比他大  则内循环结束
	// 如果比他小   则将前面的数组向前循环  直到找到一个比他大的  交换
	public void sort() {
		for(int i=1;i<arr.length;i++){
			//记录索引位置
			int j=i;
			//记录i位置的值
			int next=arr[i];
			//循环j 让j不断地--  直到j<0  或者arr[j-1]>next   6 7 8 3 0 4
			while(j>0 && arr[j-1]>next){
				//交换位置
				arr[j]=arr[j-1];
				j--;
			}
			arr[j]=next;
		}
	}

}
