package BinaryTrees;

public class NumberOfLeafNodes {
	public static int count(BinaryTree<Integer> root){
		if(root.left==null&&root.right==null){
			return 1;
		}
		int count = 0;
		if(root.left!=null){
			count+= count(root.left);
		}
		if(root.right!=null){
			count+= count(root.right);
		}
		return count;
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BinaryTree<Integer> root = BinaryTreeUse.takeInput();
		System.out.println(count(root));

	}

}
