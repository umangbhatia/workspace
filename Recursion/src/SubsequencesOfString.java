import java.util.Scanner;

public class SubsequencesOfString {
	public static String[] subsequences(String str, int beginIndex){
		if(beginIndex==str.length()-1){
			String output[]={"",str.substring(beginIndex)};
			return output;
		}
		String output[]=new String[2*(subsequences(str, beginIndex+1).length)];
		System.out.println(output.length);
		int k=0;
		String input[]=subsequences(str, beginIndex+1);
		for(int i=0;i<input.length;i++){
			output[i]=input[i];
			k=i;
		}
		for(int j=k;j<output.length;j++){
			output[j]=str.charAt(beginIndex)+input[j-k];
		}
		return output;
			
			
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
		printArr(subsequences(str, 0));

	}

}
