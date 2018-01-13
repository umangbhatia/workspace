package PriorityQueues;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class NewClass {
	PriorityQueue<Integer> q = new PriorityQueue<>();
	ArrayList<Integer> ar = new ArrayList<>();
	int size = 0;
	public void insert(int a){
	q.insert(a, 1);
	ar.add(a);
	size++;
	}
	public void remove(){
		if(size%2==0){
			int median1 = ar.get(size/2);
			int median2 = ar.get((size-1)/2);
			for(int i=(size-1)/2;i<size-2;i++){
				q.queue.set(i, q.queue.get(i+2));
			}
			q.queue.remove(size-1);
			size--;
			q.queue.remove(size-1);
			size--;
			size--;
		}else{
			int median1 = ar.get((size-1)/2);
			for(int i = (size-1)/2;i<size-1;i++)
			q.queue.set(i, q.queue.get(i+1));
			
			q.queue.remove(size-1);
			size--;
		}
	}
	public MedianResultClass median(){
		MedianResultClass ans = new MedianResultClass();
		if(size%2==0){
			ans.median1 = ar.get(size/2);
			ans.median2 = ar.get((size-1)/2);
			return ans;
		}else{
			ans.median1 = ar.get((size-1)/2);
			ans.median2 = Integer.MAX_VALUE;
			return ans;
		}
	}
	

}
