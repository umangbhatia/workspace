
import java.util.Scanner;

public class NumberOfNumbersGreaterThanNUsingDigitsOfNRepeatedDigits {
	public static int factorial(int n){
		if(n==0){
			return 1;
		}
		int ans=1;
		for(int i=1;i<=n;i++){
			ans*=i;
		}
		return ans;
	}
	public static int count(int a[],int beginindex){
		if(beginindex==a.length){
			return 0;
		}
		

		int count=0;
		for(int i=beginindex+1;i<a.length;i++){
			int frequency[]= new int[10];
			int numEqual=0;
			if(a[i]>a[beginindex]){
				if(i!=beginindex+1){
					for(int j=beginindex+1;j<i;j++){
						if(a[j]==a[i]){
							numEqual++;
							break;
						}
					}
				}
				if(numEqual==0){
					frequency[a[beginindex]]++;
					frequency[a[i]]--;
					for(int j=beginindex+1; j<a.length; j++){
						frequency[a[j]]++;
					}
					count+=factorial(a.length-1-beginindex)/(factorial(frequency[0])*factorial(frequency[1])*factorial(frequency[2])*factorial(frequency[3])*factorial(frequency[4])*factorial(frequency[5])*factorial(frequency[6])*factorial(frequency[7])*factorial(frequency[8])*factorial(frequency[9]));
				}
			}
		}
		count+=+count(a, beginindex+1);

		return count;
	}
	public static int[]takeInput(){
		Scanner s = new Scanner(System.in);
		System.out.println("enter size");
		int size = s.nextInt();
		int input[]= new int[size];
		for(int i=0; i<size; i++){
			System.out.println("enter "+i+" element");
			input[i]=s.nextInt();
		}
		return input;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=takeInput();
		System.out.println(count(a, 0));

	}

}
