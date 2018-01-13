import java.util.Scanner;

//For e.g. Input : “1123”
//Output : aabc, kbc, alc, aaw, kw
public class NumericCodeToString {
	public static void convert(String str, String strSoFar){
		if(str.length()==0){
			System.out.println(strSoFar);
			return;
		}
		
		
	}
	public static void printArr(String arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter numeric string");
		Scanner s = new Scanner(System.in);
		String str = s.next();
		
	}

}
