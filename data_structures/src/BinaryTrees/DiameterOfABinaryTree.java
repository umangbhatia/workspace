package BinaryTrees;

import Trees.MultipleResult;

public class DiameterOfABinaryTree {
	public static int diameter(BinaryTree<Integer> root) {
		int left = heightOfBinaryTree.height(root.left);
		int right = heightOfBinaryTree.height(root.right);
		int max = left + right+1;
		if(root.left!=null){
		int check1 = diameter(root.left);
		if(check1>max){
			max = check1;
		}
		}
		if(root.right!=null){
		int check2 = diameter(root.right);
		if(check2>max){
			max = check2;
		}
		}
		return max;
	}
	public static MultipleResult<Integer> diameterBetter(BinaryTree<Integer> root){
		if(root==null){
			MultipleResult<Integer> output = new MultipleResult<Integer>();
			output.result1 = 0;
			output.result2 = 0;
			return output;
		}
		MultipleResult<Integer> leftAns = diameterBetter(root.left);
		MultipleResult<Integer> rightAns = diameterBetter(root.right);
		MultipleResult<Integer> ans = new MultipleResult<>();
		ans.result1 = Math.max(leftAns.result1, rightAns.result1)+1;
		ans.result2 = Math.max(leftAns.result1+rightAns.result1+1, Math.max(leftAns.result2, rightAns.result2));
		return ans;
		
	}
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BinaryTree<Integer> root = BinaryTreeUse.takeInput();
		System.out.println(diameterBetter(root).result2);

	}

}
