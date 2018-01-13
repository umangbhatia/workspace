package Maps;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class CheckIfStringContainsAtmostNDiffLetters {
	public static boolean check(String str, int n) {
		HashMap<Character, Integer> map = new HashMap<>();
		for(int i=0;i<str.length();i++){
			map.put(str.charAt(i), 1);
		}
		Set<Character> set = map.keySet();
		int size = set.size();
		if(size<=n){
			return true;
		}else{
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		int n = s.nextInt();
		System.out.println(check(str, n));

	}

}
