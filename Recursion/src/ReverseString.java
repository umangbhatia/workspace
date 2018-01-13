import java.util.Scanner;

public class ReverseString {
	public static String reverse( String str, int beginIndex){
		if(beginIndex==0){
			return str.substring(beginIndex, beginIndex+1);
	}
	String rev;
	rev=str.charAt(beginIndex)+reverse(str, beginIndex-1);
	return rev;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter string");
		Scanner s = new Scanner(System.in);
		String str=s.next();
		System.out.println(reverse(str, str.length()-1));

	}

}
