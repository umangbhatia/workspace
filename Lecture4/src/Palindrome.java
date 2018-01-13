import java.util.Scanner;

public class Palindrome {
	public static String takeInput(){
		System.out.println("Enter string");
		Scanner s = new Scanner(System.in);
		String str=s.next();
		return str;
	}
public static boolean Pal(String str){
	for(int i=0,j=str.length()-1;i<j;i++,j--){
		if(str.charAt(i)!=str.charAt(j)){
			return false;
		}
	}
	return true;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=takeInput();
		System.out.println(Pal(str));

	}

}
