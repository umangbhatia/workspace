package Stacks;

import java.util.Scanner;

public class CheckIfBracketsAreBalanced {
	public static boolean check(String str){
		StackUsingLL<Character> l = new StackUsingLL<>();
		for(int i=0;i<str.length();i++){
			char currentChar = str.charAt(i) ;
			if(str.charAt(i)=='{'||str.charAt(i)=='['||str.charAt(i)=='('){
				l.push(str.charAt(i));
			}else if(currentChar == ')'){
				try {
					char top =(char) l.pop();
					if(top != '('){
						return false;
					}
				} catch (StackEmptyException e) {
					return false;
				}
				
			}
			else if(currentChar == '}'){
				try {
					char top =(char) l.pop();
					if(top != '{'){
						return false;
					}
				} catch (StackEmptyException e) {
					return false;
				}
				
			}
			else if(currentChar == ']'){
				try {
					char top =(char) l.pop();
					if(top != '['){
						return false;
					}
				} catch (StackEmptyException e) {
					return false;
				}	
			}
		}
		return l.isEmpty();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Str");
		String str = s.nextLine();
		System.out.println(check(str));

	}

}
