package Maps;

import java.util.HashMap;

public class LongestSequenceOfConsecutiveNumbers {
	public static int[] find(int a[]){
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i=0; i<a.length;i++){
				map.put(a[i], 1);
			
		}
		boolean check = true;
		int count = 1;
		for(int i=0;i<a.length;i++){
			count=1;
			check = true;
			while(check!=false)
			if(map.containsKey(a[i]+count)){
				count++;
			}else{
				map.put(a[i], count);
				check = false;
			}
		}
		int max = 1;
		int j = 0;
		for(int i=0;i<a.length;i++){
			if(map.get(a[i])>max){
				max = map.get(a[i]);
				j = i;
			}
		}
		int ans[] = new int[max];
		for(int i=0;i<ans.length;i++){
			ans[i] = a[j]+i;
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {2, 12, 9, 16, 10, 5, 3, 20, 25, 11, 1, 8, 6};
		int ans[] = find(a);
		for(int i=0; i<ans.length;i++){
			System.out.print(ans[i]+" ");
		}

	}

}
