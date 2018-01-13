package queues;

import Stacks.StackEmptyException;
import Stacks.StackUsingLL;

public class UsingTwoStacksEffDeq <T>{

	StackUsingLL<T> S1 = new StackUsingLL<>();
	StackUsingLL<T> S2 = new StackUsingLL<>();
	T front;
	T rear;
	int size =0;
	public void enqueue(T element) throws StackEmptyException {
		if(S1.size()==0){
			S1.push(element);
			S2.push(element);
		}else{
		S1 = new StackUsingLL<>();
		S1 = Reverse(S2, S1);
		S1.push(element);
		S2 = new StackUsingLL<>();
		S2 = Reverse(S1, S2);
		size++;
	}
	}
	public void dequeue() throws Exception{
		if(S2.size()==0){
			throw new Exception();
		}else{
			S2.pop();
			size--;
		}
	}
	public static <T> StackUsingLL<T> Reverse(StackUsingLL<T> S1, StackUsingLL<T> S2) throws StackEmptyException{
		if(S1.isEmpty()||S1.size()==1){
			return S1;
		}
		T temp = S1.pop();
		S1 = Reverse(S1, S2);
		while(!S1.isEmpty()){
			S2.push(S1.pop());
		}
		S2.push(temp);
		while(!S2.isEmpty()){
			S1.push(S2.pop());
		}
		return S1;
	}
}
