import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		You are given S a sequence of n integers S = s1, s2, ..., sn.
		//				Please, compute if it is possible to split S into two parts : s1, s2,
		//				..., si and si+1, si+2, ….., sn
		//				(1 <= i < n) in such a way that the first part is strictly decreasing
		//				while the second is strictly increasing one. First take n as input
		//				and then take n more integers, output yes or no.
		System.out.println("Enter n");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i=1,j=0,max=0;
		while(i<=n){
			System.out.println("Enter number "+i);
			int num=s.nextInt();
			if(i==1){
				max=num;
			}
			if(num>max){
				max=num;
			}
			if(i>=2){
				if(max==num){
					int k=i+1;
					j++;
					while(k<=n){
						System.out.println("Enter number "+k);
						num=s.nextInt();
						if(num>max){
							max=num;
							k=k+1;
						}
						if(num<max){
							System.out.println("no");
							return;
						}
						if(k==n+1){
							System.out.println("yes");
							return;
						}

					}
				}
			}
			i++;
			max=num;
		}
		if(j==0){
			System.out.println("no");
		}

	}

}
