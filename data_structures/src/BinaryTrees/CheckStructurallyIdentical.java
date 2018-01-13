package BinaryTrees;

public class CheckStructurallyIdentical {
	public static boolean check(BinaryTree<Integer> root1, BinaryTree<Integer> root2){
		if((root1==null&&root2!=null)||(root2==null&&root1!=null)){
			return false;
		}
		boolean left = true;
		boolean right = true;
		if(root1.data!=root2.data){
			return false;
		}
		if(root1.left==null&&root2.left==null&&root1.right==null&&root2.right==null&&root1.data==root2.data){
			return true;
		}
		if(root1.left==null&&root2.left!=null){
			return false;
		}
		if(root2.left==null&&root1.left!=null){
			return false;
		}
		if(root1.right==null&&root2.right!=null){
			return false;
		}
		if(root2.left==null&&root1.left!=null){
			return false;
		}
		if(root1.left!=null&&root2.left!=null){
			left = check(root1.left, root2.left);
		}
		if(root1.right!=null&&root2.right!=null){
			right = check(root1.right, root2.right);
		}
		if(left==true&&right==true){
			return true;
		}else{
			return false;
		}
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BinaryTree<Integer> root1 = BinaryTreeUse.takeInput();
		BinaryTree<Integer> root2 = BinaryTreeUse.takeInput();
		System.out.println(check(root1, root2));

	}

}
