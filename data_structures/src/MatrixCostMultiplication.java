import java.util.ArrayList;

public class MatrixCostMultiplication {
	public static int MCM(ArrayList<Integer> matrix, int min){
	if(matrix.size()==3){
		int i=1;
		return matrix.get(i)*matrix.get(i-1)*matrix.get(i+1);
	}
		for(int i=1;i<matrix.size()-1;i++){
			int ans = 0;
			int current = matrix.get(i);
			
			ans = matrix.get(i)*matrix.get(i-1)*matrix.get(i+1);
			matrix.remove(i);
			ans += MCM(matrix, min);
			matrix.add(i, current);
			if(ans<min){
				min = ans;
			}
		}
		return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> matrix = new ArrayList<>();
		matrix.add(5);
		matrix.add(10);
		matrix.add(20);
		matrix.add(25);
		System.out.println(MCM(matrix, Integer.MAX_VALUE));

	}

}
