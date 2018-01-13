import java.util.Scanner;

public class InsertionSort {
	public static int[] sort(int a[], int endIndex){
		if(endIndex==a.length){
			return a;
		}
		
			for(int j=endIndex;j>0;j--){
				if(a[j]<a[j-1]){
					int temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
				}
			}
		
		return sort(a, endIndex+1);
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
	public static void printArr(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=takeInput();
		int sort[]=sort(a, 0);
		printArr(sort);
		

	}

}
