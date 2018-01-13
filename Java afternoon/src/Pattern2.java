import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter n");
		int n = s.nextInt();
		int i= 1;
		while(i<=n){
			int j=1, k=i;
			while(j<=n-i){
				System.out.print(" ");
				j=j+1;
			}
			while(j<=n){
				System.out.print(k);
				k=k+1;
				j=j+1;
			}
			k=k-2;
			while(j<=n+i-1){
				System.out.print(k);
				k=k-1;
				j=j+1;
			}
			i=i+1;
			System.out.println("\n");
		}

	}

}
