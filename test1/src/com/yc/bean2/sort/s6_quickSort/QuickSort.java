package com.yc.bean2.sort.s6_quickSort;

import com.yc.bean2.sort.Sortable;

public class QuickSort implements Sortable {
	public int[] arr;

	
	public QuickSort(int[] arr) {
		this.arr = arr;
	}
	
	
	@Override
	public void sort() {
		sort(0,arr.length-1);
		//接着小的值与大的值 交换位置
	}
	
	
	private void sort(int from, int to) {
		//递归的终止条件
		if(from>=to){
			return;
		}
		int pivotIndex=partition(from,to);
		//取出pivot当前的位置 再递归调用这个快排  
		//计算 左边的范围  右边的范围
		sort(from,pivotIndex);
		sort(pivotIndex+1,to);
		
	}
	
	
	//分区算法; 根据起点位置 和重点位置 查找一个pivot的最终位置 并返回
	private int partition(int from, int to){
		//找到pivot  一次外循环要保证所有比pivot小的在左边  大的在右边
		int pivot=arr[from];
		int i=from-1;
		int j=to+1;
		//一次外循环要保证所有比pivot小的在左边  大的在右边
		while( i<j ){
			//让i从第一个索引循环  找比pivot大的值 找到就记录索引
			i++;
			while( arr[i]<pivot ){
				i++;
			}
			//让j从最后一个元素向前循环  找比pivot小的值  找到就记录索引		
			j--;
			while( arr[j]>pivot ){
				j--;
			}
			//经过以上两个内循环  i中记录比pivot大的值得位置  j中记录比pivot小的值得位置
			if( i<j ){
				swap(i,j);
			}
		}
		return j;
	}
	
	private void swap(int minIndex,int maxIndex){
		int temp=arr[minIndex];
		arr[minIndex]=arr[maxIndex];
		arr[maxIndex]=temp;
	}

}
