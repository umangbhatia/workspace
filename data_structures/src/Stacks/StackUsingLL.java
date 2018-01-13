package Stacks;
import data_structures.Node;
public class StackUsingLL<T> {

	private Node<T> head;
	int count = 0;
	public void push(T element){
		if(head==null){
			Node<T> top = new Node<T>(element);
			head = top;
			count++;
		}else
		{
			Node<T> top = new Node<T>(element);
			top.next = head;
			head = top;
			count++;
		}
	}
	public T pop() throws StackEmptyException{
		if(head==null){
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
		if(head.next==null){
			count--;
			return head.data;
		}else{
			Node<T> top = head;
			head = head.next;
			count--;
			return top.data;
		}
	}
	public int size(){
		return count;
	}
	public boolean isEmpty(){
		return size() == 0;
	}
	public T top() throws StackEmptyException{
		if(head==null){
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
		return head.data;
	}

}
