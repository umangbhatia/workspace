package Trees;
// 1 3 2 3 4 1 5 1 6 1 7 0 0 0
import Trees.TreeUse;
public class SumOfNodes {
	public static int sum(TreeNode<Integer> root){
		if(root.children.size()==0){
			return root.data;
		}
		int sum = root.data;
		for(int i =0; i<root.children.size();i++){
			sum += sum(root.children.get(i));
		}
		return sum;
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		TreeNode<Integer> root = TreeUse.takeInputL();
		System.out.println(sum(root));
		

	}

}
