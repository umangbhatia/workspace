package Stacks;

import queues.QueuesUsingLL;

public class UsingTwoQueuesPopEff <T> {
	QueuesUsingLL<T> Q1 = new QueuesUsingLL<>();
	QueuesUsingLL<T> Q2 = new QueuesUsingLL<>();
	T top;
	int size=0;
	public void push(T element){
		if(size==0){
			Q1.enqueue(element);
			Q2.enqueue(element);
			size++;
		}else{
			
		}
		
	}
	public QueuesUsingLL <T> reverse(QueuesUsingLL<T> Q, QueuesUsingLL<T> Q1) throws Exception {
		if(Q.size()==1){
			Q1.enqueue(Q.dequeue());
			return Q1;
		}
		T input = Q.rear();
		Q1.enqueue(input);
		QueuesUsingLL<QueuesUsingLL<Integer>> Q2 = new QueuesUsingLL<>();
		while(Q.size()!=1){
			Q2.enqueue(Q.dequeue());
		}
		reverse(Q2, Q1);
		return Q1;
	}
	

}
