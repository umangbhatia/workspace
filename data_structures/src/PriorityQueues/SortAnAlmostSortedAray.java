package PriorityQueues;

public class SortAnAlmostSortedAray {
	public static void sort(int a[], int k) throws Exception{
		int temp = 0;
		for(int i=0;i<a.length;i++){
			if(i>=a.length-k+1){
				k--;
			}
			PQMin<Integer> q = new PQMin<>();
			for(int j=0;j<k;j++){
				q.insert(a[i+j], a[i+j]);
			}
			int min = q.minRemove();
			if(min!=a[i]){
				temp = a[i];
				a[i] = min;
				for(int j=1;j<k;j++){
					if(a[i+j]==min){
						a[i+j]=temp;
					}
				}
			}
			
		}
		
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int a[] = {2,4,1,3,7,8,5,6,11,9,10};
		sort(a, 4);
		for(int i: a){
			System.out.print(i+" ");
		}

	}

}
