import java.util.Scanner;

public class CountZeroes {
//	Count number of zeros in an integer. Use Recursion.

	public static int count(int n){
		
		if(n==0){
			return 1;
		}
		if(n<10){
			return 0;
		}
		int count=count(n/10);
		int r=n%10;
		if(r==0){
			count++;
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter n");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(count(n));

	}

}
