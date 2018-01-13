import java.util.Scanner;

public class MinimumElement {
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
	public static int[] minimum(int a[]){
		if(a.length==1){
			return a;
		}
		int smallInput[]=new int[a.length-1];
		if(a[0]>a[1]){
			for(int i=1;i<a.length;i++){
				smallInput[i-1]=a[i];
			}
		}
			if(a[0]<a[1]){
				smallInput[0]=a[0];
				for(int i=2;i<a.length;i++){
					smallInput[i-1]=a[i];
				}
			}
			return minimum(smallInput);
			
		}
	public static void printArr(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=takeInput();
		int ans[]=minimum(a);
		System.out.println("The smallest element is: ");
		printArr(ans);

	}

}
