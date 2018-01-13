package BinaryTrees;

public class PrintNodesBetweenK1AndK2 {
	public static void print(BinaryTree<Integer> root, int k1, int k2) {
		if(root==null){
			return;
		}
		if(root.data<k1){
			print(root.right, k1, k2);
		}
		if(root.data>k2){
			print(root.left, k1, k2);
		}
		if(root.data>=k1&&root.data<=k2){
			System.out.print(root.data+" ");
			if(root.data==k1){
				print(root.right, k1, k2);
			}
			if(root.data==k2){
				print(root.left, k1, k2);
			}
			if(root.data>k1&&root.data<k2){
				print(root.left, k1, k2);
				print(root.right, k1, k2);
			}
		}
		
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BinaryTree<Integer> root = BinaryTreeUse.takeInput();
		print(root, 6, 12);

	}

}
