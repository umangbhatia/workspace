import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter n");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 2, r;
		while (i<n){
			r = n%i;
			if (r==0){
				System.out.println(n+" is Not Prime");
				return;
				
			}
			else {
				i++;
			}
		}
		System.out.println(n+" is prime");
		return;
		

	}

}
