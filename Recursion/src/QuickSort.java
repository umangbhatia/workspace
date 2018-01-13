import java.util.Scanner;

public class QuickSort {
	// 7 6 4 3 5 6 5 4
	public static int partition(int a[],int bi,int end){
		int count=0;
		for(int i=bi+1;i<=end; i++){
			if(a[i]<=a[bi]){
				count++;
			}
		}
		System.out.println(count);
		int pivot=bi+count;
		int temp=a[pivot];
		a[pivot]=a[bi];
		a[bi]=temp;
		int i=bi,j=end;
		while(i<pivot){
			if(a[i]<=a[pivot]){
				i++;
			}
			else{
				if(a[j]<=a[pivot]){
					int swap=a[j];
					a[j]=a[i];
					a[i]=swap;
					i++;
					j--;
				}
				else{
					j--;
				}
			}
		}
		return pivot;
	}
	public static void sort(int a[], int bi, int end){
		if(bi>=end){
			return;
		}
		int pivot = partition(a, bi, end);
		sort(a, bi, pivot-1);
		sort(a, pivot+1, end);
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
		sort(a, 0, a.length-1);
		printArr(a);

	}

}
