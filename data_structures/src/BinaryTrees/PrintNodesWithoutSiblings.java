package BinaryTrees;

public class PrintNodesWithoutSiblings {
	public static void print(BinaryTree<Integer> root){
		if(root==null){
			return;
		}
		if(root.left==null&&root.right!=null){
			System.out.println(root.right.data);
			print(root.right);
		}
		else if(root.left!=null&&root.right==null){
			System.out.println(root.left.data);
			print(root.left);
		}
		else{
			print(root.right);
			print(root.left);
		}
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BinaryTree<Integer> root = BinaryTreeUse.takeInput();
		print(root);

	}

}
