
public class NumberOfTreesOfHeightHBalanced {
	public static int numberOfTrees(int h){
		if(h==1||h==0){
			return 1;
		}
		int ans= numberOfTrees(h-1)*numberOfTrees(h-1)+numberOfTrees(h-1)*numberOfTrees(h-2)*2;
		return ans%(1000000007);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(numberOfTrees(16));

	}

}
