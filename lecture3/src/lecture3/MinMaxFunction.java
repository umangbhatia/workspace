package lecture3;

import java.util.Scanner;

public class MinMaxFunction {
	public static int max(int n){
		int max = 0;
		if(n>=max){
			max=n;
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter n");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i=1;
		int maximum=0;
		while(i<=n){
			System.out.println("Enter number "+i);
			int num=s.nextInt();
			maximum = max(num);
			i=i+1;
			
		}
System.out.println("The maximum number is: "+maximum);
	}

}
