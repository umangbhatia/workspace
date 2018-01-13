import java.util.Scanner;

public class PrintNumberKeypad {
	public static void print(int n, String decisionSoFar, String[] options){
		if(n==0){
			System.out.print(decisionSoFar+" ");
			return;
		}
		int r=n%10;
		String firstStringOptions = options[r];
		for(int i =0; i<firstStringOptions.length(); i++){
			print(n/10, decisionSoFar+firstStringOptions.charAt(i), options);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter n");
		String options[]={"","","abc","def","ghi"};
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int sum=0, i=1,r;
		while(1<=n){
			r=n%10;
			
			n=n/10;
			sum = r + 10*sum;
		}
		print(sum, "", options);

	}

}
