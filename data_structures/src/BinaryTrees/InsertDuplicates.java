package BinaryTrees;

public class InsertDuplicates {
	public static void insert(BinaryTree<Integer> root){
		if(root==null){
			return;
		}
		BinaryTree<Integer> left = root.left;
		BinaryTree<Integer> current  = new BinaryTree<Integer>(root.data);
		root.left = current;
		current.left = left;
		insert(root.right);
		insert(left);
		
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BinaryTree<Integer> root = BinaryTreeUse.takeInput();
		insert(root);
		BinaryTreeUse.printL(root);

	}

}
