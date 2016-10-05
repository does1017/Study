package com.yc.bean3.datatype3.stacktype.questions;

public class Test1 {

	/**
	 * 只能用一个数组来实现三个栈的功能键
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


class MyStack{
	int stackSize=0;
	int[] buffer=new int[stackSize*3];
	int[] stackPoint=new int[]{-1,-1,-1};
	
	/**
	 * 判断栈是否为空
	 * @param stackNum  第几个栈 0,1,2
	 * @return
	 */
	public boolean empty(int stackNum ){
		return stackPoint[stackNum]==-1;
	}
}