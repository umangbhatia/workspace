package data_structures;

import java.util.Scanner;

public class mergeTwoSortedArrays {
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
	public static Node<Integer> merge(Node<Integer> h1, Node<Integer> h2, Node<Integer> hf, Node<Integer> tf) {
		if(h1.data>h2.data){
			hf=h2;
			tf = h2;
			h2 = h2.next;
		}
		else{
			hf=h1;
			tf=h1;
			h1=h1.next;
			

		}
		while(h1!=null&&h2!=null){
			if(h1.data>h2.data){
				tf.next = h2;
				tf=h2;
				h2 = h2.next;
				

			}
			else{
				tf.next=h1;
				tf=h1;
				h1=h1.next;
			}
		}
		if(h1==null){
			tf.next=h2;
		}else{
			tf.next=h1;
		}
		return hf;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head1 = takeInput();
		Node<Integer> head2 = takeInput();
		print(merge(head1, head2, head1, head1));

	}

}
