package BinaryTrees;

import java.util.ArrayList;

public class PrintAllNodesAtADistanceK {
	public static void print(BinaryTree<Integer> root, int k){
		if(root!=null&&k==0){
			System.out.println(root.data);
		}
		if(root==null||k<0){
			return;
		}
		print(root.left, k-1);
		print(root.right, k-1);
	}
	public static void find(BinaryTree<Integer> root, int k, int x){
		ArrayList<BinaryTree<Integer>> arr = PathToANode.findPath(root, x);
		print(arr.get(0), k);
		
		for(int i=1;i<arr.size();i++){
			if(arr.get(i).left==arr.get(i-1)){
				if(k>1){
					print(arr.get(i).right, k-2);
				}else{
					print(arr.get(i), k-1);
				}
			}else{
				if(k>1){
					print(arr.get(i).left, k-2);
				}else{
					print(arr.get(i), k-1);
				}
			}
			k--;
			if(k==0){
				return;
			}
		}
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BinaryTree<Integer> root = BinaryTreeUse.takeInput();
		find(root, 2, 2);

	}
//1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1
}
