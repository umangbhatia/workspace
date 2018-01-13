
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a program to print first 20 terms of the series 3n+2 which
//		are not multiples of 4.
		int n=1;
		int k , i=0;
		
		
		while(n>=1){
			k= 3*n +2;
		if(k%4!=0){
			System.out.print(k+" ");
			i=i+1;
		}
		n=n+1;
		if(i==20){
			return;
		}
	}

}
}
