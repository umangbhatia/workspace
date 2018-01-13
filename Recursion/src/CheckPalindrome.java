import java.util.Scanner;

public class CheckPalindrome {
	public static boolean check(String str, int BI, int EI){
		if(BI>=EI){
			return true;
		}
		if(str.charAt(BI)==str.charAt(EI)){
			return check(str, BI+1, EI-1);
		}
		else{
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter string");
		Scanner s = new Scanner(System.in);
		String str=s.next();
		System.out.println(check(str, 0, str.length()-1));

	}

}
