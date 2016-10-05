package com.yc.bean1.recursion;

public class Test2 {
	static int j=0;
	//斐波拉切数列  1 1 2 3 5 8 13
	public static void main(String[] args) {
		
		System.out.println(fib(5)+"-----");
	}
	
	private static int fib( int i ){

		if(i==1){
			return 1;
		}else if(i==2){
			return 1;
		}else{
			j++;
			System.out.println(j);
			return fib(i-1)+fib(i-2);//3 2  2 1
		}
	}

}
