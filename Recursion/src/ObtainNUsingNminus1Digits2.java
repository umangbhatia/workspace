
public class ObtainNUsingNminus1Digits2 {
	public static int[][] subsets(int n){
		int length=0;
		if(n<=0){
			int output[][] = new int[0][0];
			return output;
		}
		if(n==1){
			int output[][] = new int[1][1];
			output[0][0]= 1;
			return output;
		}
		for(int i=1; i<n;i++){
			length+=subsets(n-i).length;
		}
		int output[][]= new int[length+1][];
		output[0]= new int[1];
		output[0][0]=n;
		int count = 1;
		for(int i=1;i<n;i++){
			int smalloutput[][]= subsets(n-i);
			for(int j=0;j<smalloutput.length;j++){
				output[count] = new int[smalloutput[j].length+1];
				output[count][0]=i;
				for(int k=0;k<smalloutput[j].length;k++){
					output[count][k+1]=smalloutput[j][k];
				}
				count++;
			}
		}
		return output;
	}

	public static void print(int a[][]){
		for(int i=1;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		print(subsets(n));

	}

}
