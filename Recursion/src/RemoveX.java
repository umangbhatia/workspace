import java.util.Scanner;

public class RemoveX {
	public static String remove(String str, int beginIndex){
		if(beginIndex==str.length()-1){
			if(str.charAt(beginIndex)=='x'){
				String ans="";
				return ans;
			}
			else{
				String ans=str.substring(beginIndex);
				return ans;
			}
		}
		if(str.charAt(beginIndex)=='x'){
			String ans=remove(str, beginIndex+1);
			return ans;
		}
		else{
			String ans=str.substring(beginIndex, beginIndex+1)+remove(str, beginIndex+1);
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
