import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		7. Write a program to generate the reverse of a given number.
		System.out.println("Enter n");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int sum=0, i=1,r;
		while(1<=n){
			r=n%10;
			
			n=n/10;
			sum = r + 10*sum;
		}
		System.out.println("The reverse of the number is: "+sum);
	}

}
