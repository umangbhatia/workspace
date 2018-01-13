package Stacks;
import data_structures.Node;
public class MinStack {
	private Node<Integer> head;
	int min = Integer.MAX_VALUE;
	int count=0;
	StackUsingLL<Integer> S = new StackUsingLL<>();
	public void push(int element){
		if(head==null){
			Node<Integer> top = new Node<Integer>(element);
			head = top;
			min = element;
			S.push(element);
			count++;
		}else
		{
			Node<Integer> top = new Node<Integer>(element);
			top.next = head;
			head = top;
			count++;
			if(min>element){
				min=element;
				S.push(element);
			}
		}
		
	}
	public int pop() throws StackEmptyException {
		if(head==null){
			StackEmptyException e = new StackEmptyException();
			throw e;
		}
		if(head.next==null){
			count--;
			if(head.data==min){
				S.pop();
				min = S.top();
			}
			return head.data;
		}else{
			Node<Integer> top = head;
			if(head.data==min){
				S.pop();
				min = S.top();
			}
			head = head.next;
			count--;
			
			return top.data;
		}
		
	}
	public int getMinimum(){
		return min;
	}

}
