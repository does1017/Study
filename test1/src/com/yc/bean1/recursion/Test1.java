package com.yc.bean1.recursion;

public class Test1 {
	
	//需求  计算n的阶乘
	public static void main(String[] args) {
		factrial(2);
	}
	
	/*
	 * 递归  代码整合度高  递归层多 内存有溢出的可能
	 * */
	private static int factrial(int n){//递归调用很耗内存   因为每次递归都会分配一个新的内存空间  而程序没有运行完是不会回收内存空间
		if(n==1){
			return 1;
		}else{
			return n*factrial(n-1);
		}
	}

}
