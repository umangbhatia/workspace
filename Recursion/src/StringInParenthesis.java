import java.util.Scanner;

//"xyz(abc)12345
public class StringInParenthesis {
	public static String output(String str,int beginIndex){
		int k=str.length();
		if(str.charAt(beginIndex)==')'){
			return ")";
		}
		for(int i=0;i<=beginIndex;i++){
			if(str.charAt(i)=='('){
				k=i;
				break;
			}
		}
		if(beginIndex>=k){
		String ans=str.charAt(beginIndex)+output(str, beginIndex+1);
		return ans;
	}
		return ""+output(str, beginIndex+1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter string");
		Scanner s = new Scanner(System.in);
		String str=s.next();
		System.out.println(output(str, 0));

	}

}
