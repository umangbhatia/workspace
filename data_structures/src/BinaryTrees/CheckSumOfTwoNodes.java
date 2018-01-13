package BinaryTrees;

public class CheckSumOfTwoNodes {
	public static boolean check(BinaryTree<Integer> root, int k, int count){
		if(k==0&&count==2){
			return true;
		}
		if(k!=0&&count==2){
			return false;
		}
		boolean check1=false, check2=false, check3=false, check4=false;
		if(root.left!=null){
			check1 = check(root.left, k-root.data, count+1);
			check2 = check(root.left, k, count);
		}
		if(root.right!=null){
			check3 = check(root.right, k-root.data, count++);
			check4 = check(root.right, k, count);
		}
		return check1||check2||check3||check4;
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BinaryTree<Integer> root = BinaryTreeUse.takeInput();
		System.out.println(check(root, 10, 0));

	}

}
