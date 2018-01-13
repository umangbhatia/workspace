package Maps;

import java.util.HashMap;

public class SumOfPairs0 {
	public static void pairs(int a[]){
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<a.length; i++){
			if(!map.containsKey(a[i])){
				map.put(a[i], 1);
			}else{
				int oldValue = map.get(a[i]);
				map.put(a[i], oldValue+1);
			}
		}
		for(int i=0; i<a.length;i++){
			if(map.containsKey(a[i])){
				int value1 = map.get(a[i]);

				if(map.containsKey(-a[i])){
					int value2 = map.get(-a[i]);
					int times = value1*value2;
					for(int j=0; j<times; j++){
					System.out.println(a[i]+" "+-a[i]);
					}
					map.remove(a[i]);
					map.remove(-a[i]);

				}
			}
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {2,-2,-2,-3,3,-3};
		pairs(a);

	}

}
