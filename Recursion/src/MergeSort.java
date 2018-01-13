import java.util.Scanner;

public class MergeSort {
	public static int[] mergeSortedArrays(int a[], int b[]){
		int merge[]= new int[a.length+b.length];
		int first=0, second=0;
		for(int i=0;i<merge.length;i++){
			if(first==a.length){
				for(int j=i;j<merge.length;j++){
				merge[j]=b[second];
				second++;
				}
				break;
			}
			if(second==b.length){
				for(int j=i;j<merge.length;j++){
				merge[j]=a[first];
				first++;
				}
				break;
			}
			if(a[first]>b[second]){
				merge[i]=b[second];
				second++;
			}
			else{
				merge[i]=a[first];
				first++;
			}
		}
		return merge;
	}
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
	public static void printArr(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter array 1");
		int a[]=takeInput();
		mergeSort(a);
		printArr(a);

	}
	public static void mergeSort(int input[]){
		if(input.length<=1){
			return ;
		}
		
		int firstHalf[]= new int[input.length/2];
		int secondHalf[]= new int[input.length-input.length/2];
		for(int i=0; i<firstHalf.length;i++){
			firstHalf[i]=input[i];
		}
		for(int j=0; j<secondHalf.length;j++){
			secondHalf[j]=input[(input.length/2)+j];
		}
		mergeSort(firstHalf);
		mergeSort(secondHalf);
		int [] ans=mergeSortedArrays(firstHalf, secondHalf);
		for(int i=0; i<ans.length; i++){
			input[i]=ans[i];
		}
	}
	

}
