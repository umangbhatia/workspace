package BinaryTrees;

import java.util.ArrayList;

import data_structures.Node;
import queues.QueuesUsingLL;

public class LinkedListOfLevels {
	public static ArrayList<Node<Integer>> levels(BinaryTree<Integer> root) throws Exception{
//		int size = heightOfBinaryTree.height(root);
		ArrayList<Node<Integer>> level = new ArrayList<>();
		Node<Integer> head = new Node<Integer>(root.data);
		Node<Integer> temp = head;
		level.add(head);
//		int count = 1;
		QueuesUsingLL<BinaryTree<Integer>> primary = new QueuesUsingLL<>();
		QueuesUsingLL<BinaryTree<Integer>> secondry = new QueuesUsingLL<>();
		primary.enqueue(root);
		while(!primary.isEmpty()){
			BinaryTree<Integer> current = primary.dequeue();
			if(current.left!=null){
				if(head==null){
					head = new Node<Integer>(current.left.data);
					temp = head.next;
				}else{
					temp.data = current.left.data;
					temp = temp.next;
				}
				secondry.enqueue(current.left);
			}
			if(current.right!=null){
				secondry.enqueue(current.right);
				if(head==null){
					head = new Node<Integer>(current.right.data);
					temp = head.next;
				}else{
					temp.data = current.right.data;
					temp = temp.next;
				}
			}
			if(primary.isEmpty()){
				primary = secondry;
				secondry = new QueuesUsingLL<>();
				level.add(head);
				head = null;
				
			}
		}
		return level;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
