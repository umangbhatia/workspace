import java.util.Scanner;

public class ReverseWordWise {
	public static String takeInput(){
		System.out.println("Enter string");
		Scanner s = new Scanner(System.in);
		String str=s.nextLine();
		return str;
	}
	public static void reverse(String str){
		int a[] = new int[str.length()];
		a[0]=-1;
		int j=1, count=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==' '){
				a[j]=i;
				j++;
				count++;

			}
		}

		a[j]=str.length();

		for(int k=0;k<count+1;k++){
			System.out.print(str.substring(a[j-1]+1, a[j])+" ");
			j--;
		}
	}


public static void main(String[] args) {
	// TODO Auto-generated method stub
	String str=takeInput();
	reverse(str);

}

}
