package Maps;

import java.util.HashMap;
import java.util.Set;

public class RemoveDuplicates {
	public static int[] remove(int a[]){
		HashMap<Integer, Boolean> map = new HashMap<>();
		int count = 0;
		for(int i=0; i<a.length;i++){
				map.put(a[i], true);
			
		}
		int size = map.size();
		int ans[] = new int[size];
		Set<Integer> set = map.keySet();
		for(Integer j : set){
			ans[count] = j;
			count++;
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,3,4,5};
		int ans[] = remove(a);
		for(int i=0; i<ans.length; i++){
			System.out.println(ans[i]);
		}

	}

}
