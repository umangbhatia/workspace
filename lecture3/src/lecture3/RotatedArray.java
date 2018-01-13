package lecture3;

import java.util.Scanner;

public class RotatedArray {
	public static int findk(int a[]){
		int min=a[0];
		int k=0;
		for(int i=0;i<a.length;i++){
			if(a[i]<=min){
				min=a[i];
				k=i;
			}
		}
		return k;
	}
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=takeInput();
		System.out.println("Array has been rotated by: "+findk(a));

	}

}
