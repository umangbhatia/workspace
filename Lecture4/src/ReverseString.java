import java.util.Scanner;

public class ReverseString {
	public static String takeInput(){
		System.out.println("Enter string");
		Scanner s = new Scanner(System.in);
		String str=s.nextLine();
		return str;
	}
	public static void reverse(String str){
		for(int i=str.length()-1;i>=0;i--){
			System.out.print(str.charAt(i));
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=takeInput();
		reverse(str);

	}

}
