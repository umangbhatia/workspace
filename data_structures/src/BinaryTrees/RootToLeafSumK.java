package BinaryTrees;

public class RootToLeafSumK {
	public static void print(BinaryTree<Integer> root, int k, boolean check, String toBePrinted){
		if(root.left==null&root.right==null&&k==root.data){
			System.out.println(toBePrinted+root.data);
		}
		if(k<0){
			return;
		}
		if(check){
			if(root.left!=null){
				print(root.left, k-root.data, true, toBePrinted+root.data+" ");	
			}
			if(root.right!=null){
				print(root.right, k-root.data, true, toBePrinted+root.data+" ");	
			}
		}else{
			if(root.left!=null){
				print(root.left, k-root.data, true, toBePrinted+root.data+" ");
				print(root.left, k, false, toBePrinted);
			}
			if(root.right!=null){
				print(root.right, k-root.data, true, toBePrinted+root.data+" ");
				print(root.right, k, false, toBePrinted);
			}
		}
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BinaryTree<Integer> root = BinaryTreeUse.takeInput();
		print(root, 8, false, "");

	}

}
//1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1