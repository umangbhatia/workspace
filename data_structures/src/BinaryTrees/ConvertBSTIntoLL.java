package BinaryTrees;

import java.util.LinkedList;

import data_structures.Node;

public class ConvertBSTIntoLL {

//	public static Node<BinaryTree<Integer>> convert(BinaryTree<Integer> root,Node<BinaryTree<Integer>> node, Node<BinaryTree<Integer>> nodeF) {
//		if(root!=null){
//		if(root.left==null){
//			if(node==null){
//				node = new Node<BinaryTree<Integer>>(root.left);
//				nodeF = node;
//			}else{
//				node.next.data = root.left;
//			}
//			node.next.data = root;
//			node = node.next;
//			if(root.right!=null){
//			node.next = convert(root.right, node, nodeF);
//		}else{
//			return node;
//		}	
//		}else{
//			node = convert(root.left, node, nodeF);
//		}
//		}else{
//			return null;
//		}
//		return nodeF;
//	}
	public static Node<BinaryTree<Integer>> convertAlt(BinaryTree<Integer> root){
		if(root == null){
			return null;
		}
		Node<BinaryTree<Integer>> head = new Node<BinaryTree<Integer>>(null);
		if(root.left!=null){
		head = convertAlt(root.left);
		}else{
			head = new Node<BinaryTree<Integer>>(root);
			head.next = convertAlt(root.right);
			return head;
		}
		Node<BinaryTree<Integer>> temp = head;
		while(temp.next!=null){
			temp = temp.next;
		}
		temp.next = new Node<BinaryTree<Integer>>(root);
		temp = temp.next;
		temp.next = convertAlt(root.right);
		return head;
				
		
	}
	public static void print(BinaryTree<Integer> root){
		print(root.left);
		System.out.println(root);
	}
	public static void print(Node<BinaryTree<Integer>> head){
		while(head.data.data!=-1){

			System.out.print(head.data.data+"->");
			head = head.next;
			if(head==null){
				return;
			}
		}
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BinaryTree<Integer> root = BinaryTreeUse.takeInput();
		Node<BinaryTree<Integer>> head = convertAlt(root);
		print(head);
	}

}
