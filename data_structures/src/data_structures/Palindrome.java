package data_structures;

import java.util.Scanner;

public class Palindrome {
	public static Node<Character> takeInput(){
		Node<Character> head = null, tail=null;
		Scanner s = new Scanner(System.in);
		System.err.println("Enter Data");
		char data = (char)s.nextLine().charAt(0);
		while(data!=' '){
			Node<Character> newNode = new Node<Character>(data);
			if(head==null){
				head = newNode;
				tail = head;
			}
			else{
				tail.next=newNode;
				tail=newNode;
			}
			System.err.println("Enter Data");
			data = (char)s.nextLine().charAt(0);
		}
		return head;
	}
	public static void print(Node<Character> head){
		while(head!=null){

			System.out.print(head.data+"->");
			head = head.next;
			if(head==null){
				return;
			}
		}
	}
	public static boolean check(Node<Character> head) {
		if(head.next==null){
			return true;
		}
		Node<Character> temp2 = head;
		while(temp2!=null){
			temp2=temp2.next;
		}
		while(true){
			Node<Character> temp = head;
			while(temp.next!=temp2){
				temp=temp.next;
			}
			if(temp.data!=head.data){
				return false;
			}
			else{
				head=head.next;
				temp2=temp;
			}
			if(head==temp|| head.next==temp){
				return true;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Character> head= takeInput();
		System.out.println(check(head));

	}

}
