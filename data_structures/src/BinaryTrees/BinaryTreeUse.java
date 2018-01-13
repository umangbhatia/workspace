package BinaryTrees;

import java.util.Scanner;

import Trees.TreeNode;
import queues.QueuesUsingLL;

public class BinaryTreeUse {
	public static BinaryTree<Integer> takeInput() throws Exception{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter data");
		int data = s.nextInt();
		BinaryTree<Integer> root = new BinaryTree<Integer>(data);
		QueuesUsingLL<BinaryTree<Integer>> Q = new QueuesUsingLL<>();
		Q.enqueue(root);
		while(!Q.isEmpty()){
			BinaryTree<Integer> current = Q.dequeue();
			System.out.println("Enter data for left node of "+current.data);
			int leftdata = s.nextInt();
			if(leftdata!=-1){
				current.left = new BinaryTree<Integer>(leftdata);
				Q.enqueue(current.left);
			}
			System.out.println("Enter data for right node of "+current.data);
			int rightdata = s.nextInt();
			if(rightdata!=-1){
				current.right = new BinaryTree<Integer>(rightdata);
				Q.enqueue(current.right);
			}
		}
		return root;
	}
	public static void printL(BinaryTree<Integer> root) throws Exception {
		QueuesUsingLL<BinaryTree<Integer>> Q = new QueuesUsingLL<>();
		Q.enqueue(root);
		while(!Q.isEmpty()){
			BinaryTree<Integer> currentNode = Q.dequeue();
			String toBePrinted = currentNode.data+": ";
			if(currentNode.left!=null){
				toBePrinted += currentNode.left.data+", ";
				Q.enqueue(currentNode.left);
			}
			if(currentNode.right!=null){
				toBePrinted += currentNode.right.data;
				Q.enqueue(currentNode.right);
			}
			System.out.println(toBePrinted);
		}
	}

	public static void main(String[] args) throws Exception {
		BinaryTree<Integer> root = takeInput();
		printL(root);
	}
}
