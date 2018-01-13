package lecture3;

import java.util.Scanner;

public class BubbleSort {
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
	public static int[] sort(int a[]){
		while(true){
		int j=0;
		for(int i=0;i<a.length-1;i++){
			if(a[i]>a[i+1]){
				int k=a[i+1];
				a[i+1]=a[i];
				a[i]=k;
				j++;
			}
		}
		if(j==0){
			return a;
		}
		
	}
	}
	public static void printArr(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=takeInput();
		int sort[]=sort(a);
		printArr(sort);

	}

}
