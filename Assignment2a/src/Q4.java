import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a program to calculate the roots of a quadratic
//		equation 2ax+bx+c=0, display them on the screen specifying
//		their nature.
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a");
		int a = s.nextInt();
		System.out.println("Enter b");
		int b = s.nextInt();
		System.out.println("Enter c");
		int c = s.nextInt();
		double root1, root2;
		double D = b*b-8*a*c;
		if(D<0 && a!=0){
//			D= -D;
//			root1 = (-b + java.lang.Math.sqrt(D))/4*a;
//			root2 = (-b - java.lang.Math.sqrt(D))/4*a;
			System.out.println("Imaginary roots");
		}
		if(D>=0 && a!=0){
			root1 = (-b + java.lang.Math.sqrt(D))/4*a;
			root2 = (-b - java.lang.Math.sqrt(D))/4*a;
			System.out.println("roots are real and they are: "+root1+" "+root2);
		}
		if(a==0){
			root1=root2=-b/c;
			System.out.println("roots are real and they are: "+root1+" "+root2);
			
		}
	}

}
