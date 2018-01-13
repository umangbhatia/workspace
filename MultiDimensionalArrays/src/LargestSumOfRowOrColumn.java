import java.util.Scanner;

public class LargestSumOfRowOrColumn {
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
	public static void findMax(int a[][]){
		int max=0;
		String str="";
		for (int i=0;i<a.length;i++){
			int sum=0;
			for(int j=0;j<a[0].length;j++){
				sum+=a[i][j];
			}
			if (sum>=max){
				max=sum;
				str=i+"row";
			}
			
		}
		for (int j=0;j<a[0].length;j++){
			int sum=0;
			for(int i=0;i<a.length;i++){
				sum+=a[i][j];
			}
			if (sum>=max){
				max=sum;
				str=j+" column ";
			}
			
		}
		System.out.println("The"+str+"is max. Sum is: "+max);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]=takeInput2D();
		findMax(a);

	}

}
