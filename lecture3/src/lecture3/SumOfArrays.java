package lecture3;

import java.util.Scanner;

public class SumOfArrays {
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
	public static int[] sumArray(int arr1[], int arr2[]){
		int sum[]= new int[arr1.length];
		for(int i=0;i<arr1.length;i++){
			sum[i]=arr1[i]+arr2[i];
		}
		return sum;
	}
	public static void printArr(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter array 1");
		int arr1[]=takeInput();
		System.out.println("Enter array 2");
		int arr2[]=takeInput();
		int sum[]=sumArray(arr1, arr2);
		printArr(sum);

	}

}
