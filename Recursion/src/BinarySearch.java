import java.util.Scanner;

public class BinarySearch {
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
	public static int search(int a[], int n){
		int s=0,e=a.length-1;
		int m=(s+e)/2;
		if(a.length==1){
			if(a[0]==n){
				return 0;
			}
			else return Integer.MIN_VALUE;
		}
		
		if(n==a[m]){
			return m;
		}
		if(n>a[m]){
			int input[]= new int[a.length/2];
			for(int i=0;i<input.length;i++){
				input[i]=a[m+i+1];
			}
			return search(input, n)+m+1;
		}
		if(n<a[m]){
			int input[]= new int[a.length-a.length/2-1];
			for(int i=0;i<input.length;i++){
				input[i]=a[i];
			}
			return search(input, n);
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=takeInput();
		System.out.println("Enter n");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println(search(a, n));

	}

}
