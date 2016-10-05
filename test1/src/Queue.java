
public class Queue {
	private static final int MAXLEN=100;
	private Object[] data=new Object[MAXLEN];
	
	private int head;//队头
	private int tail;//队尾
	
	public void init(){
		data=new Object[MAXLEN];
		head=0;
		tail=0;
		System.gc();
	}
	
	public boolean empty(){
		return head==tail;
	}
	
	public boolean isFull(){
		return tail==MAXLEN;
	}
	
	public void clear(){
		head=0;
		tail=0;
	}
}
