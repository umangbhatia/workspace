import java.util.Scanner;

public class Q8b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	 b. 1
//		11
//		202
//		3003
//		40004
		System.out.println("enter number of rows");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println("1");
		int i=1,j=2;
		while(i<=n-1){
			System.out.print(i);
			j=2;
				while(j>1 && j<=i){
					System.out.print("0");
					j=j+1;
				}
				System.out.println(i);
				i=i+1;
			}
		}
	}


