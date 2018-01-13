package PriorityQueues;

public class PrintKMinElements {
	public static void print(int a[], int k) throws Exception{
		PriorityQueue<Integer> q = new PriorityQueue<>();
		for(int i=0;i<k;i++){
			q.insert(a[i], a[i]);
		}
		for(int i=k;i<a.length;i++){
			int max = q.removeMax();
			if(a[i]<max){
				q.insert(a[i], a[i]);
			}else{
				q.insert(max, max);
			}
		}
		for(int i=0; i<k;i++){
			System.out.print(q.removeMax()+" ");
		}
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int in[] = {2,4,5,1,7,9,8};
		print(in, 5);

	}

}
