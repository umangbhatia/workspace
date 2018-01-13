package lecture3;

import java.util.Scanner;

public class Intersection {
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
	public static int[] intersect(int a1[], int[] a2){
		int k=0,l=0;
		if(a1.length>a2.length){
			k=a2.length;
			l=a1.length;
		}
		else{
			k=a1.length;
			l=a1.length;
		}
		int intersection[]= new int[k];
		for(int i=0;i<k;i++){
			for(int j=1;j<l;l++){
				
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
