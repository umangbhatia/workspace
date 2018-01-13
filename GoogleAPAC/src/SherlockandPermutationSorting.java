import java.util.Scanner;

public class SherlockandPermutationSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s  = new Scanner(System.in);
		int t = s.nextInt();
		for(int i=1;i<=t;i++){
			
			int n = s.nextInt();
			int m = s.nextInt();
			long ans = calc(n);
			System.out.println(" Case #"+i+": "+ans%m);
		}

	}

	private static long calc(int n) {
		if(n==1){
			return 1;
		}
		long ans = calc(n-1)*n + n*n-(n-1)*(n-1);
		return ans;
	}

}
