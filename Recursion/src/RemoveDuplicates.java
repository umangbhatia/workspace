import java.util.Scanner;

public class RemoveDuplicates {
	public static String remove(String str, int beginIndex){
		if(beginIndex==str.length()-1){
			return str.substring(str.length()-1);
		}
		if(beginIndex>str.length()-1){
			return "";
		}
		if(str.charAt(beginIndex)==str.charAt(beginIndex+1)){
			String ans=str.charAt(beginIndex)+remove(str, beginIndex+2);
			return ans;
		}
		else{
			String ans=str.charAt(beginIndex)+remove(str, beginIndex+1);
			return ans;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter string");
		Scanner s = new Scanner(System.in);
		String str=s.next();
		System.out.println(remove(str, 0));

	}

}
