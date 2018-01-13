import java.util.Scanner;

public class SortStringArray {
	public static String[]takeInput(){
		Scanner s = new Scanner(System.in);
		System.out.println("enter size");
		int size = s.nextInt();
		String input[]= new String[size];
		for(int i=0; i<size; i++){
			System.out.println("enter "+i+" string");
			input[i]=s.next();
		}
		return input;
	}
	public static String[] sort(String str[]){
		for(int i=0;i<str.length-1;i++){
			for(int j=i+1;j>0;j--){
				if(str[j].length()<str[j-1].length()){
					String temp=str[j];
					str[j]=str[j-1];
					str[j-1]=temp;
				}
			}
			
		}
	return str;
	}
	public static void printArr(String arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str=takeInput();
		printArr(sort(str));

	}

}
