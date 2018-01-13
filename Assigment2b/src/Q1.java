import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a program that asks the user for a number n and gives
//		him the possibility to choose between computing the sum
//		and computing the product of 1,...,n.
		
		System.out.println("Enter n");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println("choose between computing the sum and computing the product of 1,...,n.");
		System.out.println("Type 'sum' for sum and 'product' for product");
		String option = s.nextLine();
		if(option == "sum"){
			int sum = 0, i=1;
			while(i<=n){
				sum=sum+i;
				i=i+1;
			}
			System.out.println("The sum is: "+sum);
		}
		if(option=="product"){
			int product = 1,j=1;
			while(j<=n){
				product=product*j;
				j=j+1;
			}
			System.out.println("The product is: "+product);
		}
	}

}
