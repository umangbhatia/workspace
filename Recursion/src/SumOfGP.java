import java.util.Scanner;

public class SumOfGP {
	public static double sumGP(int k){
		if(k==0){
			return 1;
		}
		double sum=1/Math.pow(2, k) + sumGP(k-1);
		return sum;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter n");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(sumGP(n));


	}

}
