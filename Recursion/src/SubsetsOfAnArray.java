import java.util.Scanner;

public class SubsetsOfAnArray {

	public static int[][] subsets(int a[], int beginIndex){
		if(beginIndex==a.length-1){
			int output[][]= new int[1][1];
			output[0][0]= a[beginIndex] ;
			return output;
		}
		int smallOutput[][]=subsets(a, beginIndex+1);
		int output[][]= new int[2*smallOutput.length+1][];
		for(int i=0; i<smallOutput.length; i++){
			output[i]= new int[smallOutput[i].length];
			for(int j=0; j<output[i].length;j++){
				output[i][j]=smallOutput[i][j];
			}
		}
		for(int i=0; i<smallOutput.length; i++){
			output[smallOutput.length+i]= new int[smallOutput[i].length+1];
			output[smallOutput.length+i][0]=a[beginIndex];
		}
		for(int i=0; i<smallOutput.length;i++){
			
			for(int j=1;j<output[i+smallOutput.length].length;j++){
				output[i+smallOutput.length][j]=smallOutput[i][j-1];
			}
		}
		
		output[2*smallOutput.length]= new int[1];
		output[2*smallOutput.length][0]= a[beginIndex];
		return output;
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
	public static void print(int a[][]){
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=takeInput();
//		System.out.println("Enter k");
		Scanner s = new Scanner(System.in);
//		int k = s.nextInt();
		print(subsets(a, 0));

	}

}
