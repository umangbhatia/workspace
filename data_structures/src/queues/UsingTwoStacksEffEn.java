package queues;

import Stacks.StackEmptyException;
import Stacks.StackUsingLL;

public class UsingTwoStacksEffEn <T> {
	StackUsingLL<T> S1 = new StackUsingLL<>();
	StackUsingLL<T> S2 = new StackUsingLL<>();
	T front;
	T rear;
	int size =0;
	public void enqueue(T element) throws StackEmptyException{
		S1.push(element); 
		if(size==0){
			front = element;
			rear = element;
		}else{
			rear = element;
		}
		size++;
	}
	public void dequeue(T element) throws Exception{
		if(size==0){
			throw new Exception();
		}
		Reverse(S1, S2);
		S1.pop();
		Reverse(S1, S2);
		size--;
	}
	public static <T> void Reverse(StackUsingLL<T> S1, StackUsingLL<T> S2) throws StackEmptyException{
		if(S1.isEmpty()||S1.size()==1){
			return;
		}
		T temp = S1.pop();
		Reverse(S1, S2);
		while(!S1.isEmpty()){
			S2.push(S1.pop());
		}
		S2.push(temp);
		while(!S2.isEmpty()){
			S1.push(S2.pop());
		}
	}


	}


