package data_structures;

import java.util.Scanner;

public class midpointOfLinkedList {
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
	public static int length(Node<Integer> head){
		int count = 0;
		while(head!=null){
			head = head.next;
			count++;
		}
		return count;
	}
	public static int midpoint(Node<Integer> head){
		int length=length(head);
		int pos = 1;
		while(pos<(length+1)/2){
			head=head.next;
			pos++;
		}
		return head.data;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head= takeInput();
		System.out.println(midpoint(head));

	}

}
