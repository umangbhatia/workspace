package data_structures;

import java.util.Scanner;

public class LinkedList {
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
		while(head.data!=-1){

			System.out.print(head.data+"->");
			head = head.next;
			if(head==null){
				return;
			}
		}
	}
	public static void printIth(Node<Integer> head, int i){
		int count=1;
		while(head!=null){
			if(i==count){
			System.out.print(head.data+"->");
			return;
			}	
			count++;
			head = head.next;
		}
	}


public static void main(String[] args) {
	// TODO Auto-generated method stub
	Node<Integer> head = takeInput();
	print(head);
	printIth(head, 3);

}

}
