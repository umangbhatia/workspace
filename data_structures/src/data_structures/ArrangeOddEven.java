package data_structures;

import java.util.Scanner;

public class ArrangeOddEven {
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
	public static Node<Integer> arrange(Node<Integer> head){
		Node<Integer> temp = head;
		
		while(true){
			Node<Integer> temp1 = head;
			Node<Integer> temp2 = head;
			if(temp.data%2==1){
				while(temp.next.data%2==1){
					temp=temp.next;
				}
				temp1=temp.next;
				while(temp1.next.data%2==0){
					temp1=temp1.next;
					if(temp1.next==null)return head;
				}
				
				temp2 = temp1.next;
				temp.next=temp1.next;
				temp1.next=temp2.next;
				temp2.next=temp1;
				temp=temp1;
			}
			else{
				if(temp.next.data%2==1){
					if(temp==head){
						head = head.next;
						temp.next=head.next;
						head.next=temp;
					}
					else{
						while(temp1.next!=temp){
							temp1=temp1.next;
						}
						temp1.next=temp.next;
						temp.next=temp.next.next;
						temp1.next.next=temp;
					}
				}
				else{
					while(temp1.next!=temp){
						temp1=temp1.next;
					}
					temp2=temp;
					while(temp2.next.data%2==0){
						temp2=temp2.next;
						if(temp2.next==null)return head;
					}
					
					temp1.next=temp2.next;
					temp1=temp2.next.next;
					temp2.next.next=temp;
					temp2.next=temp1;
				}
			}

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node<Integer> head = takeInput();
		print(arrange(head));
	}

}
