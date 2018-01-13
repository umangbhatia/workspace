
public class ObtainNUsingNminus1Digits {
	public static int[][] subsets(int n,int bi){
		if(n==2){
			int output[][] = new int[1][2];
			output[0][0]= 1;
			output[0][1]= 1;
			return output;
		}
		if(bi==n-1){
			int output[][] = new int[1][2];
			output[0][0]= bi;
			output[0][1]= 1;
			return output;
		}
		int count = 0, length=0;;
		for(int i=1; i<n-1;i++){
			length+=subsets(n-i, 1).length;
		}
		int bigoutput[][]=new int[length][];
		for(int k=1; k<n;k++){
			int smalloutput[][] = subsets(n-k, k);
			int output[][]= new int[smalloutput.length+1][];
			output[0]= new int[2];
			output[0][0]=k;
			output[0][1]=n-k;
			for(int i=1; i<output.length;i++){
				output[i]=new int[smalloutput[i].length+1];
				output[i][0]=k;
				for(int j=1;j<output[i].length;j++){
					output[i][j]=smalloutput[i][j-1];
				}

			}
			for(int i=0; i<output.length;i++){
				bigoutput[count]=new int[output[i].length];

				for(int j=0;j<output[i].length;j++){
					bigoutput[count][j]=output[i][j];
				}
				count++;
			}
		}

		//		output[output.length-1] = new int[2];
		//		output[output.length-1][0]=bi;
		//		output[output.length-1][1]=n-bi;

		return bigoutput;


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
		int n=4;
		print(subsets(n, 1));

	}

}
