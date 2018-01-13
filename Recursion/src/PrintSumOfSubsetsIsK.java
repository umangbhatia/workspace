import java.util.Scanner;

public class PrintSumOfSubsetsIsK {
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
	public static void print(int a[], int k, int subset[]) {
		if(k<0){
			return;
		}
		if(k==0){
			for(int i=0; i<subset.length;i++){
				System.out.print(subset[i]+" ");
			}
			System.out.println();
			return;
		}
		if(a.length==0){
			return;
		}
		int input[] = new int[a.length-1];
		for(int i =0;i<input.length;i++){
			input[i]=a[i+1];
		}
		int small[] = new int[subset.length+1];
		for(int i=0;i<subset.length;i++){
			small[i] = subset[i];
		}
		small[small.length-1]=a[0];
		print(input, k-a[0], small);
		print(input, k, subset);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=takeInput();
		System.out.println("Enter k");
		Scanner s = new Scanner(System.in);
		int k = s.nextInt();
		int subset[]={};
		print(a, k, subset);

	}

}
