import java.util.Scanner;

public class LargestSubstring {
	public static String takeInput(){
		System.out.println("Enter string");
		Scanner s = new Scanner(System.in);
		String str=s.nextLine();
		return str;
	}
	public static void check(String str){
		int max=0,subStart=0,count=1,maxStart=0,maxEnd=str.length();
		for(int i=1;i<str.length();i++){
			for(int j=subStart;j<i;j++){
				if(str.charAt(i)==str.charAt(j)){
					if(count>max){
						max=count;
						maxStart=subStart;
						maxEnd=max+subStart;
					}
					count=1;
					subStart=j+1;
					i=subStart+1;
					break;
				}

			}
			count++;
		}
		System.out.println(max);
		System.out.println("The longest substring is: "+str.substring(maxStart, maxEnd));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=takeInput();
		check(str);

	}

}
