import java.util.Scanner;

public class MultiplyMandN {
//	Multiply two numbers m & n using only addition & subtraction. Use
//	Recursion.
	public static int multiply(int m, int n){
		if(n==1){
			return m;
		}
		int ans=m+multiply(m,n-1);
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter M");
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		System.out.println("Enter n");
		int n = s.nextInt();
		System.out.println(multiply(m, n));

	}

}
