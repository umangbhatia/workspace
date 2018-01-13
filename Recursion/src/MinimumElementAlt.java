import java.util.Scanner;

public class MinimumElementAlt {
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
	public static int minimum(int a[], int beginIndex){
		int min=a[beginIndex];
		if(beginIndex==a.length-1){
			return a[beginIndex];
		}
		
		if(a[beginIndex]<minimum(a, beginIndex+1)){
			min=a[beginIndex];
		}
		else{
			min=minimum(a, beginIndex+1);
		}
		return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=takeInput();
		System.out.println(minimum(a, 0));

	}

}
