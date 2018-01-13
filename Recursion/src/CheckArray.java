import java.util.Scanner;

public class CheckArray {
	public static boolean check(int a[]){
		if(a.length==0){
			return false;
		}
		int smallInput[]=new int[a.length-1];
		if(a[0]==7){
			return true;
		}
		else{

			for(int i=1;i<a.length;i++){
				smallInput[i-1]=a[i];
			}
		}
		return check(smallInput);

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
	public static int firstIndex(int a[], int beginIndex){
		if(beginIndex==a.length-1){
			return -1;
		}
		if(a[beginIndex]==7){
			return beginIndex;
		}
		else{
			return firstIndex(a, beginIndex+1);
		}
		
	}
	public static int lastIndex(int a[], int beginIndex){
		if(beginIndex==1){
			return -1;
		}
		if(a[beginIndex]==7){
			return beginIndex;
		}
		else{
			return lastIndex(a, beginIndex-1);
		}
	}
	public static int[] array(int a[],int beginIndex){
		if(beginIndex==a.length-1){
			if(a[beginIndex]==7){
				int arr[]= new int[1];
				arr[0]=beginIndex;
				return arr;
			}
			else{
				int arr[]=new int[0];
				return arr;
			}
		}
		if(a[beginIndex]==7){
			int arr[] = new int[array(a, beginIndex+1).length+1];
			arr[0]=beginIndex;
			for(int i=1;i<arr.length;i++){
				arr[i]=array(a, beginIndex+1)[i-1];
			}
			return arr;
		}
		else{
			return array(a, beginIndex+1);
		}
	}
	public static void printArr(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=takeInput();
		printArr(array(a, 0));

	}

}
