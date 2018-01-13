package Maps;

import java.util.HashMap;
import java.util.Scanner;

public class CheckIfSubset {
	public static boolean check(int a1[], int a2[]){
		HashMap<Integer, Integer> map1 = new HashMap<>();
//		HashMap<Integer, Integer> map2 = new HashMap<>();
		for(int i=0;i<a1.length;i++){
			if(!map1.containsKey(a1[i])){
				map1.put(a1[i], 1);
			}else{
				int oldValue = map1.get(a1[i]);
				map1.put(a1[i], oldValue+1);
			}
		}
		for(int i=0;i<a2.length;i++){
			if(!map1.containsKey(a2[i])){
				return false;
			}else{
				int oldValue = map1.get(a1[i]);
				map1.put(a1[i], oldValue-1);
				if(oldValue==1){
					map1.remove(a2[i]);
				}
			}
		}
		return true;
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
		int a1[]= takeInput();
		int a2[] = takeInput();
		System.out.println(check(a1, a2));
		

	}

}
