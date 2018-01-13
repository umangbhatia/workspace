package Maps;

import java.util.HashMap;

public class IntersectionOfTwoArrays {
	public static void print(int[] a, int b[]){
		if(a.length>b.length){
			int temp[] = b;
			b = a;
			a = temp;
		}
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<a.length; i++){
			if(!map.containsKey(a[i])){
			map.put(a[i], 1);
		}else{
			int oldValue = map.get(a[i]);
			map.put(a[i], oldValue+1);
		}
		}
		
		for(int i=0; i<b.length;i++){
			if(map.containsKey(b[i])){
				int value = map.get(b[i]);
				if(value>0){
				System.out.println(b[i]);
				map.put(a[i], value-1);
			}
		}
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
