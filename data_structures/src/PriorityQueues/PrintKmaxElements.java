package PriorityQueues;

public class PrintKmaxElements {
	public static void print(int a[], int k) throws Exception{
		PQMin<Integer> q = new PQMin<>();
		for(int i=0;i<k;i++){
			q.insert(a[i], a[i]);
		}
		for(int i=k;i<a.length;i++){
			int min = q.minRemove();
			if(a[i]<min){
				q.insert(a[i], a[i]);
			}else{
				q.insert(min, min);
			}
		}
		for(int i=0; i<k;i++){
			System.out.print(q.minRemove()+" ");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
