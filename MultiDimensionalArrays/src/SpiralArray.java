import java.util.Scanner;

public class SpiralArray {
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
	public static void spiral(int a[][]){
		int rowLength=a[0].length;
		int colLength=a.length;
		int k=0,l=1,x=0,y=0;
		while(true){
			int count=0;
			for(int i=k;i<colLength;i++){
				System.out.print(a[i][y]+" ");
			}
			colLength--;
			k++;
			y++;
			for(int j=l;j<rowLength;j++){
				System.out.print(a[colLength][j]+" ");
			}
			rowLength--;
			l++;
			for(int i=colLength-1;i>=x;i--){
				System.out.print(a[i][a[0].length-l+1]+" ");
			}
			for(int j=rowLength-1;j>=k;j--){
				System.out.print(a[x][j]+" ");
				count++;
			}
			x++;
			if(count==0){
				break;
			}
			
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]=takeInput2D();
		spiral(a);

	}

}
