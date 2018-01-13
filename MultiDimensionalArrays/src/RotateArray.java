import java.util.Scanner;

public class RotateArray {
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
public static int[][] rotate(int a[][]){
	int rotate[][]= new int[a[0].length][a.length];
	for(int i=0;i<a.length;i++){
		for(int j=0;j<a[0].length;j++){
			rotate[j][a.length-1-i]=a[i][j];
		}
	}
	return rotate;
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
		print(a);
		print(rotate(a));

	}

}
