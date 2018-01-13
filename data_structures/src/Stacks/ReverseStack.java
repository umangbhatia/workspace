package Stacks;

import java.util.Scanner;

public class ReverseStack {
	public static StackUsingLL<Integer> takeInput(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Data");
		int data = s.nextInt();
		StackUsingLL<Integer> S = new StackUsingLL<>();
		while(data!=-1){
			S.push(data);
			System.out.println("Enter Data");
			data = s.nextInt();
		}
		return S;
	}
	public static void Reverse(StackUsingLL<Integer> S1, StackUsingLL<Integer> S2) throws StackEmptyException{
		if(S1.isEmpty()||S1.size()==1){
			return;
		}
		int temp = S1.pop();
		Reverse(S1, S2);
		while(!S1.isEmpty()){
			S2.push(S1.pop());
		}
		S2.push(temp);
		while(!S2.isEmpty()){
			S1.push(S2.pop());
		}
	}

	public static void main(String[] args) throws StackEmptyException {
		// TODO Auto-generated method stub
		StackUsingLL<Integer> S = takeInput();
		StackUsingLL<Integer> S1 = new StackUsingLL<>();
		Reverse(S,S1);
		while(!S.isEmpty()){
			System.out.println(S.pop());
		}

	}

}
