
public class XGp {
	public static void compute(int x) {
		
		if(x>100){
			return;
		}
		System.out.print(x+" ");
		compute(2*x);
		System.out.print(x+" ");
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 20;
		compute(x);
		

	}

}
