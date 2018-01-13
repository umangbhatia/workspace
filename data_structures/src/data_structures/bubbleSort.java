package data_structures;

import java.util.Scanner;

public class bubbleSort {
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
	public static void sort(Node<Integer> head) {
		Node<Integer> temp = head;
		Node<Integer> temp1= temp.next;
		while(true){
		int count=0;
			while(true){
				if(temp.data>temp1.data){
					if(temp==head){
						head = head.next;
						temp.next=head.next;
						temp1.next=temp;
						temp1=temp.next;
						count++;
					}else{
						Node<Integer> temp2 = head;
						while(temp2.next!=temp){
							temp2=temp2.next;
						}
						temp.next=temp1.next;
						temp1.next=temp;
						temp2.next = temp1;
						count++;
						if(temp.next==null){
							temp=head;
							temp1=temp.next;
							break;
						}
						temp1=temp.next;
					}
				}
				else{
					temp=temp.next;
					if(temp.next==null){
						temp=head;
						temp1=temp.next;
						break;
					}
					temp1=temp.next;
				}
			}
			if (count==0){
				return;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = takeInput();
		sort(head);
		print(head);

	}

}
