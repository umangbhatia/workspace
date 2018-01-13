import java.util.Scanner;

//Write a recursive function that checks if the string was generated
//using the following rules -
//b. the string begins with an 'a'
//c. each 'a' is followed by nothing or an 'a' or "bb"
//d. each "bb" is followed by nothing or an 'a'
public class CheckString {
	public static boolean check(String str, int beginIndex){
		if(beginIndex==0){
			if(str.charAt(0)!='a'){
				return false;
			}
		}
		if(beginIndex==str.length()-1){
			if(str.charAt(beginIndex)=='a'){
			return true;
			}
			return false;
		}
		if(beginIndex==str.length()){
			return true;
		}
		if(str.substring(beginIndex, beginIndex+1)=="a"){
			if(str.substring(beginIndex+1, beginIndex+2)=="a"){
				return check(str, beginIndex+1);
			}
			if(str.substring(beginIndex+1, beginIndex+3)=="bb"){
				return check(str, beginIndex+1);
			}
			return false;
		}
		if(str.substring(beginIndex, beginIndex+2)=="bb"){
			if(str.substring(beginIndex+2, beginIndex+3)=="a"){
				return check(str, beginIndex+2);
			}
			return false;
		}
		return true;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter string");
		Scanner s = new Scanner(System.in);
		String str = s.next();
		System.out.println(check(str, 0));

	}

}
