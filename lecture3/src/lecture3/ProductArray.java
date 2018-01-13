package lecture3;

import java.util.Scanner;

public class ProductArray {
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
	public static int product(int arr[]){
		int product=1;
		for(int i=0; i<arr.length; i++){
			product =product*arr[i];
		}
		return product;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=takeInput();
		int product=product(arr);
		System.out.println("product is: "+product);

	}

}
