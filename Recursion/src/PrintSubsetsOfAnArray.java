import java.util.Scanner;

public class PrintSubsetsOfAnArray {
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
	public static void print(int a[], int subset[]) {
		if(a.length==0){
			for(int i=0;i<subset.length;i++){
				System.out.print(subset[i]+" ");	
				
			}
			System.out.println();
			return;
		}
		int small[] = new int[subset.length+1];
		for(int i=0;i<subset.length;i++){
			small[i] = subset[i];
		}
		small[small.length-1] = a[0];
		int input[] = new int[a.length-1];
		for(int i =0;i<input.length;i++){
			input[i]=a[i+1];
		}
		print(input, small);
		print(input, subset);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= takeInput();
		int subset[]={};
		print(a, subset);

	}

}
