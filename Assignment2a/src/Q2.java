import java.util.Scanner;

public class Q2 {

public static void main(String[] args) {
//		// TODO Auto-generated method stub
	System.out.println("Enter an alphabet");
		Scanner s = new Scanner(System.in);
		char a = s.next().charAt(0);
		if(a>=65 && a<=90){
			System.out.println("You've entered a capital letter");
			return;
		}
		if(a>=97 && a<=122){
			System.out.println("You've entered a small letter");
			return;
		}
		System.out.println("Invalid entry");
	}

}
