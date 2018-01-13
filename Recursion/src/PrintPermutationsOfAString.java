import java.util.Scanner;

public class PrintPermutationsOfAString {
	public static void permutations(String strSoFar, String options[]) {
		if(options.length==1){
			System.err.println(strSoFar+options[0]);
			return;
		}
		for(int i=0;i<options.length;i++){
			String newOptions[] = new String[options.length-1];
			int count=0;
			for(int j=0;j<i;j++){
				newOptions[count]=options[j];
				count++;
			}
			for(int j=i+1;j<options.length;j++){
				newOptions[count]=options[j];
				count++;
			}
			permutations(strSoFar+options[i], newOptions);
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter string");
		Scanner s = new Scanner(System.in);
		String str=s.next();
		String newOptions[] = new String[str.length()];
		for(int i =0;i<str.length();i++){
			newOptions[i] = str.substring(i, i+1);
		}
		permutations("", newOptions);
	}

}
