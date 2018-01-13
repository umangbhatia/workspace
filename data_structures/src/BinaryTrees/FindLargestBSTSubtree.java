package BinaryTrees;

public class FindLargestBSTSubtree {
	public static BinaryTree<Integer> find(BinaryTree<Integer> root) {
		boolean check = CheckIfBST.checkBst3(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
		if(check==true){
			return root;
		}else{
			BinaryTree<Integer> left = null;
			BinaryTree<Integer> right = null;
			if(root.left!=null){
				left = find(root.left);
			}
			if(root.right!=null){
				right = find(root.right);
			}
			int hl = heightOfBinaryTree.height(left);
			int hr = heightOfBinaryTree.height(right);
			if(hl>hr){
				return left;
			}else{
				return right;
			}
		}
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BinaryTree<Integer> root = BinaryTreeUse.takeInput();
		PrintLevelOrder.print(find(root));

	}

}
