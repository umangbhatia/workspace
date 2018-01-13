package Stacks;

public class StackUsingArray {
	private int data[];
	private int top;
	
	public StackUsingArray(){
		data = new int[10];
		top = -1;
	}
	public boolean isEmpty(){
		return size() == 0;
	}
	public int size(){
		int size = top+1;
		return size;
	}
	public int top() throws StackEmptyException{
		if(top<0){
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
		return data[top--];
	}
	public void push(int element) throws StackFullException {
		if(top == data.length-1){
			StackFullException e = new StackFullException();
			throw e;
		}
		data[++top] = element;
	}
	public int pop() throws StackEmptyException {
		if(top<0){
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
		return data[top--];
	}

}
