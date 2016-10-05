package com.yc.bean2.sort.s5_MergeSorter;

import com.sun.scenario.effect.Merge;
import com.yc.bean2.sort.Sortable;

//归并排序： 特点：以空间换时间
//核心算法  如何将两个有序数组合成一个有序数组
/*实现：
 * 		1 .拆： 将一个大的数组一直拆到n个长度为g的数组
 * 		2.排序：每两个长度为一的数组排序
 * 		3. 合并： 将排好序的数组合并
 * */ 
public class MergeSort  implements Sortable{
	public int[] arr;

	
	public MergeSort(int[] arr) {
		this.arr = arr;
	}

	/**
	 * 
	 */
	@Override
	public void sort() {
		// 拆分的终止条件是直到一个数组长度为1
		if(arr.length<=1){
			return;
		}
		//将arr拆成两个数组
		int[] a=new int[arr.length/2];
		int[] b=new int[arr.length-a.length];
		//将arr中的值分成两部分存到新的两个数组  
		System.arraycopy(arr, 0, a, 0, a.length);
		System.arraycopy(arr, a.length,b, 0, b.length);
		//对这两个数组进行递归 归并排序
		MergeSort ms1=new MergeSort(a);
		MergeSort ms2=new MergeSort(b);
		ms1.sort();
		ms2.sort();
		//再调用合并  以合并这两个已排好序的数组
		merge(a,b);
	}
	
	/**
	 * 将两个已排好序的数组合成一个  存到arr中
	 * @param first
	 * @param second
	 */
	private void merge( int[] first,int[] second){
		int ifirst=0,isecond=0,j=0;
		while( ifirst<first.length && isecond<second.length ){
			//如果a[0] 小于b[0]  那么把a[0]放入空数组   再比较a[1]和b[0]
			if( first[ifirst]<second[isecond] ){
				arr[j]=first[ifirst];
				ifirst++;
			}else{//否则将b[0] 放入空数组
				arr[j]=second[isecond];
				isecond++;
			}
			j++;
		}
		//将first数组还没有取出来的元素复制到arr
		System.arraycopy(first, ifirst, arr, j, first.length-ifirst);
		//将second数组还没取出来的元素复制到arr
		System.arraycopy(second, isecond, arr, j, second.length-isecond);
	}
	
	
	public static void main(String[] args){
		int[] a={1,7,22};
		int[] b={3,8,20};
		int[] z=new int[6];
		
		MergeSort ms=new MergeSort(z);
		ms.merge(a, b);
		
		for(int t:z){
			System.out.println(t);
		}
	}
}
