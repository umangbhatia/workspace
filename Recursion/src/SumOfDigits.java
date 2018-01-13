import java.util.Scanner;

public class SumOfDigits {
	public static int sum(int n){
		if(n==0){
			return 0;
		}
		int r=n%10;
		int sum = r + sum(n/10);
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter n");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(sum(n));

	}

}
