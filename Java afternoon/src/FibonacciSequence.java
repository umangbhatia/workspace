import java.util.Scanner;

public class FibonacciSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter N");
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		int first=0, second=1;
		int third;
		third = first + second;
		System.out.print("0 ");
		while(first<n){
			third = first + second;
			first = second;
			second = third;
			if(first<=n){
			System.out.print(first+" ");
			}
			}
		}

	}


