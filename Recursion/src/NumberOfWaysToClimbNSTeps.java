import java.util.Scanner;

public class NumberOfWaysToClimbNSTeps {
	public static int steps(int n){
		int sum=0;
		if(n==3){
			return 4;
		}
		if(n==2){
			return 2;
		}
		if(n==1){
			return 1;
		}
		if(true){//3
			sum+=steps(n-3);
		}
		if(true){//2
			sum+=steps(n-2);
		}
		if(true){//1
			sum+=steps(n-1);
		}
		return sum;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter n");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(steps(n));

	}

}
