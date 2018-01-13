import java.util.Scanner;

public class HighestOccuring {
	public static String takeInput(){
		System.out.println("Enter string");
		Scanner s = new Scanner(System.in);
		String str=s.nextLine();
		return str;
	}
	public static char highest(String str){
		int max=0;int k=0;
		for(int i=0;i<str.length();i++){
			int count=1;
			for(int j=i+1;j<str.length();j++){
				if(str.charAt(i)==str.charAt(j)){
					count++;
				}
			}
			if(count>max){
				max=count;
				k=i;
			}
		}
		System.out.println(max);
		return str.charAt(k);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=takeInput();
		System.out.println("The first highest occuring character is: "+highest(str));

	}

}
