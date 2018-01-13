package Stacks;

public class CheckDuplicateParenthesis {
	public static boolean check(String str){
		StackUsingLL<Character> S = new StackUsingLL<>();
		int count=0;
		for(int i =0; i<str.length();i++){
			char currentChar = str.charAt(i) ;
			char check ='1';
			
			if(str.charAt(i)=='{'||str.charAt(i)=='['||str.charAt(i)=='('){
				S.push(str.charAt(i));
			}else if(currentChar == ')'){
				try {
					char top =(char) S.pop();
					 
					if(top != '('){
						return false;
					}
					if(top==check){
						count++;
					}
					check='(';
				} catch (StackEmptyException e) {
					return false;
				}
				
			}
			else if(currentChar == '}'){
				try {
					char top =(char) S.pop();
					if(top != '{'){
						return false;
					}
					if(top==check){
						count++;
					}
					check='{';
				} catch (StackEmptyException e) {
					return false;
				}
				
			}
			else if(currentChar == ']'){
				try {
					char top =(char) S.pop();
					if(top != '['){
						return false;
					}
					if(top==check){
						count++;
					}
					check='[';
				} catch (StackEmptyException e) {
					return false;
				}	
			}
		}
		if(count>0){
			return true;
		}else{
			return false;
		}
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
