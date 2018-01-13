package BinaryTrees;
//8 3 10 1 6 -1 14 -1 -1 4 7 13 -1 -1 -1 -1 -1 -1 -1
public class FindNodeInBST {
	public static boolean find(BinaryTree<Integer> root, int k){
		if(root==null){
			return false;
		}
		if(root.data==k){
			return true;
		}
		if(root.data<k){
			return find(root.right, k);
		}
		else{
			return find(root.left, k);
		}
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BinaryTree<Integer> root = BinaryTreeUse.takeInput();
		System.out.println(find(root, 7));

	}

}
