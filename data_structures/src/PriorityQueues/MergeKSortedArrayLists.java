package PriorityQueues;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class MergeKSortedArrayLists {
	public static ArrayList<Integer> merge(ArrayList<ArrayList<Integer>> array, ArrayList<Integer> ans) throws Exception{
		PQMin<Integer> queue = new PQMin<>();
		 
		for(int i=0;i<array.size();i++){
			if(array.get(i).size()>0)
			queue.insert(array.get(i).get(0), array.get(i).get(0));
		}
		if(queue.isEmpty()){
			return ans;
		}
		int min = queue.minRemove();
		ans.add(min);
		for(int i=0;i<array.size();i++){
			if(array.get(i).size()>0){
			if(min == array.get(i).get(0)){
				array.get(i).remove(0);
			}
			}
		}
		merge(array, ans);
		return ans;
	
		}
	public static ArrayList<ArrayList<Integer>> takeInput(int k){
		ArrayList<ArrayList<Integer>> array = new ArrayList<>();
		Scanner s = new Scanner(System.in);
		for(int i=0; i<k ;i++){
			ArrayList<Integer> list = new ArrayList<>();
			int input = 0;
			while(true){
				input = s.nextInt();
				if(input!=-1){
					list.add(input);
				}else{
					array.add(list);
					break;
				}
			}

		}
		return array;
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int k = s.nextInt();
		ArrayList<ArrayList<Integer>> array = takeInput(k);
		ArrayList<Integer> a = new ArrayList<>();
		ArrayList<Integer> ans = merge(array, a);
		for(int i=0;i<ans.size();i++){
			System.out.print(ans.get(i)+" ");
		}

	}

}
