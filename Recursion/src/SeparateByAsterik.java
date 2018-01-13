import java.util.Scanner;

public class SeparateByAsterik {
	public static String separate(String str, int beginIndex){
		if(beginIndex==str.length()-2){
			if(str.charAt(beginIndex)==str.charAt(beginIndex+1)){
				String ans=str.charAt(beginIndex)+"*"+str.charAt(beginIndex+1);

				return ans;
			}
			else{
				String ans=str.substring(beginIndex, str.length());
				return ans;
			}
		}
		if(str.charAt(beginIndex)==str.charAt(beginIndex+1)){
			String ans=str.charAt(beginIndex)+"*"+separate(str, beginIndex+1);
			return ans;
		}
		else{
			String ans=str.substring(beginIndex, beginIndex+1)+separate(str, beginIndex+1);
			return ans;
		}

	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter string");
		Scanner s = new Scanner(System.in);
		String str=s.next();
		System.out.println(separate(str, 0));

	}

}
