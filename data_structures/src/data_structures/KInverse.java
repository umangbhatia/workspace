package data_structures;

import java.util.Scanner;

public class KInverse {
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
	public static Node<Integer> kInv(Node<Integer> head, int k) {
		if(k==1)return head;
		int count = 1;
		Node<Integer> temp = head;
		Node<Integer> temp1 = head;
		while(count!=k){
			if(temp.next==null)break;
			temp=temp.next;
			count++;
		}
		temp1=temp.next;
		
		temp.next=null;
		head=ReverseLinkedList.reverse(head);
		if(temp1==null){
			return head;
		}
		temp=head;
		while(temp.next!=null){
			temp=temp.next;
		}
		temp.next=kInv(temp1, k);
		return head;
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = takeInput();
		print(kInv(head, 3));

	}

}
