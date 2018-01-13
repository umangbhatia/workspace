import java.io.IOException;
import java.util.Scanner;

class SumsInATriangle {
	public static int sum(int a[][], int[][] storage){
		return sum(a,storage, 0, 0);

	}

	private static int sum(int[][] a, int[][] storage, int i, int j) {
		if(a.length==1){
			return a[0][0];
		}
		if(storage[i][j]!=-1)
			return storage[i][j];
		else{

			int sum1 = a[0][0];
			int sum2 = a[0][0];
			int a1[][] = new int[a.length-1][];
			for(int k=0;k<a1.length;k++){
				a1[k] = new int[k+1];
				for(int l=0;l<k+1;l++){
					a1[k][l] = a[k+1][l];
				}
			}
			int a2[][] = new int[a.length-1][];
			for(int k=0;k<a2.length;k++){
				a2[k] = new int[k+1];
				for(int l=0;l<k+1;l++){
					a2[k][l] = a[k+1][l+1];
				}
			}

			sum1+=sum(a1, storage, i+1, j);
			sum2+=sum(a2, storage, i+1, j+1);
			if(sum1>sum2){
				storage[i][j]=sum1;
			}else{
				storage[i][j]=sum2;
			}
			return storage[i][j];
		}
	}

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int cases = s.nextInt();

		try {
			while(cases!=0){
				int rows = s.nextInt();
				int storage[][] = new int[rows][];
				int a[][] = new int[rows][];
				for(int i=1;i<=rows;i++){
					storage[i-1] = new int[i];
					a[i-1] = new int[i];
					for(int j=0;j<i;j++){
						a[i-1][j] = s.nextInt();
						storage[i-1][j]=-1;
					}

					int sum =  sum(a, storage);
					System.out.println(sum);
				}
			}
		}
		catch (Exception e) {
			return;
		}



	}
}


//if(a.length==1){
//return a[0][0];
//}
//int sum1 = a[0][0];
//int sum2 = a[0][0];
//int a1[][] = new int[a.length-1][];
//for(int i=0;i<a1.length;i++){
//a1[i] = new int[i+1];
//for(int j=0;j<i+1;j++){
//a1[i][j] = a[i+1][j];
//}
//}
//int a2[][] = new int[a.length-1][];
//for(int i=0;i<a2.length;i++){
//a2[i] = new int[i+1];
//for(int j=0;j<i+1;j++){
//a2[i][j] = a[i+1][j+1];
//}
//}
//sum1+=sum(a1);
//sum2+=sum(a2);
//if(sum1>sum2){
//return sum1;
//}else{
//return sum2;
//}
//
//
//int sum1 = a[i][j];
//int sum2 = a[i][j];
//int a1[][] = new int[a.length-i-1][];
//for(int k=0;k<a1.length;k++){
//	a1[k] = new int[k+1];
//	for(int l=0;l<k+1;l++){
//		a1[k][l] = a[k+1+i][l+j];
//	}
//}
//int a2[][] = new int[a.length-i-1][];
//for(int k=0;k<a1.length;k++){
//	a2[k] = new int[k+1];
//	for(int l=0;l<k+1;l++){
//		a2[k][l] = a[k+1+i][l+j];
//	}
//}
