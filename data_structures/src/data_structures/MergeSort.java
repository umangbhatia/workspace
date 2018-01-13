package data_structures;

import java.util.Scanner;

public class MergeSort {
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

	public static Node<Integer> sort(Node<Integer> head) {
		if(head.next==null){
			return head;
		}
		Node<Integer> midpoint = MidpointBetter.midpoint(head);
		Node<Integer> first = head;
		Node<Integer> a=null;
		Node<Integer> second = midpoint.next;
		midpoint.next=null;
		first=sort(first);
		second=sort(second);
		Node<Integer> headf = mergeTwoSortedArrays.merge(first, second, a, a);
		return headf;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = takeInput();
		print(sort(head));

	}

}
