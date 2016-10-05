package com.yc.bean3.datatype.LinkedList;

import javax.management.RuntimeErrorException;

//单链表： 它是一个对象  这个对象中有两个元素 存真实对象     另一个元素是下一个节点的引用
public class LinkedListType<T> {
	public T t;//存的元素对象
	public LinkedListType<T> nextNode;//下一个节点
	
	
	public int size(){
		int size=0;
		LinkedListType llt=this;
		//llt不为空的话 说明头结点存在
		while(llt!=null){
			size++;
			llt=llt.nextNode;
		}
		
		return size-1;
	}
	
	
	public void add(T t){
		if(  t==null ){
			throw new IllegalArgumentException("argument should not be null");
		}
		LinkedListType newNextNode=new LinkedListType();
		if( newNextNode==null ){
			throw new RuntimeException("there is no enough memery space");
		}
		newNextNode.t=t;
		newNextNode.nextNode=null;
		//循环查找this 这个节点的下一个节点  一直找到最后一个节点  （特点是这个节点的nextnode==null）  
		LinkedListType temp=this;
		while( temp.nextNode!=null ){
			temp=temp.nextNode;
		}
		temp.nextNode=newNextNode;
	}
	
	public LinkedListType addFirst(T t){
		LinkedListType newNode=new LinkedListType();
		if( newNode==null ){
			throw new RuntimeException("there is no enough memery space");
		}
		newNode.t=t;
		newNode.nextNode=this;
		return newNode;
	}
	
	public void addLast(T t){
		add(t);
	}
	
	public LinkedListType remove(T t){
		//快行指针：
		LinkedListType temp=this;
		LinkedListType pre=null;//上一个节点
		while( temp!=null ){
			if(  temp.t.equals(t) ){
				//这个temp是要删除的节点
				break;
			}
			pre=temp;
			temp=temp.nextNode;
		}
		
		pre.nextNode=temp.nextNode;
		return this;
	}
	
	public LinkedListType removeFirst(T t){
		LinkedListType newHead=this.nextNode;
		return newHead;
	}
	
	public LinkedListType removeLast(T t){
		//快行指针：
		LinkedListType temp=this;
		LinkedListType pre=null;//上一个节点
		while( temp!=null ){
			pre=temp;
			temp=temp.nextNode;
		}
		//当temp是空时  pre正好是倒数第二个个节点
		pre.nextNode=null;
		return this;
	}
	
	public T get(int index){
		int i=0;
		LinkedListType temp=this;
		while( temp!=null ){
			if( i==index ){
				return (T) temp.t;
			}
			i++;
			temp=temp.nextNode;
		}
		throw new RuntimeException("out of bounds exception");
	}
	
	//输出链表信息
	public void showAllNode(){
		LinkedListType temp=this;
		int length=size();
		System.out.println("本链表总长为：" + length);
		while( temp!=null ){
			temp=temp.nextNode;
			if(temp!=null){
				System.out.println( temp.t );
			}
		}
	}
	
	public  static void main(String[] args){
		LinkedListType llt=new LinkedListType();
		llt.add(1);
		llt.add(2);
		llt.add(3);
		
		llt.showAllNode();
	}
}
