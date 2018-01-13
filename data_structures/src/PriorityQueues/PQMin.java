package PriorityQueues;

import java.util.ArrayList;

public class PQMin<T> {
	 ArrayList<PQNode<T>> queue = new ArrayList<>();
	 public boolean isEmpty(){
		 return queue.size()==0;
	 }
	 public int size(){
		 return queue.size();
	 }
	 public void insert(T data, int priority){
		 PQNode<T> node = new PQNode<>();
		 node.value = data;
		 node.priority = priority;
		 queue.add(node);
		 int childindex = queue.size()-1;
		 int parentindex = (childindex-1)/2;
		 while(childindex>0){
			 PQNode<T> child = queue.get(childindex);
			 PQNode<T> parent = queue.get(parentindex);
			 if(child.priority<parent.priority){
				 queue.set(parentindex, child);
				 queue.set(childindex, parent);
				 childindex = parentindex;
				 parentindex = (childindex-1)/2;
			 }else{
				 return;
			 }
		 }
	 }
	 public T minRemove() throws Exception{
		 if(queue.size()==0){
			 throw new Exception();
		 }
		 T temp = queue.get(0).value;
		 queue.set(0, queue.get(queue.size()-1));
		 queue.remove(queue.size()-1);
		 if(queue.size()>0){
			 downheap(0);
		 }
		 return temp;
	 }
	private void downheap(int index) {
		// TODO Auto-generated method stub
		int leftchild = 2*index + 1;
		int rightchild = 2*index + 2;
		if(leftchild>queue.size()-1){
			return;
		}
		int min = index;
		if(queue.get(leftchild).priority<queue.get(min).priority){
			min = leftchild;
		}
		if(rightchild<queue.size()&& queue.get(rightchild).priority<queue.get(min).priority){
			min = rightchild;
		}
		if(min!=index){
			PQNode<T> temp = queue.get(min);
			queue.set(min, queue.get(index));
			queue.set(index, temp);
			downheap(min);
		}
		
	}

}
