package lecture3;

import java.util.Scanner;

//You are given with an array containing only 0’s, 1’s and 2’s. Write a
//function to sort this array. Also find another solution which scans the
//array once.
public class Sort0_1and2 {
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
	public static int[] sort(int a[]){
		int nz=0,nt=a.length-1;
		while(a[nt]==2){
			nt--;
		}
		while(a[nz]==0){
			nz++;
		}
		for(int i=nz;i<nt;i++){
			if(a[i]==0){
				a[i]=a[nz];
				a[nz]=0;
				nz++;
			}
			if(a[i]==2){
				if(a[nt]==1){
				a[i]=a[nt];
				a[nt]=2;
				nt--;
				}else{
					a[i]=a[nt];
					a[nt]=2;
					a[i]=a[nz];
					a[nz]=0;
					nt--;
				}
			}
			
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
		int sort[]=sort(a);
		printArr(sort);

	}

}
