package queues;

public class QueseUse {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		QueuesUsingLL<Integer> l = new QueuesUsingLL<>();
		for(int i=0; i<5; i++){
			l.enqueue(i);
		}
		while(!l.isEmpty()){
			System.out.println(l.dequeue());
		}
	}

}
