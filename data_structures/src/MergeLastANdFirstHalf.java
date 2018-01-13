import java.util.LinkedList;
import java.util.Scanner;

class Node<T> {
	public T data;
	public Node<T> next;
	
	public Node(T data){
		this.data = data;
	}

}


public class MergeLastANdFirstHalf {
public static Node<Integer> merge(Node<Integer> head){
	Node<Integer> temp = head;
	int n=0;
	while(temp!=null){
		temp = temp.next;
		n++;
	}
	temp = head;
	Node<Integer> temp2 = head;
	for(int i=0;i<n/2;i++){
		temp2 = temp2.next;
	}
	Node<Integer> temp1N = temp.next;
	Node<Integer> temp2N = temp2.next;
	while(temp2N!=null){
		temp.next = temp2;
		temp2.next = temp1N;
		temp = temp1N;
		temp1N = temp1N.next;
		temp2 = temp2N;
		temp2N = temp2N.next;
	}
	temp.next = temp2;
	return head;
}
public static Node<Integer> takeInput(){
	Scanner s = new Scanner(System.in);
	Node<Integer> head = null, tail=null;
//	System.err.println("Enter Data");
	int data = s.nextInt();

	while(data != -1){
		Node<Integer> newNode = new Node<Integer>(data);
		if(head==null){
			head = newNode;
			tail = head;
		}
		else{
			tail.next = newNode;
			tail = newNode;
		}
//		System.err.println("Enter Data");
		data = s.nextInt();
	}
	return head;
}
public static void print(Node<Integer> head){

	while(head.data!=-1){

		System.out.print(head.data+" ");
		head = head.next;
		if(head==null){
			System.out.print(-1);
			return;
		}
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = takeInput();
//		print(head);
		print(merge(head));
		

	}

}
