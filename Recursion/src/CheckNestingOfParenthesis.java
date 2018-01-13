import java.util.Scanner;

public class CheckNestingOfParenthesis {
	public static boolean check(String str, int beginIndex, int endIndex)
	{
		if(str.charAt(beginIndex)==')'){
			int count1=0, count2=0;
			for(int i=0;i<beginIndex;i++){
				if(str.charAt(i)=='('){
					count1++;
				}
			}
			for(int i=beginIndex;i<str.length();i++){
				if(str.charAt(i)==')'){
					count2++;
				}
			}
			if(count1==count2){
				return true;
			}
			return false;
		}
		if(str.charAt(beginIndex)=='('){
			for(int i=endIndex;i>=0;i--){
				if(str.charAt(i)==')'){
					return check(str, beginIndex+1, i-1);
				}
			}
			return false;
		}
		return check(str, beginIndex+1, endIndex);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter string");
		Scanner s = new Scanner(System.in);
		String str=s.next();
		System.out.println(check(str, 0, str.length()-1));

	}

}
