package com.yc.bean3.datatype.LinkedList.questions;

import java.util.Hashtable;

import com.yc.bean3.datatype.LinkedList.LinkedListType;



public class Test1 {

	/**
	 * 移除没有排序的链表中的重复的节点
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedListType llt=new LinkedListType();
		llt.add(1);
		llt.add(2);
		llt.add(3);
		llt.add(4);
		llt.add(2);
		llt.add(1);
		
		delete1(llt);
		//delete2(llt);
		
		llt.showAllNode();
	}

	private static void delete2(LinkedListType llt) {
		//使用快慢行指针的方法来实现
		if(llt==null){
			throw new RuntimeException("linkedList should not be null");
		}
		LinkedListType p1=llt;
		while(p1!=null){
			LinkedListType p2=p1;
			while(p2.nextNode!=null){
				if(p2.nextNode.t.equals(p1.t)){
					p2.nextNode=p2.nextNode.nextNode;
				}else{
					p2=p2.nextNode;
				}
			}
			p1=p1.nextNode;
		}
	}

	//以空间换时间：Hashtable ->
	//      1          true
	//      2          true
	private static void delete1(LinkedListType llt) {
		Hashtable ht=new Hashtable();
		LinkedListType previous=null;
		if(llt==null){
			throw new RuntimeException("linkedList should not be null");
		}
		llt=llt.nextNode;
		while(llt!=null){
			if(ht.containsKey(llt.t)){
				//在Hashtable中已经存在了这个键，表明重复的
				previous.nextNode=llt.nextNode;
			}else{
				ht.put(llt.t, true);
				previous=llt;
			}
			llt=llt.nextNode;
		}
	}
}
