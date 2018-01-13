package BinaryTrees;

import Trees.MultipleResult;

public class FindNode {
	public static BinaryTree<Integer> find(BinaryTree<Integer> root, int x) {
		if(root==null){
			return null;
		}
		if(root.data == x){
			return root;
		}
		BinaryTree<Integer> left = find(root.left, x);
		if(left!=null){
			return left;
		}
		BinaryTree<Integer> right = find(root.right, x);
		if(right!=null){
			return right;
		}
		return null;
		
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BinaryTree<Integer> root = BinaryTreeUse.takeInput();
		System.out.println(find(root, 1));

	}

}
