package BinaryTrees;

import java.util.ArrayList;

import queues.QueuesUsingLL;

public class checkifcousins {
	
		public static boolean check(BinaryTree<Integer> root, int first, int second){
			ArrayList<BinaryTree<Integer>> firstA = PathToANode.findPath(root, first);
			ArrayList<BinaryTree<Integer>> secondA = PathToANode.findPath(root, second);
			if(firstA.size()==secondA.size()&&firstA.get(1)!=secondA.get(1)){
				return true;
			}else{
				return false;
			}


		}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BinaryTree<Integer> root = BinaryTreeUse.takeInput();
		System.out.println(check(root, 4, 6));

	}

}

