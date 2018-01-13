package lecture3;

import java.util.Scanner;

public class SecondLargest {
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
	public static void printArr(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}

	public static int large(int a[]){
		int max=a[0],replace=0,temp=0,z=0;
		for(int i=0;i<a.length; i++ ){
			if(a[i]>=max){
				max=a[i];
				z=i;
			}
			replace=z;
		}
		temp=a[0];
		a[0]=a[replace];
		a[replace]=temp;
		max=a[1];
		for(int i=1;i<a.length; i++ ){
			if(a[i]>=max){
				max=a[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=takeInput();
		System.out.println("The second largest number is: "+large(a));

	}

}
