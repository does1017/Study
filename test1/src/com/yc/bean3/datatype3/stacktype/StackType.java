package com.yc.bean3.datatype3.stacktype;

//后进先出
//应用：撤销和重做
//  -> 构造算术表达式
public class StackType<T> {
	private static final int MAXLENGTH=100;
	//底层用数组实现(也可以用前面的链表)
	private Object[] data=new Object[MAXLENGTH];
	//记录栈顶的指针
	private int top;
	
	//初始化栈
	public void init(){
		top=0;
		data=new Object[MAXLENGTH];
		System.gc();
	}
	
	//判断栈是否为空
	public boolean empty(){
		return top==0?true:false;
	}
	
	//判断栈是否满了
	public boolean isFull(){
		return top==MAXLENGTH;
	}
	
	//清空栈
	public void clear(){
		top=0;
	}
	
	//入栈
	public T push(T t){
		//是否已满
		if(isFull()){
			throw new RuntimeException("stack is full");
		}
		data[top]=t;
		top++;
		return t;
	}
	
	//出栈
	public T pop(){
		//是否已清空
		if(empty()){
			throw new RuntimeException("stack is empty");
		}
		--top;
		return (T) data[top];
	}
	
	//出栈
	public T peek(){
		//是否已清空
		if(empty()){
			throw new RuntimeException("stack is empty");
		}
		//--top;
		return (T) data[top-1];
	}
	
	public int size(){
		return top;
	}
	
	public static void main(String[] args) {
		StackType st=new StackType();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		
		System.out.println("大小："+st.size());
		int len=st.size();
		for(int i=0;i<len;i++){
			System.out.println(st.pop());
		}
		System.out.println("大小："+st.size());
	}
}
