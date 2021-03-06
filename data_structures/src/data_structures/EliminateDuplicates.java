package data_structures;

import java.util.Scanner;

public class EliminateDuplicates {
	public static Node<Integer> takeInput(){
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
	public static Node<Integer> delete(Node<Integer> head){
		Node<Integer> temp = head;
		Node<Integer> next = head.next;
		while(next!=null){
			if(next.next==null){
				if(temp.data==next.data){
					temp.next=null;
					return head;
				}
			}
			if(temp.data==next.data){
				temp.next=next.next;
				temp=temp.next;
				next = temp.next;
			}
			else{
				temp=temp.next;
				next=next.next;
			}
		}
		return head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = takeInput();
		print(delete(head));

	}

}
