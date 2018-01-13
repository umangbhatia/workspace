package Trees;

import java.util.Scanner;

import Stacks.StackUsingLL;
import queues.QueuesUsingLL;

public class TreeUse {
	public static TreeNode<Integer> takeInputL() throws Exception {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter data");
		int data = s.nextInt();
		TreeNode<Integer> root = new TreeNode<Integer>(data);
		QueuesUsingLL<TreeNode<Integer>> Q = new QueuesUsingLL<>();
		Q.enqueue(root);
		while(!Q.isEmpty()){
			TreeNode<Integer> currentNode = Q.dequeue();
			System.out.println("Enter number of children of "+currentNode.data);
			int num = s.nextInt();
			for(int i=0; i<num; i++){
				System.out.println("Enter data of child"+i+" of "+currentNode.data+" node");
				data = s.nextInt();
				TreeNode<Integer> child = new TreeNode<Integer>(data);
				currentNode.children.add(child);
				Q.enqueue(child);
			}
		}
		return root;
	}
	public static void printL(TreeNode<Integer> root) throws Exception{
		QueuesUsingLL<TreeNode<Integer>> Q = new QueuesUsingLL<>();
		Q.enqueue(root);
		while(!Q.isEmpty()){
			TreeNode<Integer> currentNode = Q.dequeue();
			String toBePrinted = currentNode.data+": ";
			for(int i=0;i<currentNode.children.size();i++){
				toBePrinted+= currentNode.children.get(i).data+", ";
				Q.enqueue(currentNode.children.get(i));
			}
			System.out.println(toBePrinted);
		}
		
	}
	public static void preOrderTraversalI(TreeNode<Integer> root) throws Exception{
		TreeNode<Integer> current = root;
		StackUsingLL<TreeNode<Integer>> s = new StackUsingLL<>();
		s.push(root);
		while(!s.isEmpty()){
			current = s.pop();
			System.out.println(current.data);
			for(int i=current.children.size()-1;i>=0;i--){
				s.push(current.children.get(i));
			}
		}
	}
	public static void postOrderTraversalI(TreeNode<Integer> root){
		TreeNode<Integer> current = root;
		
	}


	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		TreeNode<Integer> root = takeInputL();
		preOrderTraversalI(root);

	}
	
}
