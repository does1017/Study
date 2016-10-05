package com.yc.bean3.datatype.LinkedList.questions;

import com.yc.bean3.datatype.LinkedList.LinkedListType;

public class Test2 {

	//指向单向链表的倒数第n个节点
	public static void main(String[] args) {
		LinkedListType llt=new LinkedListType();
		llt.add(1);
		llt.add(2);
		llt.add(3);
		llt.add(4);
		llt.add(2);
		llt.add(1);
		
		System.out.println(toLastN(llt,2).t);
	}
		
	//使用快慢两个指针，开始时，他们都是指向头结点，将p2指针向前移动n个节点
	//再让两个指针以同样的速度一起移动，当p2指针到达最后时，则p1指针指向的元素就是倒数第n个节点
	private static LinkedListType toLastN(LinkedListType head,int n){
		if(n<=0){
			return null;
		}
		LinkedListType p1=head;
		LinkedListType p2=head;
		
		for(int i=0;i<n-1;i++){
			if(p2==null){
				return null;
			}
			p2=p2.nextNode;
		}
		if(p2==null){
			return null;
		}
		while(p2.nextNode!=null){
			p1=p1.nextNode;
			p2=p2.nextNode;
		}
		return p1;
	}
}
