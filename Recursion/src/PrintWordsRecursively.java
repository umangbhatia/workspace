import java.util.Scanner;

public class PrintWordsRecursively {
	public static void print(int n){
		if(n==0){
			return;
		}
			print(	n/10);
			int r=n%10;
			if(r==1){
				System.out.print(" one");
			}
			if(r==2){
				System.out.print(" two");
			}if(r==3){
				System.out.print(" three");
			}if(r==4){
				System.out.print(" four");
			}if(r==5){
				System.out.print(" five");
			}if(r==6){
				System.out.print(" six");
			}if(r==7){
				System.out.print(" seven");
			}if(r==8){
				System.out.print(" eight");
			}if(r==9){
				System.out.print(" nine");
			}if(r==0){
				System.out.print(" zero");
			}

		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter n");
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		print(n);

	}

}
