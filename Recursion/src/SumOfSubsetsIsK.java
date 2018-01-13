import java.util.Scanner;

public class SumOfSubsetsIsK {
	public static int[][] sumsubsets(int a[], int k, int bi){
		if(bi==a.length){
			if(k==0){
				int [][] output= new int[1][0];
//				output[0][0]=a[bi];
				return output;
			}
			else{
				int [][] output= new int[0][0];
				return output;
			}
		}
		int [][] smalloutput = sumsubsets(a, k, bi+1);
		int [][] smallinput = sumsubsets(a, k-a[bi], bi+1);
		int[][] output= new int[smalloutput.length+smallinput.length][];
		for(int i=0; i<smalloutput.length;i++){
			output[i]= new int[smalloutput[i].length];
			for(int j=0;j<smalloutput[i].length;j++){
				output[i][j]=smalloutput[i][j];
			}
		}
		for(int i=0;i<smallinput.length; i++){
			output[smalloutput.length+i] = new int[smallinput[i].length+1];
			output[smalloutput.length+i][0] = a[bi];
			for(int j=1; j<=smallinput[i].length; j++){
				output[smalloutput.length+i][j]=smallinput[i][j-1];
			}	
		}
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
		System.out.println("Enter k");
		Scanner s = new Scanner(System.in);
		int k = s.nextInt();
		print(sumsubsets(a, k, 0));

	}

}
