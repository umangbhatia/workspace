import java.util.Scanner;

public class EntranceExam {
	public static int min(int a[][], int n, int k){
		int sum[] = new int[a.length];
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				sum[i]+=a[i][j];
			}
		}
		int sort[] = new int[sum.length-1];
		for(int i=0; i<sort.length;i++){
			sort[i]=sum[i];
	}
		mergeSort(sort);
		int x = sum[sum.length-1];
		int ans = -x+sort[n-k-1]+1;
		return ans;
	}
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
	


	public static int[][] takeInput2D(){
		System.out.println("Enter number of rows");
		Scanner s = new Scanner(System.in);
		int numRows= s.nextInt();
		System.out.println("Enter number of columns");
		int numCols = s.nextInt();
		int input[][]= new int[numRows][numCols];
		for(int i=0;i<numRows;i++){
			for (int j=0;j<numCols;j++){
				System.out.println("Enter value of"+i+"row and "+j+" column");
				input[i][j]=s.nextInt();
			}
		}
		return input;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = takeInput2D();
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int n = s.nextInt();
		int k = s.nextInt();
		int ans = min(a, n, k);

	}

}
