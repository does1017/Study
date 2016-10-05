package com.yc.bean3.datatype2.bitmap;

public class Test1 {

	/**
	 * 不能使用任何一种排序算法，进一个数组的元素排序输出
	 * @param args
	 */
	public static void main(String[] args) {
		int[] x=new int[]{4,7,1,9,22,55,900,30};
		//位图
		boolean[] bs=new boolean[901]; //[false,false,false,...]
		for(int i=0;i<x.length;i++){
			int r=x[i]; //4  7  1
			bs[r]=true;
		}
		
		for(int i=0;i<bs.length;i++){
			if(bs[i]==true){
				System.out.print(i+"\t");
			}
		}
	}
}
