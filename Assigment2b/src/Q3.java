import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Given a binary number convert it into decimal
		System.out.println("Enter binary number");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int sum=0,r;
		int d=1;
		while(n>=1){
			r=n%10;
			n=n/10;
			sum = sum + d*r;
			d=d*2;
		}
System.out.println("The decimal number is; "+sum);
	}

}
