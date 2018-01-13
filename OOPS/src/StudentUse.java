
public class StudentUse {
	public static<T extends CompareInterface<T>> void bubbleSort(T input[]){
		for(int i=0; i<input.length;i++){
			for(int j=0;j<input.length-1-i;j++){
				if(input[j].compareTo(input[j+1])==1){
					T temp=input[j];
					input[j]=input[j+1];
					input[j+1]=temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students[] array = new Students[10];
		for(int i=0; i<array.length;i++){
			array[i]= new Students();
			array[i].marks=10-i;
		}
		bubbleSort(array);
		for(int i=0; i<array.length;i++){
			System.out.print(array[i].marks+" ");
		}

	}

}
