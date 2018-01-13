package data_structures;

import java.util.Scanner;

public class AppendLastN {
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
	public static Node<Integer> append(Node<Integer> head, int n) {
		Node<Integer> temp = head;
		Node<Integer> temp2 = head;
		Node<Integer> ans = head;
		int count = 1;
		while(temp2.next!=null){
			temp2=temp2.next;
		}
		while(temp.next!=temp2){
			temp=temp.next;
		}
		while(count!=n){
			count++;
			temp2=temp;
			temp = head;
			if(temp2==head){
				return head;
			}
			while(temp.next!=temp2){
				temp=temp.next;
			}
		}
		ans = temp2;
		temp.next=null;
		while(temp2.next!=null){
			temp2=temp2.next;
		}
		temp2.next = head;
		return ans;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = takeInput();
		print(append(head, 5));

	}

}
