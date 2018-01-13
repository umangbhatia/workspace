import java.util.Scanner;

public class NoConsecutiveDuplicates {
//	Take a String input from user and return a String that does not contain
//			consecutive duplicates. For example, for input "aabccbaa" return
//			"abcba"
	
	public static String takeInput(){
		System.out.println("Enter string");
		Scanner s = new Scanner(System.in);
		String str=s.next();
		return str;
	}
	public static String check(String str){
		String finalString="";
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==str.charAt(i+1)){
				i++;
				
			}
			finalString=finalString+str.charAt(i);
		}
		return finalString;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=takeInput();
		System.out.println(check(str));

	}

}
