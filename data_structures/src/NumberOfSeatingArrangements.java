import java.util.Scanner;

public class NumberOfSeatingArrangements {
	public static int number(int n){
		if(n==1){
			return 1;
		}else{
			return number(n, n);
		}
	}

	private static int number(int h, int w) {
		// TODO Auto-generated method stub
		int ans=0;
		if(h==0){
			return 1;
		}
		ans+=number(h-1, w);
		if(w>h){
			ans+=number(h, w-1);	
		}
		
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(number(n));
		

	}

}
