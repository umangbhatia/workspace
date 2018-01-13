import java.util.Scanner;

public class CompareTwoStrings {
	public static boolean compare(String str1, String str2, int beginIndex){
		if(str1.length()!=str2.length()){
			return false;
		}
		if(beginIndex==str1.length()-1){
			if(str1.charAt(beginIndex)==str2.charAt(0)){
				return true;
			}
			else return false;
		}
		if(str1.charAt(beginIndex)==str2.charAt(str2.length()-1-beginIndex)){
			return compare(str1, str2, beginIndex+1);
		}
		else return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter string 1");
		Scanner s = new Scanner(System.in);
		String str1=s.next();
		System.out.println("Enter string 2");
		String str2=s.next();
		System.out.println(compare(str1, str2, 0));

	}

}
