package lecture3;

import java.util.Scanner;

public class FirstNonRepeating {
	public static void duplicate(int A[]){
		
		for(int i=0;i<A.length;i++){
			int k=0;
			for(int j=i+1;j<A.length;j++){
				if(A[i]==A[j]){
					k++;
					break;
				}
			}
			if(k==0){
				System.out.println("First non repeating element is: "+A[i]);
				return;
			}
		}
		
	}
	public static int[]takeInput(){
		Scanner s = new Scanner(System.in);
		System.out.println("enter size");
		int size = s.nextInt();
		int input[]= new int[size];
		for(int i=0; i<size; i++){
			System.out.println("enter "+i+" element");
			input[i]=s.nextInt();
		}
		return input;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[]=takeInput();
		duplicate(A);

	}

}
