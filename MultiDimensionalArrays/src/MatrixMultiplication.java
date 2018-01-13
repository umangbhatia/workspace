import java.util.Scanner;

public class MatrixMultiplication {
//	Write a program to multiply 2D arrays A and B of dimensions NxL and
//	LxM respectively
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
	public static int[][] multiply(int a[][], int b[][]){
		int answer[][]= new int[a.length][b[0].length];
		for(int i=0;i<answer.length;i++){
			for(int j=0;j<answer[0].length;j++){
				int sum=0;
				for(int k=0;k<b.length;k++){
					sum+=a[i][k]*b[k][j];
				}
				answer[i][j]=sum;
			}
		}
		return answer;
	}
	public static void print(int a[][]){
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[0].length;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]=takeInput2D();
		int b[][]=takeInput2D();
		print(multiply(a, b));
				

	}

}
