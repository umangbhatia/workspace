package lecture3;

import java.util.Scanner;

public class BinarySearch {
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
	public static int[] selectionSort(int a[]){
		for(int i=0;i<a.length-1;i++){
			int k=i;int min=0;
			min=a[i];
			for(int j=i+1;j<=a.length-1;j++){
				if(a[j]<min){
					min=a[j];
					k=j;
				}

			}
			int temp=a[i];
			a[i]=min;
			a[k]=temp;
		}
		return a;
	}
	public static int binarySearch(int sort[], int n){
		int s=0,e=sort.length-1;
		int m=(s+e)/2;
		while(e>s){
			if(n==sort[m]){
				return m;
			}
			if(n>m){
				s=m+1;
			}
			if(n<m){
				e=m-1;
			}
			m=(s+e)/2;
		}
		return -1;
	}
	public static void printArr(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=takeInput();
		int sort[]=selectionSort(a);
		printArr(sort);
		System.out.println("Enter number which you want to check");
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int index=binarySearch(sort, n);
		System.out.println("Index is: "+index);

	}

}
