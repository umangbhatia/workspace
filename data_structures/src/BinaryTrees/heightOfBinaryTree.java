package BinaryTrees;
//12 6 7 -1 12 9 -1 -1 -1 -1 -1
public class heightOfBinaryTree {
	public static int height(BinaryTree<Integer> root){
		if(root==null){
			return 0;
		}
		int height = 1;
		int max = 0;
		height+=height(root.left);
		if(height>max){
			max = height;
		}
		height = 1; 
		height+= height(root.right);
		if(height>max){
			max = height;
		}
		return max;
		
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BinaryTree<Integer> root = BinaryTreeUse.takeInput();
		System.out.println(height(root));

	}

}
