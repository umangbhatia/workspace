package lecture3;

import java.util.Scanner;

public class ReverseArray {
		public static int[] takeInput(){
			System.out.println("Enter n");
			Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			int arr[]= new int[n];
			for(int i=0;i<n;i++){
				System.out.println("Enter number "+i);
				arr[i]= s.nextInt();
			}
			
			return arr;
		}
		public static int[] reverseArr(int arr[]){
			int n = arr.length;
			int rev[]= new int[n];
			for(int i = 0; i<n;i++){
				rev[i]=arr[n-i-1];
			}
			return rev;
		}
		public static void printArr(int arr[]){
			for(int i=0;i<arr.length;i++){
				System.out.print(arr[i]+" ");
			}
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=takeInput();
		int rev[]=reverseArr(arr);
		printArr(rev);

	}

}
