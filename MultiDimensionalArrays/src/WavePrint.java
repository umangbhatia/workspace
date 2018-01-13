import java.util.Scanner;

public class WavePrint {

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
	public static void wave(int a[][]){
		for(int j=0;j<a[0].length;j++){
			if(j%2==0){
				for(int i=0;i<a.length;i++){
					System.out.print(a[i][j]+" ");
				}
			}
			if(j%2==1){
				for(int i=a.length-1;i>=0;i--){
					System.out.print(a[i][j]+" ");
				}
			}

		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]=takeInput2D();
		wave(a);

	}

}
