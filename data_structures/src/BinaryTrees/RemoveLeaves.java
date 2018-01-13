package BinaryTrees;

public class RemoveLeaves {
	public static void remove(BinaryTree<Integer> root){
		if(root==null){
			return;
		}
		BinaryTree<Integer> check1;
		BinaryTree<Integer> check2;
		if(root.right!=null){
			check1 = root.right;
			if(check1.right==null&&check1.left==null){
				root.right=null;
			}
		}
		if(root.left!=null){
			check2 = root.left;
			if(check2.right==null&&check2.left==null){
				root.left=null;
			}
		}
		remove(root.right);
		remove(root.left);
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BinaryTree<Integer> root = BinaryTreeUse.takeInput();
		remove(root);
		BinaryTreeUse.printL(root);

	}

}
