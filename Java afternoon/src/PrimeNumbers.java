import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter n");
		int n = s.nextInt();
		int i=2;
		while(i<=n){
			int r=0;
			int j=2;
			while(j<i){
				r = i%j;
				if(r==0){
					break;}

				else{

					j=j+1;
				}
			}
			if(j==i)
			{System.out.print(i+" ");
	}

			i=i+1;
		}
	}

}


