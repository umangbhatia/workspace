package data_structures;

import java.util.Scanner;

public class PrintReverse {
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
	public static void printrev(Node<Integer> head) {
		if (head.next==null) {
			System.out.println(head.data);
			return;
		}
		Node<Integer> temp = head;
		Node<Integer> temp2 = head;
		while(temp2.next!=null){
			temp2=temp2.next;
		}
		while(true){
			temp=head;
			while(temp.next!=temp2){
				temp=temp.next;
			}
			System.out.print(temp2.data+"->");
			temp2=temp;
			if(temp2==head){
				System.out.print(temp2.data);
				return;
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = takeInput();
		printrev(head);

	}

}
