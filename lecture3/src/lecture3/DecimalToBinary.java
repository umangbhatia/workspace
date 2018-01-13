package lecture3;


import java.util.Scanner;

public class DecimalToBinary {
	public static int size(int n){
		int size=1;
		while(n>1){
			n=n/2;
			size=size+1;
		}
		return size;
	}
	public static int[] convert(int n, int size){
		int arr[]= new int[size];
		int r,i=0;
		while(n>=1){
			r=n%2;
			n=n/2;
			arr[size-1-i]=r;
			i++;
		}
		return arr;
	}
	public static void printArr(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int size=size(n);
		int arr[]=convert(n, size);
		printArr(arr);

	}

}
