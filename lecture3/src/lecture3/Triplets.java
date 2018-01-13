package lecture3;

import java.util.Scanner;

public class Triplets {
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
	public static void triplet(int a[], int x){
		int z=0;
		for(int i=0;i<a.length-2;i++){
			for(int j=i+1;j<a.length-1;j++){
				for(int k=j+1;k<a.length;k++){
					if(a[i]+a[j]+a[k]==x){
						z++;
						System.out.println(a[i]+", "+a[j]+" and "+a[k]+" form a triplet");
					}
				}
			}
		}
		if(z==0){
			System.out.println("no triplets");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=takeInput();
		System.out.println("Enter x");
		Scanner s = new Scanner(System.in);
		int x=s.nextInt();
		triplet(a, x);

	}

}
