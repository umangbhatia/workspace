import java.util.Scanner;

public class CheckForPi2 {
	public static String check(String str, int beginIndex){
		if(beginIndex>=str.length()-2){
			if(str.charAt(beginIndex)=='p'&&str.charAt(beginIndex+1)=='i'){
				String ans="3.14";
				return ans;
			}
			else{
				String ans=str.substring(beginIndex, str.length());
				return ans;
			}
		}
		if(str.charAt(beginIndex)=='p'&&str.charAt(beginIndex+1)=='i'){
			String ans="3.14"+check(str, beginIndex+2);
			return ans;
		}
		else{
			String ans=str.substring(beginIndex, beginIndex+1)+check(str, beginIndex+1);
			return ans;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter string");
		Scanner s = new Scanner(System.in);
		String str=s.next();
		System.out.println(check(str, 0));

	}

}
