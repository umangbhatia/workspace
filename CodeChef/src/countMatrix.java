import java.io.IOException;
import java.util.Scanner;

 class countMatrix {
	public static int count(int a[][]){
		int n = a.length;
		int steps = 0;
		int xp = 0;
		int yp = 0;
		for(int i=1;i<=n*n;i++){
			int x = 0;
			int y = 0;
			for(int j=0;j<n;j++){
				for(int k=0;k<n;k++){
					if(a[j][k]==i){
						x = j;
						y = k;
					}
				}
			}
			if(i!=1){
				steps+=Math.abs(x-xp)+Math.abs(y-yp);
			}
			xp = x;
			yp = y;
		}
		return steps;
	}
	public static int[][] takeInput2D(){
//		System.out.println("Enter number of rows");
		Scanner s = new Scanner(System.in);
		int numRows= s.nextInt();
//		System.out.println("Enter number of columns");
		int numCols = numRows;
		int input[][]= new int[numRows][numCols];
		for(int i=0;i<numRows;i++){
			for (int j=0;j<numCols;j++){
//				System.out.println("Enter value of"+i+"row and "+j+" column");
				input[i][j]=s.nextInt();
			}
		}
		return input;
	}

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
			Scanner s = new Scanner(System.in);
			int T = s.nextInt();
			for(int i=0;i<T;i++){
			int a[][] = takeInput2D();
			System.out.println(count(a));
			}
            
       
        }
		
		
	}


