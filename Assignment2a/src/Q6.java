import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter x");
		Scanner s = new Scanner(System.in);
				double x= s.nextDouble();
		System.out.println("Enter n");
		int n = s.nextInt();
		int i=1;
		double ans=1;
		while(i<=n){
			ans=ans*x;
			i=i+1;
		}
		System.out.println("The value is: "+ans);

	}

}
