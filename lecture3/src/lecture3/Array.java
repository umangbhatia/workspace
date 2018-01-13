package lecture3;

import java.util.Scanner;

public class Array {
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
	public static int sumArr(int[] input){
		int sum=0;
		for(int i=0; i<input.length; i++){
			sum = sum+input[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = takeInput();
		int sum = sumArr(input);
		System.out.println("Sum is: "+sum);
		

	}

}
