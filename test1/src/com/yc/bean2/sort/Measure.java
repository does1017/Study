package com.yc.bean2.sort;

import java.util.Random;

import com.yc.bean2.sort.s1_bubleSort.BubbleSorter;
import com.yc.bean2.sort.s2_selectionSort.SelectionSorter;
import com.yc.bean2.sort.s4_ShellSort.ShellSorter;
import com.yc.bean2.sort.s5_MergeSorter.MergeSort;
import com.yc.bean2.sort.s6_quickSort.QuickSort;
//
public class Measure {

	public static void main(String[] args) {
		int[] x=new int[9];
		Random rd=new Random();
		for(int i=0;i<x.length;i++){
			x[i]=rd.nextInt(9999);
		}
		
		Sortable sort=null;
		sort=new QuickSort(x);
		
		sort.sort();
		
		for(int i: ((QuickSort)sort).arr){
			System.out.println(i+"\t");
		}
		
	}

}
