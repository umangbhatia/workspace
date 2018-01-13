package Maps;

import java.util.HashMap;

public class CheckIfDuplicatesAtDistanceK {
	public static boolean check(int a[], int k){
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<a.length; i++){
			if(!map.containsKey(a[i])){
				map.put(a[i], i);
			}else{
				int oldValue = map.get(a[i]);
				if(i-oldValue<=k){
					return true;
				}
				else{
					map.put(a[i], i);
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2, 5, 3, 4, 1, 2, 3, 5};
		int k=4;
		System.out.println(check(arr, k));

	}

}
