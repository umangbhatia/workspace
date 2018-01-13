import java.util.Scanner;

public class StringCompression {
//	Write code to do basic string compression. e.g. Given aaabbccds print
//	out a3b2c2ds
	public static String takeInput(){
		System.out.println("Enter string");
		Scanner s = new Scanner(System.in);
		String str=s.next();
		return str;
	}
	public static void compress(String str){
		int count=1;
		String finalString="";
		for(int i=0;i<str.length();i++){
			count=1;
			for(int j=i+1;j<str.length();j++){
				if(str.charAt(i)==str.charAt(j)){
					count++;
				}
				if(str.charAt(i)!=str.charAt(j)){
					break;
				}
			}
			if(count==1){
				finalString+=str.charAt(i);
			}
			if(count>1){
				finalString+=str.charAt(i);
				finalString+=count;
			}
			i+=count-1;
		}
		System.out.println(finalString);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=takeInput();
		compress(str);

	}

}
