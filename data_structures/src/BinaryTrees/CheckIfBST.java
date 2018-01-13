package BinaryTrees;

public class CheckIfBST {
	public static int Min(BinaryTree<Integer> root){
		if(root==null){
			return Integer.MAX_VALUE;
		}
		
		return Math.min(root.data, Math.min(Min(root.left), Min(root.right)));
	}
	public static int Max(BinaryTree<Integer> root){
		if(root==null){
			return Integer.MIN_VALUE;
		}
		return Math.max(root.data, Math.max(Max(root.left), Max(root.right)));
	}
	public static boolean check(BinaryTree<Integer> root){
		if(root==null){
			return true;
		}
		
		int leftMAx = Max(root.left);
		int rightMin = Min(root.right);
		if(root.data<leftMAx||root.data>rightMin){
			return false;
		}
			boolean check1 = check(root.left);
			boolean check2 = check(root.right);
			if(check1==true&&check2==true){
				return true;
			}else return false;
	}
	public static CheckBSTReturnType checkBST(BinaryTree<Integer> root) {
		if(root==null){
			CheckBSTReturnType ans = new CheckBSTReturnType();
			ans.isBst = true;
			ans.max = Integer.MAX_VALUE;
			ans.min = Integer.MIN_VALUE;
			return ans;
		}
		CheckBSTReturnType leftAns = checkBST(root.left);
		CheckBSTReturnType rightAns = checkBST(root.right);
		if(root.data<leftAns.max||root.data>rightAns.min||!leftAns.isBst||!rightAns.isBst){
			CheckBSTReturnType ans = new CheckBSTReturnType();
			ans.isBst = false;
			ans.min = Math.min(root.data, Math.min(leftAns.min, rightAns.min));
			ans.max = Math.max(root.data, Math.max(leftAns.max, rightAns.max));
			return ans;
		}
		CheckBSTReturnType ans = new CheckBSTReturnType();
		ans.isBst = true;
		ans.min = Math.min(root.data, leftAns.min);
		ans.max = Math.max(root.data, leftAns.max);
		return ans;
		
	}
	public static boolean checkBst3(BinaryTree<Integer> root, int min, int max){
		if(root==null){
			return true;
		}
		if(root.data<min||root.data>max){
			return false;
		}
		
		return checkBst3(root.left, min, root.data)&&checkBst3(root.right, root.data, max);
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BinaryTree<Integer> root = BinaryTreeUse.takeInput();
		System.out.println(check(root));

	}

}
