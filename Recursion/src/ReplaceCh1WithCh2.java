import java.util.Scanner;

public class ReplaceCh1WithCh2 {
	public static String replace(String str, char ch1, char ch2){
		String output=str;
		for(int i=0; i<str.length();i++){
			if(str.charAt(i)==ch1){
				String ans;
				ans = str.substring(0, i)+ch2+str.substring(i+1);
				output=ans;
				return replace(ans, ch1, ch2);
			}
			if(i==str.length()-1){
				return output;
			}
		}
		return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter string");
		Scanner s = new Scanner(System.in);
		String str=s.next();
		System.out.println("Enter character 1");
		char ch1=s.next().charAt(0);
		System.out.println("Enter character 2");
		char ch2=s.next().charAt(0);
		System.out.println(replace(str, ch1, ch2));

	}

}
