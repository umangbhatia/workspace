package lecture3;

import java.util.Scanner;

public class Sort0And1 {
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
	public static int[] sort(int A[]){
		int sort[]=new int[A.length];
		int j=0,k=A.length;
		for(int i=0;i<A.length;i++){
			if(A[i]==0){
				sort[j]=0;
				j++;
			}
			if(A[i]==1){
				sort[k-1]=1;
				k--;
			}
		}
		return sort;
	}
	public static void printArr(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[]=takeInput();
		int sort[]=sort(A);
		printArr(sort);
	}

}
