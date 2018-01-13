import java.util.Scanner;


public class PermutationsOfAString {
	public static int factorial(int n){
		int ans=1;
		for(int i=1;i<=n;i++){
			ans*=i;
		}
		return ans;
	}
	public static String[] permutations(String str){
		if(str.length()==1){
			String ans[]={str.substring(0)};
			return ans;
		}
		int count=0;
		String smallOutput[]= permutations(str.substring(1));
		String ans[] = new String[factorial(str.length())];
		for(int j=0;j<smallOutput.length; j++){
			ans[count]=str.charAt(0)+smallOutput[j];
			count++;
			for(int i=1; i<str.substring(1).length();i++){
				ans[count]=smallOutput[j].substring(0, i)+str.charAt(0)+smallOutput[j].substring(i);
				count++;
			}
			ans[count]=smallOutput[j]+str.charAt(0);
			count++;
		}
		return ans;
	}
	public static void printArr(String arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter string");
		Scanner s = new Scanner(System.in);
		String str = s.next();
		printArr(permutations(str));


	}

}
