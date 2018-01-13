import java.util.Scanner;

public class MinimumLengthWord {
	public static String takeInput(){
		System.out.println("Enter string");
		Scanner s = new Scanner(System.in);
		String str=s.nextLine();
		return str;
	}
	public static void findword(String str){
		int a[] = new int[str.length()];
		a[0]=-1;
		int j=1, count=0;
		for(int k=1; k<a.length;k++){
				a[k]=Integer.MAX_VALUE;
		}
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==' '){
				a[j]=i;
				j++;
				count++;
				
			}
		}
		a[j]=str.length();
		int min=a[j]-a[j-1];
		System.out.println(min);
		int sub=0;
		for(int k=count+1;k>0;k--){
			if(a[k]-a[k-1]<=min){
				min=a[k]-a[k-1];
				sub=a[k-1]+1;
			}
		}
		System.out.println("the smallest word is: "+str.substring(sub, sub+min-1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=takeInput();
		findword(str);

	}

}
