import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a program to find square root of an input.
//		a. Just find the integral part
		System.out.println("Enter number");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k=n,i=0,q,x,sum=0,y,a=0,z=0,b,c;
		b=0;
		while(k>=1){
			k=k/10;
			i=i+1;
		}
//		System.out.println(i);
		
		
		
		if(i%2==0){
			while(i>0){
				q=(int)(n/Math.pow(10,(i-2)));
				x=1;
				c=100*b+q;
				while(n>0){
					
					y=sum*20+x;
					z=y*x;
					if(z>c){
					 a=x-1;
						break;
					}
					x=x+1;
				}
				sum=sum*10+a;
				n=n-q*(int)(Math.pow(10,(i-2)));
				i=i-2;
				b=q-z;
			}
		}
		System.out.println(sum);
	}

}
