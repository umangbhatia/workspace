import java.util.Scanner;

public class SubstringsOfLengthK {
	public static String finalString(String str){
		String Final="";
		for(int i=0;i<str.length();i++){
			for(int j=0;j<Final.length();j++){
				if(str.charAt(i)==Final.charAt(j)){
					break;
				}
				Final+=str.charAt(i);
			}
		}
		return Final;
	}
	public static String[] returnStrings(String str, int k, int bi){
		if(k==0){
			String ans[]={};
			return ans;
		}
		if(bi==str.length()-1){
			String ans="";
			for(int i=0; i<k;i++){
				ans+=str.charAt(bi);
			}
			String op[]={ans};
			return op;
		}
		String[] smallOutput= returnStrings(str, k, bi+1);
		String[] smallInput = returnStrings(str, k-1, bi+1);
		String ans[]= new String[(int)Math.pow(str.substring(bi).length(), k)];
		int count=0;
		for(int j=0;j<smallInput.length; j++){
			ans[count]=str.charAt(bi)+smallInput[j];
			count++;
			for(int i=1; i<k-1;i++){
				ans[count]=smallInput[j].substring(0, i)+str.charAt(bi)+smallInput[j].substring(i);
				count++;
			}
			ans[count]=smallInput[j]+str.charAt(bi);
			count++;
		}
		for(int i=0; i<smallOutput.length;i++){
			ans[count]=smallOutput[i];
			count++;
		}
		String op="";
		for(int i=0; i<k;i++){
			op+=str.charAt(bi);
		}
		ans[count]=op;
		count++;
		if(k>2){
			for(int a=bi+1;a<str.length();a++){
				ans[count]=str.charAt(a)+op.substring(1);
				count++;
				for(int i=1; i<k-1;i++){
					ans[count]=op.substring(1).substring(0, i)+str.charAt(a)+op.substring(1).substring(i);
					count++;
				}
				ans[count]=op.substring(1)+str.charAt(a);
				count++;

			}
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
		String str=s.next();
		//		String Final=finalString(str);
		//		System.out.println(Final);
		System.out.println("Enter k");
		int k=s.nextInt();
		printArr(returnStrings(str, k, 0));

	}

}
