package PriorityQueues;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class PriorityQueue<T> {
	ArrayList<PQNode<T>> queue = new ArrayList<>();
	public int size(){
		return queue.size();
	}
	public boolean isEmpty(){
		return queue.isEmpty();
	}
	public void insert(int priority, T value){
		PQNode<T> node = new PQNode<>();
		node.priority = priority;
		node.value = value;
		queue.add(node);
		int childindex = queue.size()-1;
		
		int parentindex = (childindex-1)/2;
		
		while(childindex>0){
			PQNode<T> child = queue.get(childindex);
			PQNode<T> parent = null;
			if(parentindex>=0){
				parent = queue.get(parentindex);
			}
			if(queue.get(parentindex).priority<queue.get(childindex).priority){
				queue.set(parentindex, child);
				queue.set(childindex, parent);
				childindex = parentindex;
				parentindex = (childindex-1)/2;
			}else{
				return;
			}
		}
	}
	public T removeMax() throws Exception{
		if(queue.size()==0){
			throw new Exception();
		}
		T temp = queue.get(0).value;
		queue.set(0, queue.get(size()-1));
		queue.remove(queue.size()-1);
		if(size()>0){
		downheap(0);
		}
		return temp;
	}
	private void downheap(int index) {
		// TODO Auto-generated method stub
		int leftChild = 2*index +1;
		int rightChild = 2*index + 2;
		if(leftChild>queue.size()-1){
			return;
		}
		int max = index;
		if(queue.get(leftChild).priority>queue.get(max).priority){
			max = leftChild;
		}
		if(rightChild<queue.size()&& queue.get(rightChild).priority>queue.get(max).priority){
			max = rightChild;
		}
		if(max!=index){
			PQNode<T> temp = queue.get(max);
			queue.set(max, queue.get(index));
			queue.set(index, temp);
			downheap(max);
		}
		
	}

}
