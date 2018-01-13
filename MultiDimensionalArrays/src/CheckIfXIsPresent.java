import java.util.Scanner;

public class CheckIfXIsPresent {
	public static boolean check(int a[][], int rowNum, int x, int colNum){
		if(colNum==0&&rowNum==a.length-1){
			if(a[rowNum][colNum]==x){
				return true;
			}
			else return false;
		}
		if(a[rowNum][colNum]==x){
			return true;
		}
		if(x>a[rowNum][colNum]){
			for(int i=rowNum+1;i<a.length;i++){
				if(a[i][colNum]==x){
					return true;
				}
			}
			
		}
		if(x<a[rowNum][colNum]){
			for(int i=colNum-1;i>=0;i--){
				if(a[rowNum][i]==x){
					return true;
				}
			}
			
		}
		check(a, rowNum+1, x, colNum-1);
		return false;
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
		int x=10;
		System.out.println(check(a, 0, x, a.length-1));

	}

}
