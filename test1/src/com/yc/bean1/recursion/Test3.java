package com.yc.bean1.recursion;

public class Test3 {

	public static void main(String[] args) {
		printHello(5);
	}
	
	private static void printHello( int n ){
		if(n<1){
			return;
		}else{
			System.out.println("第"+n+"次输出Hello");
			printHello(n-1);
		}
	}

}
