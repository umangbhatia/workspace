package data_structures;

import java.util.Scanner;

public class ReverseRecursion {public static Node<Integer> takeInput(){
	Scanner s = new Scanner(System.in);
	Node<Integer> head = null, tail=null;
	System.err.println("Enter Data");
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
		System.err.println("Enter Data");
		data = s.nextInt();
	}
	return head;
}
public static void print(Node<Integer> head){
	while(head!=null){

		System.out.print(head.data+"->");
		head = head.next;
		if(head==null){
			return;
		}
	}
}
public static Node<Integer> reverse(Node<Integer> head, boolean first, Node<Integer> ans, Node<Integer> temp2  ){
	if(head.next==null){
		return head;
	}
	Node<Integer> temp = head;
	if(first){
		while(temp2.next!=null){
			temp2=temp2.next;
		}
		ans = temp2;
	}
	while(temp.next!=temp2){
		temp=temp.next;
	}
	temp2.next=temp;
	temp2=temp;
	if(head==temp){
		temp.next=null;
		return ans;
	}
	return reverse(head, false, ans, temp2);
}
public static Node<Integer> reversebetter(Node<Integer> head, boolean first) {
	
}
public static void main(String[] args){
	Node<Integer> head= takeInput();
	print(reverse(head, true, head, head));

}
}
