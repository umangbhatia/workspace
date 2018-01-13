package BinaryTrees;

public class ReplaceNodesWithSumOfAllGreaterNodes {
	public static void replace(BinaryTree<Integer> root, int sum){
		if(root==null){
			return;
		}
		int sumL = sum(root.left);
		int data = sum - root.data-sumL;
		int prev = root.data;
		root.data = data;
		replace(root.left, sum);
		replace(root.right, sum-prev-sumL);
	}
	public static int sum(BinaryTree<Integer> root){
		if(root==null){
			return 0;
		}
		int sum = root.data;
		if(root.left!=null){
			sum+=sum(root.left);
		}
		if(root.right!=null){
			sum+=sum(root.right);
		}
		return sum;
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BinaryTree<Integer> root = BinaryTreeUse.takeInput();
		replace(root, 66);
		PrintLevelOrder.print(root);

	}

}
