import java.util.Scanner;

public class PrintSubsequences {
	public static void print(String str, String strSoFar){
		if(str.length()==0){
			System.out.print(strSoFar+" ");
			return;
		}
			print(str.substring(1), strSoFar+str.charAt(0));
			print(str.substring(1),strSoFar);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter string");
		Scanner s = new Scanner(System.in);
		String str=s.next();
		print(str, "");

	}

}
