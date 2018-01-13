import java.util.Scanner;

public class ConvertStringToNumber {
	public static double convert(String str, int beginIndex){
		if(beginIndex==str.length()-1){
			int n=str.charAt(beginIndex)-48;
			int sum=n;
			return sum;
		}
		int n=str.charAt(beginIndex)-48;
		double pow=str.length()-1-beginIndex;
		double sum=n*Math.pow(10, pow)+convert(str, beginIndex+1);
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter string");
		Scanner s = new Scanner(System.in);
		String str=s.next();
		System.out.println(convert(str, 0));
	}

}
