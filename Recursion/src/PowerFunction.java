import java.util.Scanner;

public class PowerFunction {
	public static int power(int x, int n){
		if(n==0){
			return 1;
		}
		
		return x*power(x, n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter x");
		Scanner s = new Scanner(System.in);
		int x=s.nextInt();
		System.out.println("enter n");
		int n=s.nextInt();
		System.out.println(power(x, n));

	}

}
