package PriorityQueues;

public class InplaceHeapSort {
	public static void insert(int a[], int index){
		int childindex = index;
		int parentindex = (childindex-1)/2;
		while(childindex>0){
			if(a[childindex]>a[parentindex]){
				int temp = a[childindex];
				a[childindex] = a[parentindex];
				a[parentindex] = temp;
				childindex = parentindex;
				parentindex = (childindex-1)/2;
				
			}else{
				return;
			}
		}
	}
	public static int remove(int a[], int size){
		int temp = a[0];
		a[0] = a[size-1];
		size--;
		if(size>1){
			downheap(a, size, 0);
		}
		return temp;
	}

	private static void downheap(int[] a, int size, int index) {
		// TODO Auto-generated method stub
		int leftchild = 2*index +1;
		int rightchild = 2*index + 2;
		if(leftchild>size-1){
			return;
		}
		int max = index;
		if(a[max]<a[leftchild]){
			max = leftchild;
		}
		if(rightchild<size&&a[max]<a[rightchild]){
			max = rightchild;
		}
		if(max!=index){
			int temp = a[max];
			a[max] = a[index];
			a[index] = temp;
			downheap(a, size, max);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {2, 4,1 , 6,7,9,5};
		for(int i=0;i<a.length;i++){
			insert(a, i);
		}
		for(int i: a){
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i=0; i<a.length;i++){
			a[a.length-i-1] = remove(a, a.length-i);
		}
		for(int i:a){
			System.out.print(i+" ");
		}

	}

}
