import java.util.Scanner;

public class NumberOfNumbersGreaterThanNUsingDigitsOfN {
	public static int factorial(int n){
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
		
		int numGreater=0,count=0;
		for(int i=beginindex+1;i<a.length;i++){
			if(a[i]>a[beginindex]){
				int array[]=new int[a.length-1-beginindex];
				for(int j=0;j<array.length;j++){
					array[j]=a[j+1];
				}
				numGreater++;
			}
		}
		count+=numGreater*factorial(a.length-1-beginindex)+count(a, beginindex+1);
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
