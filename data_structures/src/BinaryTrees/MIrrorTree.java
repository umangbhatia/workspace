package BinaryTrees;

public class MIrrorTree {
	public static void mirror(BinaryTree<Integer> root){
		if(root==null){
			return;
		}
		BinaryTree<Integer> temp = root.left;
		root.left=root.right;
		root.right=temp;
		mirror(root.left);
		mirror(root.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
