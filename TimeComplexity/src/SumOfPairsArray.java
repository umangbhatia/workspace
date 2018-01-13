import java.util.Scanner;

public class SumOfPairsArray {
	public static void pairs(int a[], int x){
		int i=0, j=a.length-1;
		while(i<j){
				if(a[i]+a[j]==x){
					System.out.println("("+a[i]+","+a[j]+") is a pair");
					j--;
					i++;
				}
				if(a[i]+a[j]>x){
					j--;
				}
				if(a[i]+a[j]<x){
					i++;
				}
			}
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
		System.out.println("Enter x");
		Scanner s = new Scanner(System.in);
		int x=s.nextInt();
		int A[]=takeInput();
		pairs(A, x);


	}

}
