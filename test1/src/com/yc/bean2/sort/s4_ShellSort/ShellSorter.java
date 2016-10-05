package com.yc.bean2.sort.s4_ShellSort;

import com.yc.bean2.sort.Sortable;

public class ShellSorter implements Sortable {
	public int[] arr;

	
	public ShellSorter(int[] arr) {
		this.arr = arr;
	}
	@Override
	/**
	 * 分段  一般是 除2  比如9个数字 分为   4   2   1     注意： 最后一个分段条件 一定要是 1
	 */
	public void sort() {
		for(int r=arr.length/2;r>=1;r=r/2){
			
			for(int i=r;i<arr.length;i++){
				//记录索引位置
				int j=i-r;
				//记录i位置的值
				int next=arr[i];
				
				while(j>=0 && arr[j]>next){
					//交换位置
					arr[j+r]=arr[j];
					j=j-r;
				}
				arr[j+r]=next;
			}
		}	
	}

}
