import java.util.Scanner;

public class SumOfArrayElements {
	public static int sum(int a[], int beginindex){
		if(beginindex==a.length-1){
			return a[beginindex];
		}
		int sum=a[beginindex]+sum(a, beginindex+1);
		return sum;
	}
	public static int[] takeInput(){
		System.out.println("Enter n");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<n;i++){
			System.out.println("Enter number "+i);
			arr[i]= s.nextInt();
		}
		
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=takeInput();
		System.out.println(sum(a, 0));

	}

}
