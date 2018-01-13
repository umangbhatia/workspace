import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter n");
		int n = s.nextInt();
		int i=1, k=1;
		while(i<=n){
			int j=1;
			while(j<=i){
				System.out.print(k);
				j++;
				k++;
			}
			i++;
			System.out.println();
		}

	}

}
