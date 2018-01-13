import java.util.Scanner;

public class SelectionSort {
	public static int[] sort(int a[], int endindex, int n){
		if(endindex==0){
			return a;
		}
		int max=a[0],k=0;
		for(int i=1;i<a.length-n;i++){
			if(a[i]>max){
				max=a[i];
				k=i;
			}
			
		}
		
		int temp1=a[endindex];
		a[endindex]=max;
		a[k]=temp1;
		return sort(a, endindex-1, n+1);
		
		
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
		int sort[]=sort(a, a.length-1, 0);
		printArr(sort);

	}

}
