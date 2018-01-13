package lecture3;

import java.util.Scanner;

public class WaveArray {
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
	public static int[] wave(int a[]){
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
//		System.out.println(a[0]);
		int initial=2;

		for(int i=0;i<(a.length-1)/2;i++){
			int k=0;
			max=a[initial-1];
			for(int j=initial-1;j<a.length; j++ ){
				if(a[j]>=max){
					max=a[j];
					k=j;
				}
			}
			temp=a[initial];
			a[initial]=a[k];
			a[k]=temp;
			initial=initial+2;
		}
		return a;
	}
	public static void printArr(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=takeInput();
		int wave[]=wave(a);
		printArr(wave);
	}

}
