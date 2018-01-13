package BinaryTrees;

public class PostOrderAndInorder {
	public static BinaryTree<Integer> build(int post[], int in[], int pEnd, int inStart, int inEnd){
		if(inEnd<0||inEnd>=in.length){
			return null;
		}
		BinaryTree<Integer> root = new BinaryTree<Integer>(post[pEnd]);
		int check=0;
		for(int i=inStart; i<inEnd;i++){
			if(in[i]==post[post.length-1]){
				check = i;
				break;
			}
		}
		root.left= build(post, in, check-1, 0, check-1);
		if(inEnd==inStart){
			root.right = new BinaryTree<Integer>(in[inEnd]);
			root.right.left=null;
			root.right.right=null;
		}
		else{
		root.right = build(post, in, pEnd-1, check+1, inEnd);
		}
		return root;
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//		BinaryTree<Integer> root = BinaryTreeUse.takeInput();
		int post[] = {8, 9, 4, 10, 11, 5, 2, 12, 13, 6, 14, 15, 7, 3, 1};
		int in[] = {8, 4, 9, 2, 10, 5, 11, 1, 12, 6, 13, 3, 14, 7, 15};
		PrintLevelOrder.printBetter(build(post, in, post.length-1, 0, in.length-1));

	}

}
