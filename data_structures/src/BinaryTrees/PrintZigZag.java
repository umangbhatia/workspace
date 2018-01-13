package BinaryTrees;

import Stacks.StackUsingLL;
import queues.QueuesUsingLL;

public class PrintZigZag {
	public static void print(BinaryTree<Integer> root, boolean check) throws Exception{
		 StackUsingLL<BinaryTree<Integer>> primary = new StackUsingLL<>();
		 StackUsingLL<BinaryTree<Integer>> secondry = new StackUsingLL<>();
		 primary.push(root);
		 while(!primary.isEmpty()){
			 BinaryTree<Integer> current = primary.pop();
			 System.out.print(current.data+" ");
			 if(check){
				 if(current.left!=null){
					 secondry.push(current.left);
				 }
				 if(current.right!=null){
					 secondry.push(current.right);
				 }
			 }
			 else{
				 if(current.right!=null){
					 secondry.push(current.right);
				 }
				 if(current.left!=null){
					 secondry.push(current.left);
				 }
			 }
			 if(primary.isEmpty()){
					primary = secondry;
					secondry = new StackUsingLL<>();
					System.out.println();
					if(check){
						check = false;
					}
					else{
						check = true;
					}
				}
		 }
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BinaryTree<Integer> root = BinaryTreeUse.takeInput();
		print(root, true);

	}

}
//1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 