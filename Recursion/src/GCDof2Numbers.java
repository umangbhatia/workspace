import java.util.Scanner;

public class GCDof2Numbers {
	public static int gcd(int a, int b, int n){
		if(n==1){
				return n;
		}
		if(b%n==0&a%n==0){
			return n;
		}
		else return gcd(a, b, n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter first number");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		System.out.println("Enter second number");
		int b=s.nextInt();
		if(a<b){
			System.out.println("GCD is: "+gcd(a, b, a));
		}
		else System.out.println("GCD is: "+gcd(a, b, b));

	}

}
