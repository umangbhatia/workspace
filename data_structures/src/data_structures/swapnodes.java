package data_structures;

import java.util.Scanner;

public class swapnodes {
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
	public static Node<Integer> swap(Node<Integer> head, int i, int j){
		int pos1=1;
		int pos2=1;
		if(i==j){
			return head;
		}
		Node<Integer> temp1 = head; 
		Node<Integer> temp2 = head;
		if(i==1){
			if(j==2){
				head = head.next;
				temp1.next=head.next;
				head.next=temp1;
				return head;
			}
			while(pos2<j-1){
				pos2++;
				temp2 = temp2.next;
			}
			Node<Integer> temp3 = temp1.next;
			Node<Integer> temp4 = temp2.next;
			
			head = temp4;
			temp2.next=temp1;
			temp1.next = temp4.next  ;
			head.next=temp3;
			
			return head;
			
		}
		
		while(pos1<i-1){
			pos1++;
			temp1 = temp1.next;
		}
		while(pos2<j-1){
			pos2++;
			temp2 = temp2.next;
		}
		if(j-i==1){
			Node<Integer> temp3 = temp1.next;
			Node<Integer> temp4 = temp2.next;
			temp1.next = temp2.next;
			temp2.next = temp4.next;
			temp4.next = temp3;
			return head;
		}
		Node<Integer> temp3 = temp1.next;
		Node<Integer> temp4 = temp2.next;
		Node<Integer> temp = temp3.next;
		temp1.next=temp4;
		temp2.next=temp3;
		temp3.next=temp4.next;
		temp4.next=temp;
		return head;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = takeInput();
		print(swap(head, 1, 2));

	}

}
