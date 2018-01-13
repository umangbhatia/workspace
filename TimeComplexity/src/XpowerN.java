import java.util.Scanner;

public class XpowerN {
	public static int power(int x, int n){
		if(n==1){
			return x;
		}
		int r=n%2;
		if(r==0){
			int k=power(x, n/2);
			return k*k;
		}
		else{
			int k=power(x, n/2);
			return k*k*x;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter x");
		Scanner s = new Scanner(System.in);
				int x= s.nextInt();
		System.out.println("Enter n");
		int n = s.nextInt();
		System.out.println(power(x, n));

	}

}
