package BinaryTrees;

public class CheckIfBalanced {
	public static boolean check(BinaryTree<Integer> root){
		if(root==null){
			return true;
		}
		int hLeft = heightOfBinaryTree.height(root.left);
		int hRight = heightOfBinaryTree.height(root.right);
		boolean check1;
		boolean check2;
		if(hLeft-hRight==0||hLeft-hRight==1||hLeft-hRight==-1){
			check1 = check(root.left);
			check2 = check(root.right);
			if(check1==true&&check2==true){
				return true;
			}else return false;
		}else return false;
	}
	
		
		

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BinaryTree<Integer> root = BinaryTreeUse.takeInput();
		System.out.println(check(root));

	}

}
