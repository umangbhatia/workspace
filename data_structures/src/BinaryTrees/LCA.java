package BinaryTrees;

import javax.sound.midi.Track;

public class LCA {
	public static BinaryTree<Integer> LCA_BT(BinaryTree<Integer> root, int x, int y){
		BinaryTree<Integer> check1  = FindNode.find(root, x);
		BinaryTree<Integer> check2  = FindNode.find(root, y);
		BinaryTree<Integer> ansL = null;
		BinaryTree<Integer> ansR = null;
		if(check1==null||check2==null){
			return null;
		}
		else{
			if(root.left!=null){
			 ansL = LCA_BT(root.left, x, y);
			}
			if(root.right!=null){
				 ansR = LCA_BT(root.left, x, y);
				}
			if(ansL==null&ansR==null){
				return root;
			}
			else if(ansL!=null){
				return ansL;
			}
			else if(ansR!=null){
				return ansR;
			}
		}
		return root;
	}
	public static BinaryTree<Integer> LCA_BST(BinaryTree<Integer> root, int x, int y) {
		if(root==null){
			return null;
		}
		if(root.data>x&&root.data<y){
			return root;
		}
		else if(root.data>y){
			if(root.left!=null){
			return LCA_BST(root.left, x, y);
			}
			return null;
		}
		else{
			if(root.right!=null){
				return LCA_BST(root.right, x, y);
				}
				return null;
		}
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BinaryTree<Integer> root = BinaryTreeUse.takeInput();
		System.out.println(LCA_BST(root, 1, 7).data);

	}

}
