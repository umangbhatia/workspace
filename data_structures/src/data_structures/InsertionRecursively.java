package data_structures;

import java.util.Scanner;

public class InsertionRecursively {
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
	public static Node<Integer> insert(Node<Integer> head, int i){
		Node<Integer> temp = head;
		
		if(i==1){
			Scanner s = new Scanner(System.in);
			System.err.println("Enter Data");
			int data = s.nextInt();
			Node<Integer> newNode = new Node<Integer>(data);
			Node<Integer> x = head;
			temp = newNode;
			newNode.next = x; 
			return temp;
		}
		head.next= insert(temp.next, i-1);
		return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = takeInput();
		print(insert(head, 3));

	}

}
