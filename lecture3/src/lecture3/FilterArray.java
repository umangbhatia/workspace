package lecture3;

import java.util.Scanner;

public class FilterArray {
	
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
	public static int filter(int input[], int n){
		int i=0;
		for(;i<input.length;i++){
			if(n==input[i]){
				break;
			}
			if(i==input.length-1){
				return -1;
		}
		
		}
		return i;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[]=takeInput();
		System.out.println("Enter number which you need to filter");
		Scanner s=new Scanner(System.in);
		int n = s.nextInt();
		int i=filter(input,n);
		System.out.println("The index of the number is: "+i);
				

	}

}
