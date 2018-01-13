import java.util.Scanner;

//Given two string s and t, write a function to check if s contains all characters of t in the same order. Do it recursively.
//E.g. : s = “abchjsgsuohhdhyrikkknddtg” contains all characters of t=”coding” in the same order. So function will return true.
public class CheckString {
	public static boolean check(String big, String small){
		if(small.length()==0){
			return true;
		}
		if(big.charAt(0)==small.charAt(0)){
			return check(big.substring(1), small.substring(1));
		}
//		for(int i=1;i<small.length();i++){
//			if(big.charAt(0)==small.charAt(i)){
//				return false;
//			}
//		}
		return check(big.substring(1), small);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String big = s.nextLine();
		String small = s.nextLine();
		System.out.println(check(big, small));
		

	}

}
