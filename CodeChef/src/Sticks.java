import java.util.HashMap;
import java.util.Scanner;

public class Sticks {
	public static int check(int a[]){
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<a.length;i++){
			if(!map.containsKey(a[i])){
				map.put(a[i], 1);
			}else{
				int oldValue = map.get(a[i]);
				map.put(a[i], oldValue+1);
			}
		}
		int max = 0;
		int second = 0;
		for(int i=0; i<a.length;i++){
		if(map.get(a[i])>1){
			if(a[i]>max){
				second = max;
				max = a[i];
			} 
			else if(a[i]>second){
				second = a[i];
			}
			int oldValue = map.get(a[i]);
			map.put(a[i], oldValue-2);
		}
	}
		int area = max*second;
		if(area>0){
			return area;
		}else{
			return -1;
		}
	}
	public static int[]takeInput(){
		Scanner s = new Scanner(System.in);
//		System.out.println("enter size");
		int size = s.nextInt();
		int input[]= new int[size];
		for(int i=0; i<size; i++){
//			System.out.println("enter "+i+" element");
			input[i]=s.nextInt();
		}
		return input;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int t= s.nextInt();	
		int output[] = new int[t];
		try {for(int i=0;i<t;i++){
			int a[] = takeInput();
			output[i] = check(a);
			}
			for(int i=0;i<t;i++){
				System.out.println(output[i]);
				}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
