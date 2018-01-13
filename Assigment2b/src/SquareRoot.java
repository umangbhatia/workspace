import java.util.Scanner;

public class SquareRoot {
	public static double sqroot(int num, int n){
		int x=1,pow=1;
		double y = 0;
		while(true){
			if(x*x<=num){
				x++;
			}
			if(x*x>num){
				break;
			}
		}
		if(n==0){
			return x-1;
		}
		while(true){
			int j=0;
			while(pow<=n){
				y=x-1+j/Math.pow(10,pow);
				if(y*y<=num){
					j++;
				}
				if(y*y>num){
					pow++;
					j--;
					break;
				}
			}
			if(pow>n){
				break;
			}
		}
		return y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		System.out.println("Enter number of decimal places");
		int n = s.nextInt();
		double sqrt=sqroot(num, n);
		System.out.println("the sq root is: "+sqrt);

	}

}
