import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println("Hello World!");
//		System.out.println("df");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter n:");
		int n = s.nextInt();
		int sum = 0;
		int next = 1;
		while(next <=n){
			sum = sum + next;
			next=next + 1;
		}
		System.out.println(sum);
				
				
		}
		
		
	}
