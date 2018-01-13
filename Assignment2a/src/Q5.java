import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter N");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1, r;
		int sumEven=0, sumOdd=0;
		while(i>=1){
			i=n/10;
			r=n%10;
			n=n/10;
			if(r%2==0){
				sumEven = sumEven +r;
			}
			if(r%2==1){
				sumOdd = sumOdd + r;
			}

		}
		System.out.println("Sum of even digits: "+sumEven);
		System.out.println("Sum of odd digits: "+sumOdd);


	}

}
