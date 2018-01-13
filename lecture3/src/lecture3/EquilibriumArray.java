 package lecture3;

import java.util.Scanner;

public class EquilibriumArray {
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
	public static int index(int a[]){
		for(int i=1;i<a.length-1;i++){
			int sumLower=0,sumHigher=0;
			for(int j=0;j<i;j++){
				sumLower+=a[j];
			}
			for(int k=i+1;k<=a.length-1;k++){
				sumHigher+=a[k];
			}
			if(sumHigher==sumLower){
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=takeInput();
		int index=index(a);
		System.out.println("Index is: "+index);

	}

}
