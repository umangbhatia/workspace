package lecture3;

import java.util.Scanner;

public class SumOfPairsArray {
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
	public static void verify(int A[], int x){
		int k=0;
		for(int i=0;i<A.length;i++){
			for(int j=i+1;j<A.length;j++){
				if(A[i]+A[j]==x){
					System.out.println("("+A[i]+","+A[j]+") is a pair");
					k++;
				}
			}
		}
		if(k==0){
			System.out.println("No pairs satisfy");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter x");
		Scanner s = new Scanner(System.in);
		int x=s.nextInt();
		int A[]=takeInput();
		verify(A, x);

	}

}
