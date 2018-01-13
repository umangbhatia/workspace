import java.util.Scanner;

public class NumberKeypadBetter {
	public static String[] text(int n, String[] options){
		if(n==0){
			String output[]={""};
			return output;
		}
		int lastDigit = n%10;
		String lastDigitOptions = options[lastDigit];
		String[] smallOutput = text(n/10, options);
		String output[]= new String[smallOutput.length*lastDigitOptions.length()];
		int count=0;
		for(int i=0; i<smallOutput.length; i++){
			for(int j=0; j<lastDigitOptions.length();j++){
				output[count]=smallOutput[i]+lastDigitOptions.charAt(j);
				count++;
			}
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
		String options[]={"","","abc","def","ghi"};
		System.out.println("Enter n");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		printArr(text(n, options));

	}

}
