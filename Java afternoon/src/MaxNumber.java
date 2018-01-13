import java.util.Scanner;

public class MaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		To print maximum from n numbers
		Scanner s = new Scanner(System.in);
		System.out.println("Enter n");
		int n = s.nextInt();
		int i=1;
		int max=0;
		while(i<=n){
			System.out.println("Enter "+i+"number");
			int Number = s.nextInt();
			if (max<=Number){
				max = Number;
			}
			i++;
			
		}
		System.out.println("The maximum number is "+max);

	}

}
