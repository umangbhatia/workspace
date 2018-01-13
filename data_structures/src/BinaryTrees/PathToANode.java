package BinaryTrees;

import java.util.ArrayList;

public class PathToANode {
	public static ArrayList<Integer> path(BinaryTree<Integer> root, int k, ArrayList<Integer> ans) {
		ans.add(root.data);
		if(root.data==k){
			return ans;
		}
		if(k>root.data){
			return path(root.right, k, ans);
		}
		return path(root.left, k, ans);
		
	}
	public static ArrayList<BinaryTree<Integer>> findPath(BinaryTree<Integer> root, int k){
		if(root==null){
			return null;
		}
		if(root.data==k){
			ArrayList<BinaryTree<Integer>> ans = new ArrayList<>();
			ans.add(root);
			return ans;
		}else{
			ArrayList<BinaryTree<Integer>> ans = new ArrayList<>();
			ans = findPath(root.left, k);
			if(ans!=null){
			ans.add(root);
			return ans;
			}
			ans = findPath(root.right, k);
				if(ans!=null){
					ans.add(root);
					return ans;
				}
			}
			return null;
		}
		
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BinaryTree<Integer> root = BinaryTreeUse.takeInput();
		ArrayList<BinaryTree<Integer>> ans = new ArrayList<>();
		ans = findPath(root, 4);
		for(int i=0;i<ans.size();i++){
			System.out.print(ans.get(i).data+" ");
		}

	}

}
