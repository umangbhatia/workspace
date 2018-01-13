package lecture3;

import java.util.Scanner;

public class LargestNumberArray {
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
	public static int largest(int input[]){
		int max=0;
		int i=0;
		for(;i<input.length; i++ ){
			if(input[i]>=max){
				max=input[i];
			}

		}
		return max;
	}
	public static void main(String[] args) {
		int input[]=takeInput();
		int max=largest(input);
		System.out.println("the largest number is: "+max);

	}
}
