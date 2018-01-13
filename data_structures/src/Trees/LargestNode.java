package Trees;
//1 3 2 3 4 1 5 1 6 1 7 0 0 0
import Trees.TreeUse;
public class LargestNode {
	public static int largest(TreeNode<Integer> root){
		if(root.children.size()==0){
			return root.data;
		}
		int max = root.data;
		for(int i=0;i<root.children.size();i++){
			int check = largest(root.children.get(i));
			if(max<check){
				max = check;
			}
		}
		return max;
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		TreeNode<Integer> root = TreeUse.takeInputL();
		System.out.println(largest(root));

	}

}
