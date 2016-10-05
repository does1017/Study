package com.yc.bean3.datatype.LinkedList.questions;

import com.yc.bean3.datatype.LinkedList.LinkedListType;

public class Test3 {

	/**
	 * 以给定x为基准，将链表分为两个部分，所有小于x的节点都排在大于或等于x的节点之前
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedListType llt=new LinkedListType();
		llt.add(1000);
		llt.add(222);
		llt.add(30);
		llt.add(4);
		llt.add(90);
		llt.add(50);
		LinkedListType node=partition(llt,100);
		node.showAllNode();
	}
	
	//解决方案：创建两个子链表，一个链表存所有小于x的节点，另一个链表存所有大于x的节点
	//循环原链表，将每个节点插入到这两个子链表中，最后，再合并两个链表
	private static LinkedListType partition(LinkedListType head,Comparable x){
		LinkedListType beforeStart=null;
		LinkedListType afterStart=null;
		head=head.nextNode;
		while(head!=null){
			LinkedListType next=head.nextNode;
			//判断大小
			if(x.compareTo(head.t)>0){
				head.nextNode=beforeStart;
				beforeStart=head;
			}else{
				head.nextNode=afterStart;
				afterStart=head;
			}
			head=next;
		}
		//合并
		//没有小的元素的处理
		if(beforeStart==null){
			return afterStart;
		}
		//小的有，大的没有或是有一点
		LinkedListType newHead=new LinkedListType();
		newHead.nextNode=beforeStart;
		//找到下的链表的最后一个节点，再将大的链表的首节点存到小的链表的最后一个节点的nextNode中
		while(beforeStart.nextNode!=null){
			beforeStart=beforeStart.nextNode;
		}
		beforeStart.nextNode=afterStart;
		return newHead;
	}
}
