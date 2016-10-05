package com.yc.bean1.recursion;

public class Test5 {

	//使用递归实现对有序数组的二分查找
	public static void main(String[] args) {
		int[]x={2,3,6,9,12,15,20};
		System.out.println(binarySearch(x,6));
	}

	private static int binarySearch(int[] x, int key) {
		return binarySearch(x, key,0,x.length-1);
	}

	private static int binarySearch(int[] x, int key, int low, int high) {
		if( low>=high ){
			return -1;
		}else{
			//取出中间值
			int mid=(low+high)/2;
			//判断中间元素是否为key
			//等于key  表示找到了  return索引
			if( x[mid]==key){
				return mid;
			}else if( x[mid]>key ){//如果中间元素大于key
				return binarySearch(x, key, low, mid);
			}else{//中间元素小鱼key
				return binarySearch(x, key, mid, high);
			}
		}
	}

}
