package lecture3;

import java.util.Scanner;

public class InsertionSort {
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
	public static int[] insertionSort(int[] a){
		for(int i=0;i<a.length-1;i++){
			for(int j=i+1;j>0;j--){
				if(a[j]<a[j-1]){
					int temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
				}
			}
		}
		return a;
	}
	public static void printArr(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=takeInput();
		int sort[]=insertionSort(a);
		printArr(sort);

	}

}
