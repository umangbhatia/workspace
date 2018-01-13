import java.util.Scanner;

public class Substrings {
	public static String takeInput(){
		System.out.println("Enter string");
		Scanner s = new Scanner(System.in);
		String str=s.next();
		return str;
	}
	public static void substr(String str){
		for(int i=0;i<str.length();i++){
			for(int j=i;j<str.length()+1;j++){
				System.out.print(str.substring(i, j)+" ");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=takeInput();
		substr(str);

	}

}
