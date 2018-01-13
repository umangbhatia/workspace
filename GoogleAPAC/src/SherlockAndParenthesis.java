import java.util.Scanner;
 class SherlockAndParenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		long out[] = new long[t];
		for(int i=1;i<=t;i++){
			long l = s.nextInt();
			long r = s.nextInt();
			out[i-1] = count(l,r);
		}
		for(int i=0;i<t;i++){
			System.out.println("Case #"+(i+1)+": "+out[i]);
		}

	}

	private static long count(long l, long r) {
		if(l<r){
			return l*(l+1)/2;
		}else{
			return r*(r+1)/2;
		}
	}
 }

//	private static long ans(int n, long a[]) {
//		if(n==0){
//			return 0;
//		}
//		if(n==1){
//			return 1;
//		}
//		if(a[n-1]!=0){
//			return a[n-1];
//		}else{
//			a[n-1] = n+ans(n-1, a);
//			return a[n-1];
//		}
//	}
//
//}
