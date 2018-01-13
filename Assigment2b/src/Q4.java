import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Given a decimal convert it into binary
		System.out.println("Enter decimal number");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int sum=0,r;
		int d=1;
		while(n>=1){
			r=n%2;
			n=n/2;
			sum = sum + d*r;
			d=d*10;
		}
		System.out.println("The binary number is; "+sum);
	}

}
