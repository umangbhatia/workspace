package queues;

import java.util.Scanner;

public class ReverseQueue {
	public static QueuesUsingLL<Integer> takeInput(){
		Scanner s = new Scanner(System.in);
		QueuesUsingLL<Integer> Q = new QueuesUsingLL<>();
		System.out.println("Enter Data");
		int data = s.nextInt();
		while(data!=-1){
			Q.enqueue(data);
			System.out.println("Enter Data");
			data = s.nextInt();
		}
		return Q;
	}
	public static QueuesUsingLL<Integer> reverse(QueuesUsingLL<Integer> Q, QueuesUsingLL<Integer> Q1) throws Exception {
		if(Q.size==1){
			Q1.enqueue(Q.dequeue());
			return Q1;
		}
		int input = Q.rear();
		Q1.enqueue(input);
		QueuesUsingLL<Integer> Q2 = new QueuesUsingLL<>();
		while(Q.size!=1){
			Q2.enqueue(Q.dequeue());
		}
		reverse(Q2, Q1);
		return Q1;
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		QueuesUsingLL<Integer> Q = takeInput();
		QueuesUsingLL<Integer> q1 = new QueuesUsingLL<>();
		Q=reverse(Q, q1);
		while(!Q.isEmpty()){
			System.out.println(Q.dequeue());
		}

	}

}
