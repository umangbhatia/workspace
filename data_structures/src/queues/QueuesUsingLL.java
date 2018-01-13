package queues;
import data_structures.Node;
public class QueuesUsingLL<T> {
	private Node<T> front;
	private Node<T> rear;
	int size = 0;
	public boolean isEmpty() {
		return size==0;
	}
	public int size(){
		return size;
	}
	public T front() throws Exception{
		if(size==0){
			throw new Exception();
		}

		return front.data;
	}
	public T rear() throws Exception{
		if(size==0){
			throw new Exception();
		}
		return rear.data;
	}
	public void enqueue(T t){
		if(size==0){
			Node<T> input = new Node<T>(t);
			front = input;
			rear = input;
			size++;
		}else{
			Node<T> input = new Node<T>(t);
			rear.next=input;
			rear = input;
			size++;
		}
	}
	public T dequeue() throws Exception {
		if(size==0){
			throw new Exception();
		}else{
			Node<T> input = front;
			size--;
			front = front.next;
			return input.data;
		}
	}

}
